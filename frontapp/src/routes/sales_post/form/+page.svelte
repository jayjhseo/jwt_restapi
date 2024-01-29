<div class="cnt-area w100per rel zi2">
    <div class="con w100per">
        <h1 class="title-text lh120 c222 tb f32 mb40 tac wow fadeIn" data-wow-delay="0.3s" data-wow-duration="0.6s">판매 등록</h1>
        <div class="signup-box flex fdc wow fadeIn" data-wow-delay="0.6s" data-wow-duration="0.6s">
<!--                <form th:object="${matchingForm}" method="post">-->
<!--                    <input type="hidden" th:name="${_csrf.parameterName}" th:value="${_csrf.token}" />-->
                <ul class="flex fdc g36">
                    <li>
                        <h3 class="c333 f18 tb mb16">카테고리<span class="tb cCC0000 inblock">*</span></h3>
                        <div class="select-type-2 rel">
                            <select name="" id="">
                                <option value="">모든 카테고리</option>
                                <option value="1">핸드폰</option>
                                <option value="2">테블릿</option>
                                <option value="3">노트북</option>
                                <option value="4">모니터</option>
                                <option value="5">스마트워치</option>
                                <option value="6">이어폰</option>
                            </select>
                            <span class="arrow img-box abs y-middle">
                                <img src="/img/arrow_bottom_999999.svg" alt="">
                            </span>
                        </div>
                        <div class="error-text-box wsn flex g8 mt8">
                            <span class="error-text f14 cCC0000">필수 선택 항목 입니다.</span>
                        </div>
                    </li>
                    <li>
                        <h3 class="c333 f18 tb mb16">제목<span class="tb cCC0000 inblock">*</span></h3>
                        <div class="input-type-1">
                            <input type="text" placeholder="제목">
                        </div>
                        <div class="error-text-box wsn flex g8 mt8">
                            <span class="error-text f14 cCC0000">필수 입력 항목 입니다.</span>
                        </div>
                    </li>
                    <li>
                        <h3 class="c333 f18 tb mb16">이미지<span class="tb cCC0000 inblock">*</span></h3>
                        <ul class="product-img-area flex g8">
                            <li class="file-btn">
                                <input type="file" id="product_img_btn">
                                <label for="product_img_btn" class="wh100per block rel cp">
                                    <div class="img-box w32 abs xy-middle">
                                        <img src="/img/ico_plus_333.svg" alt="">
                                    </div>
                                </label>
                            </li>
                            <li class="img-box rel">
                                <img src="/img/product_img_1_1.jpg" alt="">
                                <button class="img-box abs w20 zi2 xy-tr cp">
                                    <img src="/img/ico_point_x.svg" alt="">
                                </button>
                            </li>
                            <li class="img-box rel">
                                <img src="/img/product_img_2_1.jpg" alt="">
                                <button class="img-box abs w20 zi2 xy-tr cp">
                                    <img src="/img/ico_point_x.svg" alt="">
                                </button>
                            </li>
                        </ul>
                        <div class="error-text-box wsn flex g8 mt8">
                            <span class="error-text f14 cCC0000">필수 입력 항목 입니다.</span>
                        </div>
                    </li>
                    <li>
                        <h3 class="c333 f18 tb mb16">내용<span class="tb cCC0000 inblock">*</span></h3>
                        <div class="textarea-type-1">
                            <textarea name="" id="" placeholder="내용"></textarea>
                        </div>
                        <div class="error-text-box wsn flex g8 mt8">
                            <span class="error-text f14 cCC0000">필수 입력 항목 입니다.</span>
                        </div>
                    </li>
                    <li>
                        <ul class="flex g8">
                            <li class="w50per">
                                <h3 class="c333 f18 tb mb16">금액<span class="tb cCC0000 inblock">*</span></h3>
                                <div class="input-type-1 rel">
                                    <input type="text" placeholder="금액" style="padding-right: 24px;" id="moneyInput">
                                    <span class="abs y-middle f16 c999" style="right: 16px;">원</span>
                                </div>
                                <div class="error-text-box wsn flex g8 mt8">
                                    <span class="error-text f14 cCC0000">필수 입력 항목 입니다.</span>
                                </div>
                            </li>
                            <li class="w50per">
                                <h3 class="c333 f18 tb mb16">지역<span class="tb cCC0000 inblock">*</span></h3>
                                <div class="input-type-1">
                                    <input type="text" placeholder="지역">
                                </div>
                                <div class="error-text-box wsn flex g8 mt8">
                                    <span class="error-text f14 cCC0000">필수 입력 항목 입니다.</span>
                                </div>
                            </li>
                        </ul>
                    </li>
                    <li>
                        <h3 class="c333 f18 tb mb16">거래 유형<span class="tb cCC0000 inblock">*</span></h3>
                        <div class="flex aic g32">
                            <div class="check-text-type-3 type-2 flex aic">
                                <input type="checkbox" id="directly"/>
                                <label for="directly">
                                    <span class="text">직거래</span>
                                </label>
                            </div>
                            <div class="check-text-type-3 type-2 flex aic">
                                <input type="checkbox" id="parcel"/>
                                <label for="parcel">
                                    <span class="text">택배거래</span>
                                </label>
                            </div>
                        </div>
                        <div class="error-text-box wsn flex g8 mt8">
                            <span class="error-text f14 cCC0000">필수 입력 항목 입니다.</span>
                        </div>
                    </li>
                </ul>
                <div class="flex g8 mgc mt80 w100per" style="max-width: 360px;">
                    <input type="submit" value="저장" class="btn-type-1 w100per">
                    <a href="/" class="btn-type-1-2 w100per">취소</a>
                </div>
<!--                </form>-->
        </div>
    </div>
</div>