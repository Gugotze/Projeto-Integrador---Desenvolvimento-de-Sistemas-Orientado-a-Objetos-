document.addEventListener('DOMContentLoaded', function () {
  particleground(document.getElementById('particles'), {
      dotColor: '#8AB5EA',
      lineColor: '#8AB5EA'
  });
  var intro = document.getElementById('intro');
  intro.style.marginTop = - (intro.offsetHeight / 2)-50 + 'px';
}, false);
