<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html lang="en">

<head>
<meta charset="UTF-8">

<title>Webprog 2</title>
<meta name="title" content="Webprog 2 2016">

<meta content='width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no' name='viewport'>

<!-- favicon -->
<link rel="apple-touch-icon" sizes="57x57" href="/favicon/apple-icon-57x57.png">
<link rel="apple-touch-icon" sizes="60x60" href="/favicon/apple-icon-60x60.png">
<link rel="apple-touch-icon" sizes="72x72" href="/favicon/apple-icon-72x72.png">
<link rel="apple-touch-icon" sizes="76x76" href="/favicon/apple-icon-76x76.png">
<link rel="apple-touch-icon" sizes="114x114" href="/favicon/apple-icon-114x114.png">
<link rel="apple-touch-icon" sizes="120x120" href="/favicon/apple-icon-120x120.png">
<link rel="apple-touch-icon" sizes="144x144" href="/favicon/apple-icon-144x144.png">
<link rel="apple-touch-icon" sizes="152x152" href="/favicon/apple-icon-152x152.png">
<link rel="apple-touch-icon" sizes="180x180" href="/favicon/apple-icon-180x180.png">
<link rel="icon" type="image/png" sizes="192x192"  href="/favicon/android-icon-192x192.png">
<link rel="icon" type="image/png" sizes="32x32" href="/favicon/favicon-32x32.png">
<link rel="icon" type="image/png" sizes="96x96" href="/favicon/favicon-96x96.png">
<link rel="icon" type="image/png" sizes="16x16" href="/favicon/favicon-16x16.png">
<link rel="manifest" href="/favicon/manifest.json">
<meta name="msapplication-TileColor" content="#ffffff">
<meta name="msapplication-TileImage" content="/favicon/ms-icon-144x144.png">
<!-- Bootstrap 3.3.6 -->
<link rel="stylesheet" href="//${assetsUrl}/assets/AdminLTE-2.3.3/bootstrap/css/bootstrap.min.css">
  
<link rel="stylesheet" href="//${assetsUrl}/bower_components/font-awesome/css/font-awesome.min.css">
<!-- Theme style -->
<link href="//${assetsUrl}/assets/AdminLTE-2.3.3/dist/css/AdminLTE.min.css" rel="stylesheet" type="text/css" />
<link href="//${assetsUrl}/assets/AdminLTE-2.3.3/dist/css/skins/skin-purple-light.min.css" rel="stylesheet" type="text/css" />

<link rel="stylesheet" href="//${assetsUrl}/bower_components/PACE/themes/green/pace-theme-minimal.css">

<link href="//${assetsUrl}/bower_components/offline/themes/offline-theme-default.css" rel="stylesheet" type="text/css" />
<link href="//${assetsUrl}/bower_components/offline/themes/offline-language-english.css" rel="stylesheet" type="text/css" />
<link href="//${assetsUrl}/bower_components/offline/themes/offline-language-english-indicator.css" rel="stylesheet" type="text/css" />

<link href="//${assetsUrl}/bower_components/growl/stylesheets/jquery.growl.css" rel="stylesheet" type="text/css" />

<link rel="stylesheet" href="//${assetsUrl}/bower_components/jquery-ui/themes/cupertino/jquery-ui.min.css">

<link rel="stylesheet" type="text/css" href="//${assetsUrl}/assets/css/app.css">

<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
<script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
<script src="https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js"></script>
<![endif]-->
<link rel="stylesheet" href="//${assetsUrl}/bower_components/fullcalendar/dist/fullcalendar.min.css">
<style type="text/css">
.fc-toolbar {
  margin-bottom: 0px !important;
}
.fc-view-container {
	margin: 5px 7px 0px;
}
</style>
<link rel="stylesheet" href="//${assetsUrl}/bower_components/select2/select2.css">
<link rel="stylesheet" href="//${assetsUrl}/bower_components/select2-bootstrap-css/select2-bootstrap.min.css">
</head>

<body class="skin-purple-light sidebar-mini">  
<div class="wrapper">

<header class="main-header">
    <!-- Logo -->
    <a href="//${baseUrl}/home" class="logo">
        <!-- mini logo for sidebar mini 50x50 pixels -->
        <span class="logo-mini">
            W2
        </span>
        <!-- logo for regular state and mobile devices -->
        <span class="logo-lg">
            Webprog 2
        </span>
    </a>

    <!-- Header Navbar: style can be found in header.less -->
    <nav class="navbar navbar-static-top" role="navigation">
        <!-- Sidebar toggle button-->
        <a href="#" class="sidebar-toggle" data-toggle="offcanvas" role="button">
        <span class="sr-only">Toggle navigation</span>
        </a>
        <div class="navbar-custom-menu">
            <ul class="nav navbar-nav">
                                <!-- User Account: style can be found in dropdown.less -->
                <li class="dropdown user user-menu">
                    <a href="#">
                    <!-- <img src="//${baseUrl}/dist/img/user2-160x160.jpg" class="user-image" alt="User Image"/> -->
                    <span class="hidden-xs"><i class="fa fa-user"></i>&nbsp;<b>Hi guest!</b></span>
                    </a>
                    <ul class="dropdown-menu">
                        <!-- User image -->
                        <li class="user-header" style="height: initial;">
                            <!-- <img src="//${baseUrl}/dist/img/user2-160x160.jpg" class="img-circle" alt="User Image" /> -->
                            <p>
                            1222665 <br/> gentest@iium.edu.my
                            </p>
                        </li>
                        <!-- Menu Footer-->
                        <li class="user-footer">
                                                        <div class="pull-right">
                                <a href="//${baseUrl}/logout" class="btn btn-default btn-flat">Sign out</a>
                            </div>
                        </li>
                    </ul>
                </li>
            </ul>
        </div>
    </nav>
</header>
<!-- Left side column. contains the logo and sidebar -->
<aside class="main-sidebar">
  <!-- sidebar: style can be found in sidebar.less -->
  <section class="sidebar">
    
    <!-- sidebar menu: : style can be found in sidebar.less -->
    <ul class="sidebar-menu">
            <li class=active>
          <a href=/home >
          <i class="fa fa-calendar"></i> 
          <span>Events</span> 
          </a>
      </li>    
              </ul>
  </section>
  <!-- /.sidebar -->
</aside>
<!-- Content Wrapper. Contains page content -->
<div class="content-wrapper">
  <!-- Main content -->
  <section class="content">
      <div class="row">
  <section class="content-header" style="padding-bottom:1.5%">
          <h1>Events</h1>
          <ol class="breadcrumb">
            <li><a href="home"><i class="fa fa-calendar"></i></a></li>
          </ol>
  </section>
</div>
<div class='row'>
  <br>
    <div class="col-md-10">
               <!-- Calendar -->
              <div class="box box-solid">
                <div class="box-body no-padding box-shadow">
                  <!--The calendar -->
<div id="calendar" style="width: 100%"></div>                </div><!-- /.box-body -->
    </div><!-- /.col -->
</div><!-- row -->

<div class="modal fade" id="modalCalendar" tabindex="-1" role="dialog" aria-labelledby="modalTitle">
  <div class="modal-dialog" role="document">

    <div class="modal-content">
      <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
          <h4 class="modal-title" id="modalTitle">Title</h4>
      </div>
     
      <div class="modal-body" id="modalBody">
            <input type="hidden" name="id" id="id">
            <div class="control-group has-error" id="error" style="display: none">
                <label class="control-label">Please fill in the form properly!</label>
            </div>
            
            <div class="row">
              <div class="form-group col-md-6 col-sm-12">
                  <label>Start Date</label>                    
                  <input type="text" name="start" id="display-start" class="form-control default-start-datepicker" data-datepicker-for="modal-calendar" placeholder="Start Date" disabled>
              </div>
              <div class="form-group col-md-6 col-sm-12">
                  <label>End Date</label>                    
                  <input type="text" name="end" id="display-end" class="form-control default-end-datepicker" data-datepicker-for="modal-calendar" placeholder="End Date" disabled>
              </div>
            </div>

            <div class="form-group">
                <label>Title</label>                    
                <input type="text" name="title" id="title" class="form-control" placeholder="Title" disabled>
            </div>

            </div>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-info" data-dismiss="modal">Close</button>
      </div>
      
    </div>
  </div>
</div>   </section><!-- /.content -->
</div><!-- /.content-wrapper -->

<footer class="main-footer noprint">
	<!-- Default to the left -->
	<strong>Webprog 2</a>
</footer>
</div><!-- ./wrapper -->

<script src="//${assetsUrl}/assets/AdminLTE-2.3.3/plugins/jQuery/jQuery-2.2.0.min.js"></script>
<script src="//${assetsUrl}/assets/AdminLTE-2.3.3/plugins/jQueryUI/jquery-ui.min.js"></script>
<script src="//${assetsUrl}/assets/AdminLTE-2.3.3/bootstrap/js/bootstrap.min.js"></script>

<!-- AdminLTE App -->
<script src="//${assetsUrl}/assets/AdminLTE-2.3.3/dist/js/app.min.js"></script>

<script src="//${assetsUrl}/assets/AdminLTE-2.3.3/plugins/pace/pace.min.js"></script>

<script src="//${assetsUrl}/bower_components/growl/javascripts/jquery.growl.js"></script>

<script src="//${assetsUrl}/bower_components/moment/min/moment.min.js"></script>

<script src="//${assetsUrl}/bower_components/offline/offline.min.js"></script>

<script src="//${assetsUrl}/assets/js/app.js"></script>


<script type="text/javascript" src="//${assetsUrl}/bower_components/select2/select2.min.js"></script>

<script src="//${assetsUrl}/bower_components/fullcalendar/dist/fullcalendar.min.js"></script>
<!-- <script type="text/javascript" src="/build/calendar.js"></script> -->
<script type="text/javascript">

var DISPLAY_DATE_FORMAT = 'dddd, DD MMM YYYY';
var JSON_DATE_FORMAT = 'YYYY-MM-DD';
var tempEventObj;

function setModalDate(startDate, endDate) {
  var displayStartDate, displayEndDate, jsonStartDate, jsonEndDate;

  displayStartDate = moment(startDate).format(DISPLAY_DATE_FORMAT)
  jsonStartDate = moment(startDate).format(JSON_DATE_FORMAT);

  if(endDate != null) {
    displayEndDate = moment(endDate).format(DISPLAY_DATE_FORMAT);
    jsonEndDate = moment(endDate).format(JSON_DATE_FORMAT);
  }
  else {
    displayEndDate = displayStartDate;
    jsonEndDate = jsonStartDate;
  }

  $('#display-start').val(displayStartDate);
  $('#display-end').val(displayEndDate);
}

function clearModal() {
  $('#id, #title, #desc, #display-start, #display-end, #start, #end').val('');
  $('#error').css({'display': 'none'})
}

$(document).ready(function() {
  $.ajaxSetup({
    headers: {
      'X-CSRF-TOKEN': $('meta[name="csrf-token"]').attr('content')
    }
  });
  
  $('#calendar').fullCalendar({
    displayEventTime: false,
    allDay: true,
    events: '//${baseUrl}/events?json=true',
    dayClick: function(date, jsEvent, view) {
	  return;
    },
    eventClick: function(calItem, jsEvent, view) {
      tempEventObj = calItem;
      setModalDate(calItem.start, calItem.end);

      $('#modalTitle').text('Event');
      $('#id').val(calItem.id);
      $('#title').val(calItem.title);
      $('#modalCalendar').modal('show');
    },
    eventMouseover: function() {
      $(this).css({'cursor': 'pointer'});
    },
    
    header: {
      right: 'home today prev,next',
    }                                 
  });
});
</script></body>
</html>