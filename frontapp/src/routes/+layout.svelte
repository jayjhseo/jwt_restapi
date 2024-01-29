<header class="header-area w100per bfff fixed zi5 xy-tl">
    <div class="con wh100per">
        <div class="header-box-1 w100per flex aic jcsb h70">
            <div class="left-box flex aic g40">
                <a href="/" class="logo-box img-box">
                    <img src="/img/logo.svg" alt="">
                </a>
                <div class="flex fdc g8" style="width: 480px;">
                    <div class="search-type-1 w100per rel">
                        <input type="search" placeholder="검색어를 입력해 주세요.">
                        <button class="search-btn img-box abs y-middle">
                            <img src="/img/ico_search_222.svg" alt="">
                        </button>
                    </div>
                </div>
            </div>
            <div class="right-box flex aic cg24">
                <ul class="sub-menu-box flex aic cg12">
                    <li>
                        <a href="/login" class="c333 f14 tm test">로그인</a>
                    </li>
                    <li>
                        <a href="/signup" class="c333 f14 tm">회원가입</a>
                    </li>
<!--                    <li sec:authorize="isAuthenticated()" th:if="${@rq.member.rating == 1 or @rq.member.rating == 3 or @rq.member.rating == 4}">-->
<!--                        <a th:href="@{/user/mypage}" class="c999 f16">내 정보</a>-->
<!--                    </li>-->
<!--                    <li sec:authorize="isAuthenticated()" th:if="${@rq.member.rating == 1 or @rq.member.rating == 3 or @rq.member.rating == 4}">-->
<!--                        <a th:href="@{/team/team_list}" class="c999 f16">팀 정보</a>-->
<!--                    </li>-->
<!--                    <li sec:authorize="isAuthenticated()">-->
<!--                        <a th:href="@{/matching/history}" class="c999 f16">매칭 내역</a>-->
<!--                    </li>-->
<!--                    <li sec:authorize="isAuthenticated()" th:if="${@rq.member.rating == 1 or @rq.member.rating == 3 or @rq.member.rating == 4}">-->
<!--                        <a th:href="@{/wishlist}" class="c999 f16">위시리스트</a>-->
<!--                    </li>-->
<!--                    <li sec:authorize="isAuthenticated()">-->
<!--                        <a th:href="@{/user/logout}" class="c999 f16">로그아웃</a>-->
<!--                    </li>-->
                </ul>
<!--                <div sec:authorize="isAuthenticated()" class="user-name-box flex aic jcc f16 tm c777">-->
<!--                    <span class="img-box w28 mr8">-->
<!--                        <img th:if="${@rq.profileImgUrl != null}" th:src="@{|/gen${@rq.profileImgUrl}|}" alt="Profile Image">-->
<!--                        <img th:unless="${@rq.profileImgUrl != null}" th:src="@{/img/user_img.svg}" alt="Default Image">-->
<!--                    </span>-->
<!--                    <div th:if="${@rq.member.rating == 1 or @rq.member.rating == 3 or @rq.member.rating == 4}" class="flex aic g4">-->
<!--                        <span class="c333 tb" th:text="${@rq.member.name}"></span>-->
<!--                        <span class="c999">님</span>-->
<!--                    </div>-->
<!--                </div>-->
            </div>
        </div>
        <div class="header-box-2 w100per h50 flex aic jcsb">
            <div class="left-box flex aic g120">
                <ul class="menu-box flex aic g32 c222 f16">
                    <li>
                        <a href="" class="tm">카테고리</a>
                    </li>
                    <li>
                        <a href="" class="tm">카테고리</a>
                    </li>
                    <li>
                        <a href="" class="tm">카테고리</a>
                    </li>
                    <li>
                        <a href="" class="tm">카테고리</a>
                    </li>
                </ul>
            </div>
            <div class="right-box">
                <div class="search-swiper-box h20 rel zi1" style="width: 180px;">
                    <div class="search-swiper swiper">
                        <div class="swiper-wrapper">
                            <div class="swiper-slide" style="justify-content: space-between; align-items: center; cursor: pointer;">
                                <div class="flex g8">
                                    <span class="num c222 tb f14">1</span>
                                    <span class="text c555 tm f14">에어팟</span>
                                </div>
                                <span class="f12 cED220D">▲</span>
                            </div>
                            <div class="swiper-slide" style="justify-content: space-between; align-items: center; cursor: pointer;">
                                <div class="flex g8">
                                    <span class="num c222 tb f14">2</span>
                                    <span class="text c555 tm f14">아이폰 14 pro</span>
                                </div>
                                <span class="f12 c0076BA">▼</span>
                            </div>
                            <div class="swiper-slide" style="justify-content: space-between; align-items: center; cursor: pointer;">
                                <div class="flex g8">
                                    <span class="num c222 tb f14">3</span>
                                    <span class="text c555 tm f14">플립5</span>
                                </div>
                                <span class="f12 c0076BA">▼</span>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</header>
<slot />
<footer class="footer-area w100per rel bfafafa zi1 mt100">
    <div class="con flex aic jcc bsb pt60 pb60">
            <span class="logo-box img-box">
                <img src="/img/logo.svg" alt="로고">
            </span>
    </div>
</footer>