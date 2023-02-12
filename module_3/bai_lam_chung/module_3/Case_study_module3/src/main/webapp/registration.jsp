<%--
  Created by IntelliJ IDEA.
  User: USER
  Date: 10/02/2023
  Time: 4:06 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
    <link rel="stylesheet" href="/css/style.css">
    <link rel="stylesheet" href="/css/bootstrap.css">
    <link rel="stylesheet" href="/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.1/css/all.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
    <style>
        * {
            box-sizing: border-box;
        }

        body {
            /*background-image: url("/img/bg.jpeg");*/
            margin: 0;
            padding: 0;
            line-height: normal !important;
            font-size: 16px;
            font-family: -webkit-pictograph;
            font-weight: 400;
            -webkit-font-smoothing: antialiased;
            -webkit-text-size-adjust: 100%;
        }

        #header-nav {
            /*background-image: url();*/
            background-size: cover;
            background-repeat: no-repeat;
        }

        .c-item {
            height: 600px;
        }

        .c-img {
            height: 100%;
            /*object-fit: cover;*/
            filter: brightness(0.6);
        }

        .col-center {
            margin: 0 auto;
            float: none !important;
        }

        .container .carousel {
            margin: 50px auto;
            padding: 0 70px;
        }

        .container .carousel-item {
            color: #999;
            font-size: 14px;
            text-align: center;
            overflow: hidden;
            min-height: 290px;
        }

        .container .carousel .item .img-box {
            width: 135px;
            height: 135px;
            margin: 0 auto;
            padding: 5px;
            border: 1px solid #ddd;
            border-radius: 50%;
        }

        .container .carousel .img-box img {
            width: 100%;
            height: 100%;
            display: block;
            border-radius: 50%;
        }

        .container .carousel .testimonial {
            padding: 30px 0 10px;
        }

        .container .carousel .overview {
            font-style: italic;
        }

        .container .carousel .overview b {
            text-transform: uppercase;
            color: #db584e;
        }

        .container .carousel .carousel-control {
            width: 40px;
            height: 40px;
            margin-top: -20px;
            top: 50%;
            background: none;
        }

        .container .carousel-control i {
            font-size: 68px;
            line-height: 42px;
            position: absolute;
            display: inline-block;
            color: rgba(0, 0, 0, 0.8);
            text-shadow: 0 3px 3px #e6e6e6, 0 0 0 #000;
        }

        .container .carousel .carousel-indicators {
            bottom: -40px;
        }

        .container .carousel-indicators li, .carousel-indicators li.active {
            width: 10px;
            height: 10px;
            margin: 1px 3px;
            border-radius: 50%;
        }

        .container .carousel-indicators li {
            background: #999;
            border-color: transparent;
            box-shadow: inset 0 2px 1px rgba(0, 0, 0, 0.2);
        }

        .container .carousel-indicators li.active {
            background: #555;
            box-shadow: inset 0 2px 1px rgba(0, 0, 0, 0.2);
        }
        footer {
            background: #101010;
            padding: 86px 0;
        }
        .single-content {
            text-align: center;
            padding: 115px 0;
        }
        .single-box p {
            color: #fff;
            line-height: 1.9;
        }
        .single-box h3 {
            font-size: 16px;
            font-weight: 700;
            color: #fff;
        }
        .single-box .card-area i {
            color: #ffffff;
            font-size: 20px;
            margin-right: 10px;
        }
        .single-box ul {
            list-style: none;
            padding: 0;
        }
        .single-box ul li a {
            text-decoration: none;
            color: #fff;
            line-height: 2.5;
            font-weight: 100;
        }
        .single-box h2 {
            color: #fff;
            font-size: 20px;
            font-weight: 700;
        }
        #basic-addon2 {
            background: #fe1e4f;
            color: #fff;
        }
        .socials i {
            font-size: 18px;
            margin-right: 15px;
        }
        @media (max-width: 767px) {
            .single-box {
                margin-bottom: 50px;
            }
        }
        @media (min-width: 768px) and (max-width: 991px) {
            .single-box {
                margin-bottom: 50px;
            }
        }
    </style>
</head>
<body>
<header>
    <div class="container-fluid">
        <div class="row">
            <nav class="navbar navbar-expand-lg navbar-light bg-dark" id="header-nav">
                <div class="container-fluid">
                    <a class="navbar-brand" href="#"><img src="/img/logo.png" alt=""
                                                          style="width: 80px;height: 60px"></a>
                    <button class="navbar-toggler" type="button" data-bs-toggle="collapse"
                            data-bs-target="#navbarScroll" aria-controls="navbarScroll" aria-expanded="false"
                            aria-label="Toggle navigation">
                        <span class="navbar-toggler-icon"></span>
                    </button>
                    <div class="collapse navbar-collapse" id="navbarScroll">
                        <ul class="navbar-nav me-auto my-2 my-lg-0 navbar-nav-scroll"
                            style="--bs-scroll-height: 100px;">
                            <li class="nav-item">
                                <a class="nav-link active text-white" aria-current="page" href="#">Trang chủ</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link active text-white" aria-current="page" href="#">Sản phẩm</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link active text-white" aria-current="page" href="#">Chi tiết</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link active text-white" aria-current="page" href="#">Liên hệ</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link active text-white" aria-current="page" href="#">Đăng ký</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link active text-white" aria-current="page" href="login.jsp">Đăng nhập</a>
                            </li>
                        </ul>
                        <form class="d-flex" style="margin-top: 16px; margin-right: 10px">
                            <input class="form-control me-2" type="search" placeholder="Tìm kiếm" aria-label="Search">
                            <button class="btn btn-outline-warning" type="submit" style="width: 136px">Tìm kiếm</button>
                        </form>
                    </div>
                </div>
            </nav>
        </div>
    </div>
</header>
<div class="row" style="margin: 0px;padding: 0px">
    <div id="hero-carousel" class="carousel slide" data-bs-ride="carousel">
        <div class="carousel-indicators">
            <button type="button" data-bs-target="#hero-carousel" data-bs-slide-to="0" class="active"
                    aria-current="true" aria-label="Slide 1"></button>
            <button type="button" data-bs-target="#hero-carousel" data-bs-slide-to="1" aria-label="Slide 2"></button>
            <button type="button" data-bs-target="#hero-carousel" data-bs-slide-to="2" aria-label="Slide 3"></button>
        </div>
        <div class="carousel-inner">
            <div class="carousel-item active c-item">
                <img src="/img/1.jpg" class="d-block w-100 c-img" alt="Slide 1">
            </div>
            <div class="carousel-item c-item">
                <img src="/img/2.jpg" class="d-block w-100 c-img" alt="Slide 2">
            </div>
            <div class="carousel-item c-item">
                <img src="img/3.jpg" class="d-block w-100 c-img" alt="Slide 3">
            </div>
        </div>
        <button class="carousel-control-prev" type="button" data-bs-target="#hero-carousel" data-bs-slide="prev">
            <span class="carousel-control-prev-icon" aria-hidden="true"></span>
            <span class="visually-hidden">Previous</span>
        </button>
        <button class="carousel-control-next" type="button" data-bs-target="#hero-carousel" data-bs-slide="next">
            <span class="carousel-control-next-icon" aria-hidden="true"></span>
            <span class="visually-hidden">Next</span>
        </button>
    </div>
</div>
<section class="vh-100" style="background-color: #eee;">
    <div class="container h-100">
        <div class="row d-flex justify-content-center align-items-center h-100">
            <div class="col-lg-12 col-xl-11">
                <div class="card text-black" style="border-radius: 25px;">
                    <div class="card-body p-md-5">
                        <div class="row justify-content-center">
                            <div class="col-md-10 col-lg-6 col-xl-5 order-2 order-lg-1">
                                <p class="text-center h1 fw-bold mb-5 mx-1 mx-md-4 mt-4">Đăng ký</p>
                                <form class="mx-1 mx-md-4">
                                    <div class="d-flex flex-row align-items-center mb-4">
                                        <i class="fas fa-user fa-lg me-3 fa-fw"></i>
                                        <div class="form-outline flex-fill mb-0">
                                            <input placeholder="Tên đăng nhập" type="text" id="form3Example1c" class="form-control" />
                                        </div>
                                    </div>

                                    <div class="d-flex flex-row align-items-center mb-4">
                                        <i class="fas fa-envelope fa-lg me-3 fa-fw"></i>
                                        <div class="form-outline flex-fill mb-0">
                                            <input placeholder="Email" type="email" id="form3Example3c" class="form-control" />
                                        </div>
                                    </div>

                                    <div class="d-flex flex-row align-items-center mb-4">
                                        <i class="fas fa-lock fa-lg me-3 fa-fw"></i>
                                        <div class="form-outline flex-fill mb-0">
                                            <input placeholder="Mật khẩu" type="password" id="form3Example4c" class="form-control" />
                                        </div>
                                    </div>

                                    <div class="d-flex flex-row align-items-center mb-4">
                                        <i class="fas fa-key fa-lg me-3 fa-fw"></i>
                                        <div class="form-outline flex-fill mb-0">
                                            <input placeholder="Nhập lại mật khẩu" type="password" id="form3Example4cd" class="form-control" />
                                        </div>
                                    </div>

                                    <div class="form-check d-flex justify-content-center mb-5">
                                        <input class="form-check-input me-2" type="checkbox" value="" id="form2Example3c" />
                                        <label class="form-check-label" >
                                            Tôi đồng ý tất cả các yêu cầu <a href="#!">Điều khoản dịch vụ</a>
                                        </label>
                                    </div>

                                    <div class="d-flex justify-content-center mx-4 mb-3 mb-lg-4">
                                        <button type="button" class="btn btn-primary btn-lg">Đăng ký</button>
                                    </div>

                                </form>

                            </div>
                            <div class="col-md-10 col-lg-6 col-xl-7 d-flex align-items-center order-1 order-lg-2">

                                <img src="/img/nhom1.png"
                                     class="img-fluid" alt="Sample image">

                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</section>
<div class="row px-xl-5 pb-3" style="margin: 0px;padding: 0px">
    <div class="container pt-5">
        <div class="col-12 col-center m-auto">
            <h2 style="color: #333; text-align: center;text-transform: uppercase;font-family: 'Noto Sans', sans-serif;font-weight: bold;position: relative;margin: 30px 0 10px;">
                Người sử dụng website</h2>
            <hr style="height: 3px; width: 30%; margin: 0 auto;" class="bg-warning">
            <div id="myCarousel" class="carousel slide" data-ride="carousel">
                <!-- Carousel -->
                <div class="carousel-inner">
                    <div class="item carousel-item active">
                        <div class="img-box"><img src="/img/nd1.jpg" alt=""></div>
                        <p class="testimonial">Bia đỉnh, giao hàng nhanh</p>
                        <p class="overview"><b>Phan Văn Đồng</b>, Quảng Trị</p>
                    </div>
                    <div class="item carousel-item">
                        <div class="img-box"><img src="/img/nd2.jpg" alt=""></div>
                        <p class="testimonial">Bia đỉnh, giao hàng nhanh</p>
                        <p class="overview"><b>Lê Văn Phát Đạt</b>, Huế</p>
                    </div>
                    <div class="item carousel-item">
                        <div class="img-box"><img src="/img/nd3.jpg" alt=""></div>
                        <p class="testimonial">Bia đỉnh, giao hàng nhanh</p>
                        <p class="overview"><b>Dương Minh Trường</b>, Đà Nẵng</p>
                    </div>
                </div>
                <!-- Carousel Controls -->
                <a class="carousel-control left carousel-control-prev" href="#myCarousel" data-slide="prev">
                    <i class="fa fa-angle-left"></i>
                </a>
                <a class="carousel-control right carousel-control-next" href="#myCarousel" data-slide="next">
                    <i class="fa fa-angle-right"></i>
                </a>
            </div>
        </div>
    </div>
</div>
<footer>
    <div class="container">
        <div class="row" style="margin: 0px;padding: 0px">
            <div class="col-lg-3 col-sm-6">
                <div class="single-box">
                    <img src="img/logo.png" alt="" height="60" width="60">
                    <p>Đăng kí nhận thông tin ưu đãi hàng tuần của chúng tôi để kịp thời tham gia các chương trình hấp dẫn. </p>
                    <h3>We Accect</h3>
                </div>
            </div>
            <div class="col-lg-3 col-sm-6">
                <div class="single-box">
                    <h2>Văn phòng</h2>
                    <ul>
                        <li><a href="#">Codegym Đà Nẵng</a></li>
                        <li><a href="#">Số điện thoại: 1900 2237</a></li>
                        <li><a href="#">Email: info@vuabia.com</a></li>
                        <li><a href="#">C1022G1</a></li>
                    </ul>
                </div>
            </div>
            <div class="col-lg-3 col-sm-6">
                <div class="single-box">
                    <h2>Thông tin liên lạc</h2>
                    <ul>
                        <li><a href="#">Nguyễn Lê Văn Khải</a></li>
                        <li><a href="#">Thái Quang Trường</a></li>
                        <li><a href="#">Trần Thuận Kỳ</a></li>
                        <li><a href="#">0702750320</a></li>
                        <li><a href="#">khainguyenlevan@gmail.com</a></li>
                        <li><a href="#">Trường Sơn, Cẩm Lệ, Đà Nẵng</a></li>
                    </ul>
                </div>
            </div>
            <div class="col-lg-3 col-sm-6">
                <div class="single-box">
                    <h2>Đăng ký nhận tin khuyến mãi</h2>
                    <p>Vui lòng nhập email | hoặc số điện thoại | hoặc Facebook của bạn tại ô dưới đây:</p>
                    <div class="input-group mb-3">
                        <input type="text" class="form-control" placeholder="Vui lòng nhập" aria-label="Enter your Email ..." aria-describedby="basic-addon2">
                        <span class="input-group-text" id="basic-addon2"><i class="fa fa-check"></i></span>
                    </div>
                    <h2>Follow us on</h2>
                </div>
            </div>
        </div>
    </div>
</footer>
<script defer src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-u1OknCvxWvY5kfmNBILK2hRnQC3Pr17a+RTT6rIHI7NnikvbZlHgTPOOmMi466C8"
        crossorigin="anonymous"></script>
</body>
</html>