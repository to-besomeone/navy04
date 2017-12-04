navy04.apk 를 다운받아 이용해 주십시오.
======




1  Web 개발자 매뉴얼
===============
*********

### 1. HTML
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
- @media screen and (max-width: "__nnn__"px)
<pre><code> * 화면이 nnn픽셀보다 작아지면 밑의 코드들을 실행함.
 * 스크린의 크기에 따라 변동되는 화면을 조정하기 위한 코드로, 반응형 웹을 만드는 데 이용됨. </code></pre>
 - slick-prev & slick-next
 <pre><code> * 애니메이션 함수를 시행하는 화살표 이미지.
 * 코드 내용은 화살표들의 위치를 담고 있음. </code></pre>

### 3. JS(Java Script)
- fadeIn(__second__)
<pre><code> * 이미지가 들어올 때 페이드 되는 시간 조절
 * 100이 1초. </code></pre>
- fadeOut(__second__)
<pre><code> * 이미지가 나갈 때 페이드 되는 시간 조절.
 * 100이 1초. </code></pre>
### 4. 사양
- 대부분 브라우저에서 작동

2  App 개발자 매뉴얼
  ========
  ********
### 1. 사양
- Nougat 7.0 이상부터 지원

### 2. xml
- windowBackground(value/style.xml)
<pre><code> 로딩화면 이미지 지정 </code></pre>
- string.xml
<pre><code> AlertDialog의 목록을 구성 </code></pre>
- my_gridview.xml
<pre><code> * 그리드뷰의 모양 지정
 * 이미지와 텍스트가 같은 칸에 들어가도록 지정 </code></pre>
 - activity_dialogfor_select.xml
 <pre><code> * 주제별을 제외한 나머지(언론사별, 설정)에 들어가는 Dialogue를 만듦.
 * customAlertdialog 와는 다르게 버튼 형식으로 들어감.
 * 이미지 등록도 가능 (설정에 구현) </code></pre>
### 3. Java
- DialogforSelect.java
<pre><code> WindowManager.LayoutParams lpWindow_inf = new WindowManager.LayoutParams();
        lpWindow_inf.flags = WindowManager.LayoutParams.FLAG_DIM_BEHIND;
        lpWindow_inf.dimAmount = 0.8f;
        getWindow().setAttributes(lpWindow_inf);

 Dialogue 외부화면 흐리게 설정</code></pre>

 - Dialog onCreateDialog(/MainActivity.java)
 <pre><code> AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setTitle(“주제“);
        builder.setItems(R.array.genre, new DialogInterface.OnClickListener() {
          .
          .
          .
          .
        });
      return builder.create();
  }
 customAlertdialog 생성 </code></pre>

- SplashActivity (/SplashActivity.java)
<pre><code>    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

       try{
            Thread.sleep(3000); //로딩화면 뜨는 시간 (1000 = 1초)
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        startActivity(new Intent(this,MainActivity.class));
        finish();
    }

    로딩화면 시간 설정 </code></pre>

### 4. manifests
- Icon (roundIcon) : 앱의 아이콘 설정
 <!-- splash activity -->
       *
        <activity>
            android:name=“.SplashActivity”
            android:screenOrientation=“portrait”
            android:theme=“@style/SplashTheme”>
            <intent-filter>
                <action android:name=“android.intent.action.MAIN” />

               <category android:name=“android.intent.category.LAUNCHER” />
            </intent-filter>
        </activity>

        * 로딩화면 구현을 위해 추가되어야 할 코드
</code>
