function senhalivro() {
  var senha = document.getElementById("senha").value;
  if (senha == "f290ti") {
    window.location.href = "../pages/cadastro-livros.php";
  } else var elems = document.getElementsByClassName("senhaerrada");
  for (var i = 0; i < elems.length; i += 1) {
    elems[i].style.display = "inline-block";
  }
}

function senhaAluno() {
  var senha2 = document.getElementById("senha2").value;
  if (senha2 == "f290ti") {
    window.location.href = "../pages/cadastro-alunos.php";
  } else var elems = document.getElementsByClassName("senhaerrada");
  for (var i = 0; i < elems.length; i += 1) {
    elems[i].style.display = "inline-block";
  }
}


function openmodallivro() {
  $("#exampleModal").modal();

  setTimeout(ismodalopen, 1000);

  if ((ismodalopen = true)) {
    document.addEventListener("keyup", function(event) {
      if (event.keyCode == 13) {
        senhalivro();
      }
    });
  }
}

function openmodalaluno() {
  $("#exampleModal2").modal();

  setTimeout(ismodal2open, 1000);

  if ((ismodal2open = true)) {
    document.addEventListener("keyup", function(event) {
      if (event.keyCode == 13) {
        senhaAluno();
      }
    });
  }
}



function ismodalopen(ismodalopen) {
  return $("#exampleModal")
    .hasClass("show")
    .test(ismodalopen);
}

function ismodal2open(ismodal2open) {
  if ($("#exampleModal2").hasClass("show")) {
    return ismodal2open;
  } else {
  }
}




$(window, document, undefined).ready(function() {
  $("input").blur(function() {
    var $this = $(this);
    if ($this.val()) $this.addClass("used");
    else $this.removeClass("used");
  });

  var $ripples = $(".ripples");

  $ripples.on("click.Ripples", function(e) {
    var $this = $(this);
    var $offset = $this.parent().offset();
    var $circle = $this.find(".ripplesCircle");

    var x = e.pageX - $offset.left;
    var y = e.pageY - $offset.top;

    $circle.css({
      top: y + "px",
      left: x + "px"
    });

    $this.addClass("is-active");
  });

  $ripples.on(
    "animationend webkitAnimationEnd mozAnimationEnd oanimationend MSAnimationEnd",
    function(e) {
      $(this).removeClass("is-active");
    }
  );
});

document.addEventListener("keyup", function(event) {
  if (event.keyCode == 9) {
    CPF();
  }
});

function CPF() {
  var v = document.getElementById("cpf").value;
  var vnew;
  vnew = v.replace(/(\d{3})(\d{3})(\d{3})(\d{2})/g, "$1.$2.$3-$4");

  document.getElementById("cpf").value = vnew;
}
