1  Web 개발자 매뉴얼
===============
*********

### 1. HTML
***
#### 1. < meta name = "viewport" > tag
- 모바일 화면 최적화 코드

#### 2. class
- slide-container
<pre><code> 슬라이드 되는 사진들 전체를 담는 가장 큰 div </code></pre>
- wrapper
<pre><code> 슬라이드 되는 사진들을 각각 개별로 담는 div </code></pre>
- clash-card "__name__"
<pre><code> 이미지들을 감싸고 있으며 실제로 슬라이드 함수가 작동하는 div </code></pre>
- clash-card __image clash-card__image--"__name__"
<pre><code> * 카드뉴스 이미지
 * "name"에 들어가는 이름이 css에서 불러올 이미지들의 이름.</code></pre>

### 2. CSS
***
- @media screen and (max-width: "__nnn__"px)
<pre><code> * 화면이 nnn픽셀보다 작아지면 밑의 코드들을 실행함.
 * 스크린의 크기에 따라 변동되는 화면을 조정하기 위한 코드로, 반응형 웹을 만드는 데 이용됨. </code></pre>
 - slick-prev & slick-next
 <pre><code> * 애니메이션 함수를 시행하는 화살표 이미지.
 * 코드 내용은 화살표들의 위치를 담고 있음. </code></pre>

### 3. JS(Java Script)
***
- fadeIn(__second__)
<pre><code> * 이미지가 들어올 때 페이드 되는 시간 조절
 * 100이 1초. </code></pre>
- fadeOut(__second__)
<pre><code> * 이미지가 나갈 때 페이드 되는 시간 조절.
 * 100이 1초. </code></pre>

  2  App 개발자 매뉴얼
  ========
  ********
