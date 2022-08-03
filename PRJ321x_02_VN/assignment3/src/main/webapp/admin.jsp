<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="css/admin.css">
    <link rel="stylesheet" href="https://maxst.icons8.com/vue-static/landings/line-awesome/line-awesome/1.3.0/css/line-awesome.min.css">
    <title>Admin</title>
</head>
<body>
	<input type="checkbox" id="nav-toggle">
    <div class="slidebar">
        <div class="slidebar-brand">
            <h2><span class="lab la-google-drive"></span> <span>HOAITHANH</span></h2>
        </div>
        <div class="slidebar-menu">
            <ul>
                <li>
                    <a href="#" class="active"><span class="las la-igloo"></span>
                        <span>Dashboard</span></a>
                </li>
                <li>
                    <a href="#"><span class="las la-users"></span>
                        <span>Customers</span></a>
                </li>
                <li>
                    <a href="#"><span class="las la-clipboard-list"></span>
                        <span>Projects</span></a>
                </li>
                <li>
                    <a href="#"><span class="las la-shopping-bag"></span>
                        <span>Orders</span></a>
                </li>
                <li>
                    <a href="#"><span class="las la-receipt"></span>
                        <span>Inventory</span></a>
                </li>
                <li>
                    <a href="#"><span class="las la-user-circle"></span>
                        <span>Account</span></a>
                </li>
                <li>
                    <a href="#"><span class="las la-clipboard-list"></span>
                        <span>Tasks</span></a>
                </li>
            </ul>
        </div>
    </div>

    <div class="main-content">
        <header>
            <h2>
                <label for="nav-toggle">
                    <span class="las la-bars"></span>
                </label>
                Dashboard
            </h2>
            <div class="search-wrapper">
                <span class="las la-search"></span>
                <input type="search" placeholder="Search here">
            </div>
            <div class="user-wrapper">
                <img src="img/cat-logo.png" width="50px" height="50px" alt="">
                <div>
                    <h4>Dr.Delirium</h4>
                    <small>Supper admin</small>
                </div>
            </div>
        </header>

        <main>
            <div class="cards">
                <div class="card-single">
                    <div>
                        <h1>77</h1>
                        <span>Customers</span>
                    </div>
                    <div>
                        <span class="las la-users"></span>
                    </div>
                </div>
                <div class="card-single">
                    <div>
                        <h1>79</h1>
                        <span>Projects</span>
                    </div>
                    <div>
                        <span class="las la-clipboard-list"></span>
                    </div>
                </div>
                <div class="card-single">
                    <div>
                        <h1>666</h1>
                        <span>Orders</span>
                    </div>
                    <div>
                        <span class="las la-shopping-bag"></span>
                    </div>
                </div>
                <div class="card-single">
                    <div>
                        <h1>$37k</h1>
                        <span>Income</span>
                    </div>
                    <div>
                        <span class="lab la-google-wallet"></span>
                    </div>
                </div>
            </div>

            <div class="recent-grid">
                <div class="projects">
                    <div class="card">
                        <div class="card-header">
                            <h3>Recent Projects</h3>
                            <button>See all <span class="las la-arrow-right"></span></button>
                        </div>
                        <div class="card-body">
                            <div class="table-responsive">
                                <table width="100%">
                                <thead>
                                    <tr>
                                        <td>Project title</td>
                                        <td>Department</td>
                                        <td>Status</td>
                                    </tr>
                                </thead>
                                <tbody>
                                    <tr>
                                        <td>UI/UX Design</td>
                                        <td>UI Team</td>
                                        <td><span class="status">review</span></td>
                                    </tr>
                                    <tr>
                                        <td>Web Development</td>
                                        <td>Frontend</td>
                                        <td><span class="status">in progress</span></td>
                                    </tr>
                                    <tr>
                                        <td>Ushop app</td>
                                        <td>Mobile Team</td>
                                        <td><span class="status">pending</span></td>
                                    </tr>
                                    <tr>
                                        <td>UI/UX Design</td>
                                        <td>UI Team</td>
                                        <td><span class="status">review</span></td>
                                    </tr>
                                    <tr>
                                        <td>Web Development</td>
                                        <td>Frontend</td>
                                        <td><span class="status">in progress</span></td>
                                    </tr>
                                    <tr>
                                        <td>Ushop app</td>
                                        <td>Mobile Team</td>
                                        <td><span class="status">pending</span></td>
                                    </tr>
                                    <tr>
                                        <td>UI/UX Design</td>
                                        <td>UI Team</td>
                                        <td><span class="status">review</span></td>
                                    </tr>
                                    <tr>
                                        <td>Web Development</td>
                                        <td>Frontend</td>
                                        <td><span class="status">in progress</span></td>
                                    </tr>
                                    <tr>
                                        <td>Ushop app</td>
                                        <td>Mobile Team</td>
                                        <td><span class="status pink">pending</span></td>
                                    </tr>
                                </tbody>
                            </table>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="customers">
                    <div class="card">
                        <div class="card-header">
                            <h3>New customer</h3>
                            <button>See all <span class="las la-arrow-right"></span></button>
                        </div>
                        <div class="card-body">
                            <div class="customer">
                                <div class="info">
                                    <img src="img/cat-logo.png" width="40px" height="40px" alt="">
                                    <div>
                                        <h4>Dr.Delirium</h4>
                                        <small>CEO Excerpt</small>
                                    </div>
                                </div>
                                <div class="contact">
                                    <span class="las la-user-circle"></span>
                                    <span class="las la-comment"></span>
                                    <span class="las la-phone"></span>
                                </div>
                            </div>
                            

                            <div class="customer">
                                <div class="info">
                                    <img src="img/cat-logo.png" width="40px" height="40px" alt="">
                                    <div>
                                        <h4>Dr.Delirium</h4>
                                        <small>CEO Excerpt</small>
                                    </div>
                                </div>
                                <div class="contact">
                                    <span class="las la-user-circle"></span>
                                    <span class="las la-comment"></span>
                                    <span class="las la-phone"></span>
                                </div>
                            </div>

                            <div class="customer">
                                <div class="info">
                                    <img src="img/cat-logo.png" width="40px" height="40px" alt="">
                                    <div>
                                        <h4>Dr.Delirium</h4>
                                        <small>CEO Excerpt</small>
                                    </div>
                                </div>
                                <div class="contact">
                                    <span class="las la-user-circle"></span>
                                    <span class="las la-comment"></span>
                                    <span class="las la-phone"></span>
                                </div>
                            </div>

                            <div class="customer">
                                <div class="info">
                                    <img src="img/cat-logo.png" width="40px" height="40px" alt="">
                                    <div>
                                        <h4>Dr.Delirium</h4>
                                        <small>CEO Excerpt</small>
                                    </div>
                                </div>
                                <div class="contact">
                                    <span class="las la-user-circle"></span>
                                    <span class="las la-comment"></span>
                                    <span class="las la-phone"></span>
                                </div>
                            </div>

                            <div class="customer">
                                <div class="info">
                                    <img src="img/cat-logo.png" width="40px" height="40px" alt="">
                                    <div>
                                        <h4>Dr.Delirium</h4>
                                        <small>CEO Excerpt</small>
                                    </div>
                                </div>
                                <div class="contact">
                                    <span class="las la-user-circle"></span>
                                    <span class="las la-comment"></span>
                                    <span class="las la-phone"></span>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>

        </main>
    </div>
</body>
</html>