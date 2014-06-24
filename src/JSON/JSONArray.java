




<!DOCTYPE html>
<html class="   ">
  <head prefix="og: http://ogp.me/ns# fb: http://ogp.me/ns/fb# object: http://ogp.me/ns/object# article: http://ogp.me/ns/article# profile: http://ogp.me/ns/profile#">
    <meta charset='utf-8'>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    
    
    <title>JSON-java/JSONArray.java at master · douglascrockford/JSON-java</title>
    <link rel="search" type="application/opensearchdescription+xml" href="/opensearch.xml" title="GitHub" />
    <link rel="fluid-icon" href="https://github.com/fluidicon.png" title="GitHub" />
    <link rel="apple-touch-icon" sizes="57x57" href="/apple-touch-icon-114.png" />
    <link rel="apple-touch-icon" sizes="114x114" href="/apple-touch-icon-114.png" />
    <link rel="apple-touch-icon" sizes="72x72" href="/apple-touch-icon-144.png" />
    <link rel="apple-touch-icon" sizes="144x144" href="/apple-touch-icon-144.png" />
    <meta property="fb:app_id" content="1401488693436528"/>

      <meta content="@github" name="twitter:site" /><meta content="summary" name="twitter:card" /><meta content="douglascrockford/JSON-java" name="twitter:title" /><meta content="JSON-java - A reference implementation of a JSON package in Java." name="twitter:description" /><meta content="https://avatars0.githubusercontent.com/u/262641?s=400" name="twitter:image:src" />
<meta content="GitHub" property="og:site_name" /><meta content="object" property="og:type" /><meta content="https://avatars0.githubusercontent.com/u/262641?s=400" property="og:image" /><meta content="douglascrockford/JSON-java" property="og:title" /><meta content="https://github.com/douglascrockford/JSON-java" property="og:url" /><meta content="JSON-java - A reference implementation of a JSON package in Java." property="og:description" />

    <link rel="assets" href="https://assets-cdn.github.com/">
    <link rel="conduit-xhr" href="https://ghconduit.com:25035">
    <link rel="xhr-socket" href="/_sockets" />

    <meta name="msapplication-TileImage" content="/windows-tile.png" />
    <meta name="msapplication-TileColor" content="#ffffff" />
    <meta name="selected-link" value="repo_source" data-pjax-transient />
      <meta name="google-analytics" content="UA-3769691-2">

    <meta content="collector.githubapp.com" name="octolytics-host" /><meta content="collector-cdn.github.com" name="octolytics-script-host" /><meta content="github" name="octolytics-app-id" /><meta content="18DACEC9:4018:1478D812:53A8DD79" name="octolytics-dimension-request_id" /><meta content="1551615" name="octolytics-actor-id" /><meta content="bigmacmccoy" name="octolytics-actor-login" /><meta content="74097fa7f03ef65e999eb97a400f88380c087a3d67e8e84a8a0792f52307487a" name="octolytics-actor-hash" />
    

    
    
    <link rel="icon" type="image/x-icon" href="https://assets-cdn.github.com/favicon.ico" />


    <meta content="authenticity_token" name="csrf-param" />
<meta content="fEJIBYO7K0f2Aj4i8H2FyyfLdoB41bMBvytenayBEYeJcCDydAFLFrkMcMYJVUw4GwIYjiFYFwBwIKhhb7l0Fg==" name="csrf-token" />

    <link href="https://assets-cdn.github.com/assets/github-38e184196414b8b76b95e8a86f017df0f46ae71e.css" media="all" rel="stylesheet" type="text/css" />
    <link href="https://assets-cdn.github.com/assets/github2-56a4b5fe77cda9c841a8bc19ebf8edd02bb3b0ea.css" media="all" rel="stylesheet" type="text/css" />
    


    <meta http-equiv="x-pjax-version" content="b6052cc0aafadbf8a42a64c495c3d258">

      
  <meta name="description" content="JSON-java - A reference implementation of a JSON package in Java." />


  <meta content="262641" name="octolytics-dimension-user_id" /><meta content="douglascrockford" name="octolytics-dimension-user_login" /><meta content="1187853" name="octolytics-dimension-repository_id" /><meta content="douglascrockford/JSON-java" name="octolytics-dimension-repository_nwo" /><meta content="true" name="octolytics-dimension-repository_public" /><meta content="false" name="octolytics-dimension-repository_is_fork" /><meta content="1187853" name="octolytics-dimension-repository_network_root_id" /><meta content="douglascrockford/JSON-java" name="octolytics-dimension-repository_network_root_nwo" />
  <link href="https://github.com/douglascrockford/JSON-java/commits/master.atom" rel="alternate" title="Recent Commits to JSON-java:master" type="application/atom+xml" />

  </head>


  <body class="logged_in  env-production windows vis-public page-blob">
    <a href="#start-of-content" tabindex="1" class="accessibility-aid js-skip-to-content">Skip to content</a>
    <div class="wrapper">
      
      
      
      


      <div class="header header-logged-in true">
  <div class="container clearfix">

    <a class="header-logo-invertocat" href="https://github.com/" aria-label="Homepage">
  <span class="mega-octicon octicon-mark-github"></span>
</a>


    
    <a href="/notifications" aria-label="You have no unread notifications" class="notification-indicator tooltipped tooltipped-s" data-hotkey="g n">
        <span class="mail-status all-read"></span>
</a>

      <div class="command-bar js-command-bar  in-repository">
          <form accept-charset="UTF-8" action="/search" class="command-bar-form" id="top_search_form" method="get">

<div class="commandbar">
  <span class="message"></span>
  <input type="text" data-hotkey="s" name="q" id="js-command-bar-field" placeholder="Search or type a command" tabindex="1" autocapitalize="off"
    
    data-username="bigmacmccoy"
      data-repo="douglascrockford/JSON-java"
      data-branch="master"
      data-sha="63f7d61506f4e1cdea5a08098ed45c3f75f26236"
  >
  <div class="display hidden"></div>
</div>

    <input type="hidden" name="nwo" value="douglascrockford/JSON-java" />

    <div class="select-menu js-menu-container js-select-menu search-context-select-menu">
      <span class="minibutton select-menu-button js-menu-target" role="button" aria-haspopup="true">
        <span class="js-select-button">This repository</span>
      </span>

      <div class="select-menu-modal-holder js-menu-content js-navigation-container" aria-hidden="true">
        <div class="select-menu-modal">

          <div class="select-menu-item js-navigation-item js-this-repository-navigation-item selected">
            <span class="select-menu-item-icon octicon octicon-check"></span>
            <input type="radio" class="js-search-this-repository" name="search_target" value="repository" checked="checked" />
            <div class="select-menu-item-text js-select-button-text">This repository</div>
          </div> <!-- /.select-menu-item -->

          <div class="select-menu-item js-navigation-item js-all-repositories-navigation-item">
            <span class="select-menu-item-icon octicon octicon-check"></span>
            <input type="radio" name="search_target" value="global" />
            <div class="select-menu-item-text js-select-button-text">All repositories</div>
          </div> <!-- /.select-menu-item -->

        </div>
      </div>
    </div>

  <span class="help tooltipped tooltipped-s" aria-label="Show command bar help">
    <span class="octicon octicon-question"></span>
  </span>


  <input type="hidden" name="ref" value="cmdform">

</form>
        <ul class="top-nav">
          <li class="explore"><a href="/explore">Explore</a></li>
            <li><a href="https://gist.github.com">Gist</a></li>
            <li><a href="/blog">Blog</a></li>
          <li><a href="https://help.github.com">Help</a></li>
        </ul>
      </div>

    


  <ul id="user-links">
    <li>
      <a href="/bigmacmccoy" class="name">
        <img alt="Braedon Big Mac McCoy" class=" js-avatar" data-user="1551615" height="20" src="https://avatars0.githubusercontent.com/u/1551615?s=140" width="20" /> bigmacmccoy
      </a>
    </li>

    <li class="new-menu dropdown-toggle js-menu-container">
      <a href="#" class="js-menu-target tooltipped tooltipped-s" aria-label="Create new...">
        <span class="octicon octicon-plus"></span>
        <span class="dropdown-arrow"></span>
      </a>

      <div class="new-menu-content js-menu-content">
      </div>
    </li>

    <li>
      <a href="/settings/profile" id="account_settings"
        class="tooltipped tooltipped-s"
        aria-label="Account settings ">
        <span class="octicon octicon-tools"></span>
      </a>
    </li>
    <li>
      <form class="logout-form" action="/logout" method="post">
        <button class="sign-out-button tooltipped tooltipped-s" aria-label="Sign out">
          <span class="octicon octicon-sign-out"></span>
        </button>
      </form>
    </li>

  </ul>

<div class="js-new-dropdown-contents hidden">
  

<ul class="dropdown-menu">
  <li>
    <a href="/new"><span class="octicon octicon-repo"></span> New repository</a>
  </li>
  <li>
    <a href="/organizations/new"><span class="octicon octicon-organization"></span> New organization</a>
  </li>


</ul>

</div>


    
  </div>
</div>

      

        



      <div id="start-of-content" class="accessibility-aid"></div>
          <div class="site" itemscope itemtype="http://schema.org/WebPage">
    <div id="js-flash-container">
      
    </div>
    <div class="pagehead repohead instapaper_ignore readability-menu">
      <div class="container">
        

<ul class="pagehead-actions">

    <li class="subscription">
      <form accept-charset="UTF-8" action="/notifications/subscribe" class="js-social-container" data-autosubmit="true" data-remote="true" method="post"><div style="margin:0;padding:0;display:inline"><input name="authenticity_token" type="hidden" value="FWj43ahk7ma+hSQP6kgUmXK36pTuvhj80yHuNJnQG+8qHi9ouH4YyuXR6kIPemvGpmiX8EiYspdlnin1xEJfqA==" /></div>  <input id="repository_id" name="repository_id" type="hidden" value="1187853" />

    <div class="select-menu js-menu-container js-select-menu">
      <a class="social-count js-social-count" href="/douglascrockford/JSON-java/watchers">
        157
      </a>
      <span class="minibutton select-menu-button with-count js-menu-target" role="button" tabindex="0" aria-haspopup="true">
        <span class="js-select-button">
          <span class="octicon octicon-eye"></span>
          Watch
        </span>
      </span>

      <div class="select-menu-modal-holder">
        <div class="select-menu-modal subscription-menu-modal js-menu-content" aria-hidden="true">
          <div class="select-menu-header">
            <span class="select-menu-title">Notification status</span>
            <span class="octicon octicon-x js-menu-close"></span>
          </div> <!-- /.select-menu-header -->

          <div class="select-menu-list js-navigation-container" role="menu">

            <div class="select-menu-item js-navigation-item selected" role="menuitem" tabindex="0">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <div class="select-menu-item-text">
                <input checked="checked" id="do_included" name="do" type="radio" value="included" />
                <h4>Not watching</h4>
                <span class="description">You only receive notifications for conversations in which you participate or are @mentioned.</span>
                <span class="js-select-button-text hidden-select-button-text">
                  <span class="octicon octicon-eye"></span>
                  Watch
                </span>
              </div>
            </div> <!-- /.select-menu-item -->

            <div class="select-menu-item js-navigation-item " role="menuitem" tabindex="0">
              <span class="select-menu-item-icon octicon octicon octicon-check"></span>
              <div class="select-menu-item-text">
                <input id="do_subscribed" name="do" type="radio" value="subscribed" />
                <h4>Watching</h4>
                <span class="description">You receive notifications for all conversations in this repository.</span>
                <span class="js-select-button-text hidden-select-button-text">
                  <span class="octicon octicon-eye"></span>
                  Unwatch
                </span>
              </div>
            </div> <!-- /.select-menu-item -->

            <div class="select-menu-item js-navigation-item " role="menuitem" tabindex="0">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <div class="select-menu-item-text">
                <input id="do_ignore" name="do" type="radio" value="ignore" />
                <h4>Ignoring</h4>
                <span class="description">You do not receive any notifications for conversations in this repository.</span>
                <span class="js-select-button-text hidden-select-button-text">
                  <span class="octicon octicon-mute"></span>
                  Stop ignoring
                </span>
              </div>
            </div> <!-- /.select-menu-item -->

          </div> <!-- /.select-menu-list -->

        </div> <!-- /.select-menu-modal -->
      </div> <!-- /.select-menu-modal-holder -->
    </div> <!-- /.select-menu -->

</form>
    </li>

  <li>
    

  <div class="js-toggler-container js-social-container starring-container ">

    <form accept-charset="UTF-8" action="/douglascrockford/JSON-java/unstar" class="js-toggler-form starred" data-remote="true" method="post"><div style="margin:0;padding:0;display:inline"><input name="authenticity_token" type="hidden" value="cLiBISOiq7spHMMfOliY2kdNOkvWon9ZYO2ibVVh30eAS8yRDFxWlEE2ot/wE3JRy+2YazVMmGimvXPWKocKmA==" /></div>
      <button
        class="minibutton with-count js-toggler-target star-button"
        aria-label="Unstar this repository" title="Unstar douglascrockford/JSON-java">
        <span class="octicon octicon-star"></span>
        Unstar
      </button>
        <a class="social-count js-social-count" href="/douglascrockford/JSON-java/stargazers">
          1,135
        </a>
</form>
    <form accept-charset="UTF-8" action="/douglascrockford/JSON-java/star" class="js-toggler-form unstarred" data-remote="true" method="post"><div style="margin:0;padding:0;display:inline"><input name="authenticity_token" type="hidden" value="i0W0n29yBtfF0LiwZmNH0LNJhYaEup1iu7L0dIGNzXGt/kFP9+WHufkl8Ajq1AWWWCUhCx8SF7LoLXRUmdsh5g==" /></div>
      <button
        class="minibutton with-count js-toggler-target star-button"
        aria-label="Star this repository" title="Star douglascrockford/JSON-java">
        <span class="octicon octicon-star"></span>
        Star
      </button>
        <a class="social-count js-social-count" href="/douglascrockford/JSON-java/stargazers">
          1,135
        </a>
</form>  </div>

  </li>


        <li>
          <a href="/douglascrockford/JSON-java/fork" class="minibutton with-count js-toggler-target fork-button lighter tooltipped-n" title="Fork your own copy of douglascrockford/JSON-java to your account" aria-label="Fork your own copy of douglascrockford/JSON-java to your account" rel="facebox nofollow">
            <span class="octicon octicon-repo-forked"></span>
            Fork
          </a>
          <a href="/douglascrockford/JSON-java/network" class="social-count">1,123</a>
        </li>

</ul>

        <h1 itemscope itemtype="http://data-vocabulary.org/Breadcrumb" class="entry-title public">
          <span class="repo-label"><span>public</span></span>
          <span class="mega-octicon octicon-repo"></span>
          <span class="author"><a href="/douglascrockford" class="url fn" itemprop="url" rel="author"><span itemprop="title">douglascrockford</span></a></span><!--
       --><span class="path-divider">/</span><!--
       --><strong><a href="/douglascrockford/JSON-java" class="js-current-repository js-repo-home-link">JSON-java</a></strong>

          <span class="page-context-loader">
            <img alt="" height="16" src="https://assets-cdn.github.com/images/spinners/octocat-spinner-32.gif" width="16" />
          </span>

        </h1>
      </div><!-- /.container -->
    </div><!-- /.repohead -->

    <div class="container">
      <div class="repository-with-sidebar repo-container new-discussion-timeline js-new-discussion-timeline  ">
        <div class="repository-sidebar clearfix">
            

<div class="sunken-menu vertical-right repo-nav js-repo-nav js-repository-container-pjax js-octicon-loaders">
  <div class="sunken-menu-contents">
    <ul class="sunken-menu-group">
      <li class="tooltipped tooltipped-w" aria-label="Code">
        <a href="/douglascrockford/JSON-java" aria-label="Code" class="selected js-selected-navigation-item sunken-menu-item" data-hotkey="g c" data-pjax="true" data-selected-links="repo_source repo_downloads repo_commits repo_releases repo_tags repo_branches /douglascrockford/JSON-java">
          <span class="octicon octicon-code"></span> <span class="full-word">Code</span>
          <img alt="" class="mini-loader" height="16" src="https://assets-cdn.github.com/images/spinners/octocat-spinner-32.gif" width="16" />
</a>      </li>


      <li class="tooltipped tooltipped-w" aria-label="Pull Requests">
        <a href="/douglascrockford/JSON-java/pulls" aria-label="Pull Requests" class="js-selected-navigation-item sunken-menu-item js-disable-pjax" data-hotkey="g p" data-selected-links="repo_pulls /douglascrockford/JSON-java/pulls">
            <span class="octicon octicon-git-pull-request"></span> <span class="full-word">Pull Requests</span>
            <span class='counter'>3</span>
            <img alt="" class="mini-loader" height="16" src="https://assets-cdn.github.com/images/spinners/octocat-spinner-32.gif" width="16" />
</a>      </li>


        <li class="tooltipped tooltipped-w" aria-label="Wiki">
          <a href="/douglascrockford/JSON-java/wiki" aria-label="Wiki" class="js-selected-navigation-item sunken-menu-item js-disable-pjax" data-hotkey="g w" data-selected-links="repo_wiki /douglascrockford/JSON-java/wiki">
            <span class="octicon octicon-book"></span> <span class="full-word">Wiki</span>
            <img alt="" class="mini-loader" height="16" src="https://assets-cdn.github.com/images/spinners/octocat-spinner-32.gif" width="16" />
</a>        </li>
    </ul>
    <div class="sunken-menu-separator"></div>
    <ul class="sunken-menu-group">

      <li class="tooltipped tooltipped-w" aria-label="Pulse">
        <a href="/douglascrockford/JSON-java/pulse" aria-label="Pulse" class="js-selected-navigation-item sunken-menu-item" data-pjax="true" data-selected-links="pulse /douglascrockford/JSON-java/pulse">
          <span class="octicon octicon-pulse"></span> <span class="full-word">Pulse</span>
          <img alt="" class="mini-loader" height="16" src="https://assets-cdn.github.com/images/spinners/octocat-spinner-32.gif" width="16" />
</a>      </li>

      <li class="tooltipped tooltipped-w" aria-label="Graphs">
        <a href="/douglascrockford/JSON-java/graphs" aria-label="Graphs" class="js-selected-navigation-item sunken-menu-item" data-pjax="true" data-selected-links="repo_graphs repo_contributors /douglascrockford/JSON-java/graphs">
          <span class="octicon octicon-graph"></span> <span class="full-word">Graphs</span>
          <img alt="" class="mini-loader" height="16" src="https://assets-cdn.github.com/images/spinners/octocat-spinner-32.gif" width="16" />
</a>      </li>

      <li class="tooltipped tooltipped-w" aria-label="Network">
        <a href="/douglascrockford/JSON-java/network" aria-label="Network" class="js-selected-navigation-item sunken-menu-item js-disable-pjax" data-selected-links="repo_network /douglascrockford/JSON-java/network">
          <span class="octicon octicon-repo-forked"></span> <span class="full-word">Network</span>
          <img alt="" class="mini-loader" height="16" src="https://assets-cdn.github.com/images/spinners/octocat-spinner-32.gif" width="16" />
</a>      </li>
    </ul>


  </div>
</div>

              <div class="only-with-full-nav">
                

  

<div class="clone-url open"
  data-protocol-type="http"
  data-url="/users/set_protocol?protocol_selector=http&amp;protocol_type=clone">
  <h3><strong>HTTPS</strong> clone URL</h3>
  <div class="clone-url-box">
    <input type="text" class="clone js-url-field"
           value="https://github.com/douglascrockford/JSON-java.git" readonly="readonly">
    <span class="url-box-clippy">
    <button aria-label="copy to clipboard" class="js-zeroclipboard minibutton zeroclipboard-button" data-clipboard-text="https://github.com/douglascrockford/JSON-java.git" data-copied-hint="copied!" type="button"><span class="octicon octicon-clippy"></span></button>
    </span>
  </div>
</div>

  

<div class="clone-url "
  data-protocol-type="ssh"
  data-url="/users/set_protocol?protocol_selector=ssh&amp;protocol_type=clone">
  <h3><strong>SSH</strong> clone URL</h3>
  <div class="clone-url-box">
    <input type="text" class="clone js-url-field"
           value="git@github.com:douglascrockford/JSON-java.git" readonly="readonly">
    <span class="url-box-clippy">
    <button aria-label="copy to clipboard" class="js-zeroclipboard minibutton zeroclipboard-button" data-clipboard-text="git@github.com:douglascrockford/JSON-java.git" data-copied-hint="copied!" type="button"><span class="octicon octicon-clippy"></span></button>
    </span>
  </div>
</div>

  

<div class="clone-url "
  data-protocol-type="subversion"
  data-url="/users/set_protocol?protocol_selector=subversion&amp;protocol_type=clone">
  <h3><strong>Subversion</strong> checkout URL</h3>
  <div class="clone-url-box">
    <input type="text" class="clone js-url-field"
           value="https://github.com/douglascrockford/JSON-java" readonly="readonly">
    <span class="url-box-clippy">
    <button aria-label="copy to clipboard" class="js-zeroclipboard minibutton zeroclipboard-button" data-clipboard-text="https://github.com/douglascrockford/JSON-java" data-copied-hint="copied!" type="button"><span class="octicon octicon-clippy"></span></button>
    </span>
  </div>
</div>


<p class="clone-options">You can clone with
      <a href="#" class="js-clone-selector" data-protocol="http">HTTPS</a>,
      <a href="#" class="js-clone-selector" data-protocol="ssh">SSH</a>,
      or <a href="#" class="js-clone-selector" data-protocol="subversion">Subversion</a>.
  <a href="https://help.github.com/articles/which-remote-url-should-i-use" class="help tooltipped tooltipped-n" aria-label="Get help on which URL is right for you.">
    <span class="octicon octicon-question"></span>
  </a>
</p>


  <a href="github-windows://openRepo/https://github.com/douglascrockford/JSON-java" class="minibutton sidebar-button" title="Save douglascrockford/JSON-java to your computer and use it in GitHub Desktop." aria-label="Save douglascrockford/JSON-java to your computer and use it in GitHub Desktop.">
    <span class="octicon octicon-device-desktop"></span>
    Clone in Desktop
  </a>

                <a href="/douglascrockford/JSON-java/archive/master.zip"
                   class="minibutton sidebar-button"
                   aria-label="Download douglascrockford/JSON-java as a zip file"
                   title="Download douglascrockford/JSON-java as a zip file"
                   rel="nofollow">
                  <span class="octicon octicon-cloud-download"></span>
                  Download ZIP
                </a>
              </div>
        </div><!-- /.repository-sidebar -->

        <div id="js-repo-pjax-container" class="repository-content context-loader-container" data-pjax-container>
          


<a href="/douglascrockford/JSON-java/blob/8114b976ce7224ff3b89f3d7e53f4207b7dcdf4f/JSONArray.java" class="hidden js-permalink-shortcut" data-hotkey="y">Permalink</a>

<!-- blob contrib key: blob_contributors:v21:88327779486d5e97feb92a32e84bdb04 -->

<p title="This is a placeholder element" class="js-history-link-replace hidden"></p>

<div class="file-navigation">
  

<div class="select-menu js-menu-container js-select-menu" >
  <span class="minibutton select-menu-button js-menu-target css-truncate" data-hotkey="w"
    data-master-branch="master"
    data-ref="master"
    title="master"
    role="button" aria-label="Switch branches or tags" tabindex="0" aria-haspopup="true">
    <span class="octicon octicon-git-branch"></span>
    <i>branch:</i>
    <span class="js-select-button css-truncate-target">master</span>
  </span>

  <div class="select-menu-modal-holder js-menu-content js-navigation-container" data-pjax aria-hidden="true">

    <div class="select-menu-modal">
      <div class="select-menu-header">
        <span class="select-menu-title">Switch branches/tags</span>
        <span class="octicon octicon-x js-menu-close"></span>
      </div> <!-- /.select-menu-header -->

      <div class="select-menu-filters">
        <div class="select-menu-text-filter">
          <input type="text" aria-label="Filter branches/tags" id="context-commitish-filter-field" class="js-filterable-field js-navigation-enable" placeholder="Filter branches/tags">
        </div>
        <div class="select-menu-tabs">
          <ul>
            <li class="select-menu-tab">
              <a href="#" data-tab-filter="branches" class="js-select-menu-tab">Branches</a>
            </li>
            <li class="select-menu-tab">
              <a href="#" data-tab-filter="tags" class="js-select-menu-tab">Tags</a>
            </li>
          </ul>
        </div><!-- /.select-menu-tabs -->
      </div><!-- /.select-menu-filters -->

      <div class="select-menu-list select-menu-tab-bucket js-select-menu-tab-bucket" data-tab-filter="branches">

        <div data-filterable-for="context-commitish-filter-field" data-filterable-type="substring">


            <div class="select-menu-item js-navigation-item selected">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/douglascrockford/JSON-java/blob/master/JSONArray.java"
                 data-name="master"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text css-truncate-target"
                 title="master">master</a>
            </div> <!-- /.select-menu-item -->
        </div>

          <div class="select-menu-no-results">Nothing to show</div>
      </div> <!-- /.select-menu-list -->

      <div class="select-menu-list select-menu-tab-bucket js-select-menu-tab-bucket" data-tab-filter="tags">
        <div data-filterable-for="context-commitish-filter-field" data-filterable-type="substring">


        </div>

        <div class="select-menu-no-results">Nothing to show</div>
      </div> <!-- /.select-menu-list -->

    </div> <!-- /.select-menu-modal -->
  </div> <!-- /.select-menu-modal-holder -->
</div> <!-- /.select-menu -->

  <div class="button-group right">
    <a href="/douglascrockford/JSON-java/find/master"
          class="js-show-file-finder minibutton empty-icon tooltipped tooltipped-s"
          data-pjax
          data-hotkey="t"
          aria-label="Quickly jump between files">
      <span class="octicon octicon-list-unordered"></span>
    </a>
    <button class="js-zeroclipboard minibutton zeroclipboard-button"
          data-clipboard-text="JSONArray.java"
          aria-label="Copy to clipboard"
          data-copied-hint="Copied!">
      <span class="octicon octicon-clippy"></span>
    </button>
  </div>

  <div class="breadcrumb">
    <span class='repo-root js-repo-root'><span itemscope="" itemtype="http://data-vocabulary.org/Breadcrumb"><a href="/douglascrockford/JSON-java" data-branch="master" data-direction="back" data-pjax="true" itemscope="url"><span itemprop="title">JSON-java</span></a></span></span><span class="separator"> / </span><strong class="final-path">JSONArray.java</strong>
  </div>
</div>


  <div class="commit file-history-tease">
    <img alt="Douglas Crockford" class="main-avatar js-avatar" data-user="262641" height="24" src="https://avatars3.githubusercontent.com/u/262641?s=140" width="24" />
    <span class="author"><a href="/douglascrockford" rel="author">douglascrockford</a></span>
    <local-time datetime="2014-05-05T15:09:32-07:00" from="now" title-format="%Y-%m-%d %H:%M:%S %z" title="2014-05-05 15:09:32 -0700">May 05, 2014</local-time>
    <div class="commit-title">
        <a href="/douglascrockford/JSON-java/commit/a9a07623834b6da2c2c3d47b440e002dedfd9e17" class="message" data-pjax="true" title="Java 1.8.">Java 1.8.</a>
    </div>

    <div class="participation">
      <p class="quickstat"><a href="#blob_contributors_box" rel="facebox"><strong>1</strong>  contributor</a></p>
      
    </div>
    <div id="blob_contributors_box" style="display:none">
      <h2 class="facebox-header">Users who have contributed to this file</h2>
      <ul class="facebox-user-list">
          <li class="facebox-user-list-item">
            <img alt="Douglas Crockford" class=" js-avatar" data-user="262641" height="24" src="https://avatars3.githubusercontent.com/u/262641?s=140" width="24" />
            <a href="/douglascrockford">douglascrockford</a>
          </li>
      </ul>
    </div>
  </div>

<div class="file-box">
  <div class="file">
    <div class="meta clearfix">
      <div class="info file-name">
        <span class="icon"><b class="octicon octicon-file-text"></b></span>
        <span class="mode" title="File Mode">file</span>
        <span class="meta-divider"></span>
          <span>978 lines (916 sloc)</span>
          <span class="meta-divider"></span>
        <span>32.193 kb</span>
      </div>
      <div class="actions">
        <div class="button-group">
            <a class="minibutton tooltipped tooltipped-w"
               href="github-windows://openRepo/https://github.com/douglascrockford/JSON-java?branch=master&amp;filepath=JSONArray.java" aria-label="Open this file in GitHub for Windows">
                <span class="octicon octicon-device-desktop"></span> Open
            </a>
                <a class="minibutton tooltipped tooltipped-n js-update-url-with-hash"
                   aria-label="Clicking this button will automatically fork this project so you can edit the file"
                   href="/douglascrockford/JSON-java/edit/master/JSONArray.java"
                   data-method="post" rel="nofollow">Edit</a>
          <a href="/douglascrockford/JSON-java/raw/master/JSONArray.java" class="minibutton " id="raw-url">Raw</a>
            <a href="/douglascrockford/JSON-java/blame/master/JSONArray.java" class="minibutton js-update-url-with-hash">Blame</a>
          <a href="/douglascrockford/JSON-java/commits/master/JSONArray.java" class="minibutton " rel="nofollow">History</a>
        </div><!-- /.button-group -->

            <a class="minibutton danger empty-icon tooltipped tooltipped-s"
               href="/douglascrockford/JSON-java/delete/master/JSONArray.java"
               aria-label="Fork this project and delete file"
               data-method="post" data-test-id="delete-blob-file" rel="nofollow">

          Delete
        </a>
      </div><!-- /.actions -->
    </div>
      
  <div class="blob-wrapper data type-java js-blob-data">
       <table class="file-code file-diff tab-size-8">
         <tr class="file-code-line">
           <td class="blob-line-nums">
             <span id="L1" rel="#L1">1</span>
<span id="L2" rel="#L2">2</span>
<span id="L3" rel="#L3">3</span>
<span id="L4" rel="#L4">4</span>
<span id="L5" rel="#L5">5</span>
<span id="L6" rel="#L6">6</span>
<span id="L7" rel="#L7">7</span>
<span id="L8" rel="#L8">8</span>
<span id="L9" rel="#L9">9</span>
<span id="L10" rel="#L10">10</span>
<span id="L11" rel="#L11">11</span>
<span id="L12" rel="#L12">12</span>
<span id="L13" rel="#L13">13</span>
<span id="L14" rel="#L14">14</span>
<span id="L15" rel="#L15">15</span>
<span id="L16" rel="#L16">16</span>
<span id="L17" rel="#L17">17</span>
<span id="L18" rel="#L18">18</span>
<span id="L19" rel="#L19">19</span>
<span id="L20" rel="#L20">20</span>
<span id="L21" rel="#L21">21</span>
<span id="L22" rel="#L22">22</span>
<span id="L23" rel="#L23">23</span>
<span id="L24" rel="#L24">24</span>
<span id="L25" rel="#L25">25</span>
<span id="L26" rel="#L26">26</span>
<span id="L27" rel="#L27">27</span>
<span id="L28" rel="#L28">28</span>
<span id="L29" rel="#L29">29</span>
<span id="L30" rel="#L30">30</span>
<span id="L31" rel="#L31">31</span>
<span id="L32" rel="#L32">32</span>
<span id="L33" rel="#L33">33</span>
<span id="L34" rel="#L34">34</span>
<span id="L35" rel="#L35">35</span>
<span id="L36" rel="#L36">36</span>
<span id="L37" rel="#L37">37</span>
<span id="L38" rel="#L38">38</span>
<span id="L39" rel="#L39">39</span>
<span id="L40" rel="#L40">40</span>
<span id="L41" rel="#L41">41</span>
<span id="L42" rel="#L42">42</span>
<span id="L43" rel="#L43">43</span>
<span id="L44" rel="#L44">44</span>
<span id="L45" rel="#L45">45</span>
<span id="L46" rel="#L46">46</span>
<span id="L47" rel="#L47">47</span>
<span id="L48" rel="#L48">48</span>
<span id="L49" rel="#L49">49</span>
<span id="L50" rel="#L50">50</span>
<span id="L51" rel="#L51">51</span>
<span id="L52" rel="#L52">52</span>
<span id="L53" rel="#L53">53</span>
<span id="L54" rel="#L54">54</span>
<span id="L55" rel="#L55">55</span>
<span id="L56" rel="#L56">56</span>
<span id="L57" rel="#L57">57</span>
<span id="L58" rel="#L58">58</span>
<span id="L59" rel="#L59">59</span>
<span id="L60" rel="#L60">60</span>
<span id="L61" rel="#L61">61</span>
<span id="L62" rel="#L62">62</span>
<span id="L63" rel="#L63">63</span>
<span id="L64" rel="#L64">64</span>
<span id="L65" rel="#L65">65</span>
<span id="L66" rel="#L66">66</span>
<span id="L67" rel="#L67">67</span>
<span id="L68" rel="#L68">68</span>
<span id="L69" rel="#L69">69</span>
<span id="L70" rel="#L70">70</span>
<span id="L71" rel="#L71">71</span>
<span id="L72" rel="#L72">72</span>
<span id="L73" rel="#L73">73</span>
<span id="L74" rel="#L74">74</span>
<span id="L75" rel="#L75">75</span>
<span id="L76" rel="#L76">76</span>
<span id="L77" rel="#L77">77</span>
<span id="L78" rel="#L78">78</span>
<span id="L79" rel="#L79">79</span>
<span id="L80" rel="#L80">80</span>
<span id="L81" rel="#L81">81</span>
<span id="L82" rel="#L82">82</span>
<span id="L83" rel="#L83">83</span>
<span id="L84" rel="#L84">84</span>
<span id="L85" rel="#L85">85</span>
<span id="L86" rel="#L86">86</span>
<span id="L87" rel="#L87">87</span>
<span id="L88" rel="#L88">88</span>
<span id="L89" rel="#L89">89</span>
<span id="L90" rel="#L90">90</span>
<span id="L91" rel="#L91">91</span>
<span id="L92" rel="#L92">92</span>
<span id="L93" rel="#L93">93</span>
<span id="L94" rel="#L94">94</span>
<span id="L95" rel="#L95">95</span>
<span id="L96" rel="#L96">96</span>
<span id="L97" rel="#L97">97</span>
<span id="L98" rel="#L98">98</span>
<span id="L99" rel="#L99">99</span>
<span id="L100" rel="#L100">100</span>
<span id="L101" rel="#L101">101</span>
<span id="L102" rel="#L102">102</span>
<span id="L103" rel="#L103">103</span>
<span id="L104" rel="#L104">104</span>
<span id="L105" rel="#L105">105</span>
<span id="L106" rel="#L106">106</span>
<span id="L107" rel="#L107">107</span>
<span id="L108" rel="#L108">108</span>
<span id="L109" rel="#L109">109</span>
<span id="L110" rel="#L110">110</span>
<span id="L111" rel="#L111">111</span>
<span id="L112" rel="#L112">112</span>
<span id="L113" rel="#L113">113</span>
<span id="L114" rel="#L114">114</span>
<span id="L115" rel="#L115">115</span>
<span id="L116" rel="#L116">116</span>
<span id="L117" rel="#L117">117</span>
<span id="L118" rel="#L118">118</span>
<span id="L119" rel="#L119">119</span>
<span id="L120" rel="#L120">120</span>
<span id="L121" rel="#L121">121</span>
<span id="L122" rel="#L122">122</span>
<span id="L123" rel="#L123">123</span>
<span id="L124" rel="#L124">124</span>
<span id="L125" rel="#L125">125</span>
<span id="L126" rel="#L126">126</span>
<span id="L127" rel="#L127">127</span>
<span id="L128" rel="#L128">128</span>
<span id="L129" rel="#L129">129</span>
<span id="L130" rel="#L130">130</span>
<span id="L131" rel="#L131">131</span>
<span id="L132" rel="#L132">132</span>
<span id="L133" rel="#L133">133</span>
<span id="L134" rel="#L134">134</span>
<span id="L135" rel="#L135">135</span>
<span id="L136" rel="#L136">136</span>
<span id="L137" rel="#L137">137</span>
<span id="L138" rel="#L138">138</span>
<span id="L139" rel="#L139">139</span>
<span id="L140" rel="#L140">140</span>
<span id="L141" rel="#L141">141</span>
<span id="L142" rel="#L142">142</span>
<span id="L143" rel="#L143">143</span>
<span id="L144" rel="#L144">144</span>
<span id="L145" rel="#L145">145</span>
<span id="L146" rel="#L146">146</span>
<span id="L147" rel="#L147">147</span>
<span id="L148" rel="#L148">148</span>
<span id="L149" rel="#L149">149</span>
<span id="L150" rel="#L150">150</span>
<span id="L151" rel="#L151">151</span>
<span id="L152" rel="#L152">152</span>
<span id="L153" rel="#L153">153</span>
<span id="L154" rel="#L154">154</span>
<span id="L155" rel="#L155">155</span>
<span id="L156" rel="#L156">156</span>
<span id="L157" rel="#L157">157</span>
<span id="L158" rel="#L158">158</span>
<span id="L159" rel="#L159">159</span>
<span id="L160" rel="#L160">160</span>
<span id="L161" rel="#L161">161</span>
<span id="L162" rel="#L162">162</span>
<span id="L163" rel="#L163">163</span>
<span id="L164" rel="#L164">164</span>
<span id="L165" rel="#L165">165</span>
<span id="L166" rel="#L166">166</span>
<span id="L167" rel="#L167">167</span>
<span id="L168" rel="#L168">168</span>
<span id="L169" rel="#L169">169</span>
<span id="L170" rel="#L170">170</span>
<span id="L171" rel="#L171">171</span>
<span id="L172" rel="#L172">172</span>
<span id="L173" rel="#L173">173</span>
<span id="L174" rel="#L174">174</span>
<span id="L175" rel="#L175">175</span>
<span id="L176" rel="#L176">176</span>
<span id="L177" rel="#L177">177</span>
<span id="L178" rel="#L178">178</span>
<span id="L179" rel="#L179">179</span>
<span id="L180" rel="#L180">180</span>
<span id="L181" rel="#L181">181</span>
<span id="L182" rel="#L182">182</span>
<span id="L183" rel="#L183">183</span>
<span id="L184" rel="#L184">184</span>
<span id="L185" rel="#L185">185</span>
<span id="L186" rel="#L186">186</span>
<span id="L187" rel="#L187">187</span>
<span id="L188" rel="#L188">188</span>
<span id="L189" rel="#L189">189</span>
<span id="L190" rel="#L190">190</span>
<span id="L191" rel="#L191">191</span>
<span id="L192" rel="#L192">192</span>
<span id="L193" rel="#L193">193</span>
<span id="L194" rel="#L194">194</span>
<span id="L195" rel="#L195">195</span>
<span id="L196" rel="#L196">196</span>
<span id="L197" rel="#L197">197</span>
<span id="L198" rel="#L198">198</span>
<span id="L199" rel="#L199">199</span>
<span id="L200" rel="#L200">200</span>
<span id="L201" rel="#L201">201</span>
<span id="L202" rel="#L202">202</span>
<span id="L203" rel="#L203">203</span>
<span id="L204" rel="#L204">204</span>
<span id="L205" rel="#L205">205</span>
<span id="L206" rel="#L206">206</span>
<span id="L207" rel="#L207">207</span>
<span id="L208" rel="#L208">208</span>
<span id="L209" rel="#L209">209</span>
<span id="L210" rel="#L210">210</span>
<span id="L211" rel="#L211">211</span>
<span id="L212" rel="#L212">212</span>
<span id="L213" rel="#L213">213</span>
<span id="L214" rel="#L214">214</span>
<span id="L215" rel="#L215">215</span>
<span id="L216" rel="#L216">216</span>
<span id="L217" rel="#L217">217</span>
<span id="L218" rel="#L218">218</span>
<span id="L219" rel="#L219">219</span>
<span id="L220" rel="#L220">220</span>
<span id="L221" rel="#L221">221</span>
<span id="L222" rel="#L222">222</span>
<span id="L223" rel="#L223">223</span>
<span id="L224" rel="#L224">224</span>
<span id="L225" rel="#L225">225</span>
<span id="L226" rel="#L226">226</span>
<span id="L227" rel="#L227">227</span>
<span id="L228" rel="#L228">228</span>
<span id="L229" rel="#L229">229</span>
<span id="L230" rel="#L230">230</span>
<span id="L231" rel="#L231">231</span>
<span id="L232" rel="#L232">232</span>
<span id="L233" rel="#L233">233</span>
<span id="L234" rel="#L234">234</span>
<span id="L235" rel="#L235">235</span>
<span id="L236" rel="#L236">236</span>
<span id="L237" rel="#L237">237</span>
<span id="L238" rel="#L238">238</span>
<span id="L239" rel="#L239">239</span>
<span id="L240" rel="#L240">240</span>
<span id="L241" rel="#L241">241</span>
<span id="L242" rel="#L242">242</span>
<span id="L243" rel="#L243">243</span>
<span id="L244" rel="#L244">244</span>
<span id="L245" rel="#L245">245</span>
<span id="L246" rel="#L246">246</span>
<span id="L247" rel="#L247">247</span>
<span id="L248" rel="#L248">248</span>
<span id="L249" rel="#L249">249</span>
<span id="L250" rel="#L250">250</span>
<span id="L251" rel="#L251">251</span>
<span id="L252" rel="#L252">252</span>
<span id="L253" rel="#L253">253</span>
<span id="L254" rel="#L254">254</span>
<span id="L255" rel="#L255">255</span>
<span id="L256" rel="#L256">256</span>
<span id="L257" rel="#L257">257</span>
<span id="L258" rel="#L258">258</span>
<span id="L259" rel="#L259">259</span>
<span id="L260" rel="#L260">260</span>
<span id="L261" rel="#L261">261</span>
<span id="L262" rel="#L262">262</span>
<span id="L263" rel="#L263">263</span>
<span id="L264" rel="#L264">264</span>
<span id="L265" rel="#L265">265</span>
<span id="L266" rel="#L266">266</span>
<span id="L267" rel="#L267">267</span>
<span id="L268" rel="#L268">268</span>
<span id="L269" rel="#L269">269</span>
<span id="L270" rel="#L270">270</span>
<span id="L271" rel="#L271">271</span>
<span id="L272" rel="#L272">272</span>
<span id="L273" rel="#L273">273</span>
<span id="L274" rel="#L274">274</span>
<span id="L275" rel="#L275">275</span>
<span id="L276" rel="#L276">276</span>
<span id="L277" rel="#L277">277</span>
<span id="L278" rel="#L278">278</span>
<span id="L279" rel="#L279">279</span>
<span id="L280" rel="#L280">280</span>
<span id="L281" rel="#L281">281</span>
<span id="L282" rel="#L282">282</span>
<span id="L283" rel="#L283">283</span>
<span id="L284" rel="#L284">284</span>
<span id="L285" rel="#L285">285</span>
<span id="L286" rel="#L286">286</span>
<span id="L287" rel="#L287">287</span>
<span id="L288" rel="#L288">288</span>
<span id="L289" rel="#L289">289</span>
<span id="L290" rel="#L290">290</span>
<span id="L291" rel="#L291">291</span>
<span id="L292" rel="#L292">292</span>
<span id="L293" rel="#L293">293</span>
<span id="L294" rel="#L294">294</span>
<span id="L295" rel="#L295">295</span>
<span id="L296" rel="#L296">296</span>
<span id="L297" rel="#L297">297</span>
<span id="L298" rel="#L298">298</span>
<span id="L299" rel="#L299">299</span>
<span id="L300" rel="#L300">300</span>
<span id="L301" rel="#L301">301</span>
<span id="L302" rel="#L302">302</span>
<span id="L303" rel="#L303">303</span>
<span id="L304" rel="#L304">304</span>
<span id="L305" rel="#L305">305</span>
<span id="L306" rel="#L306">306</span>
<span id="L307" rel="#L307">307</span>
<span id="L308" rel="#L308">308</span>
<span id="L309" rel="#L309">309</span>
<span id="L310" rel="#L310">310</span>
<span id="L311" rel="#L311">311</span>
<span id="L312" rel="#L312">312</span>
<span id="L313" rel="#L313">313</span>
<span id="L314" rel="#L314">314</span>
<span id="L315" rel="#L315">315</span>
<span id="L316" rel="#L316">316</span>
<span id="L317" rel="#L317">317</span>
<span id="L318" rel="#L318">318</span>
<span id="L319" rel="#L319">319</span>
<span id="L320" rel="#L320">320</span>
<span id="L321" rel="#L321">321</span>
<span id="L322" rel="#L322">322</span>
<span id="L323" rel="#L323">323</span>
<span id="L324" rel="#L324">324</span>
<span id="L325" rel="#L325">325</span>
<span id="L326" rel="#L326">326</span>
<span id="L327" rel="#L327">327</span>
<span id="L328" rel="#L328">328</span>
<span id="L329" rel="#L329">329</span>
<span id="L330" rel="#L330">330</span>
<span id="L331" rel="#L331">331</span>
<span id="L332" rel="#L332">332</span>
<span id="L333" rel="#L333">333</span>
<span id="L334" rel="#L334">334</span>
<span id="L335" rel="#L335">335</span>
<span id="L336" rel="#L336">336</span>
<span id="L337" rel="#L337">337</span>
<span id="L338" rel="#L338">338</span>
<span id="L339" rel="#L339">339</span>
<span id="L340" rel="#L340">340</span>
<span id="L341" rel="#L341">341</span>
<span id="L342" rel="#L342">342</span>
<span id="L343" rel="#L343">343</span>
<span id="L344" rel="#L344">344</span>
<span id="L345" rel="#L345">345</span>
<span id="L346" rel="#L346">346</span>
<span id="L347" rel="#L347">347</span>
<span id="L348" rel="#L348">348</span>
<span id="L349" rel="#L349">349</span>
<span id="L350" rel="#L350">350</span>
<span id="L351" rel="#L351">351</span>
<span id="L352" rel="#L352">352</span>
<span id="L353" rel="#L353">353</span>
<span id="L354" rel="#L354">354</span>
<span id="L355" rel="#L355">355</span>
<span id="L356" rel="#L356">356</span>
<span id="L357" rel="#L357">357</span>
<span id="L358" rel="#L358">358</span>
<span id="L359" rel="#L359">359</span>
<span id="L360" rel="#L360">360</span>
<span id="L361" rel="#L361">361</span>
<span id="L362" rel="#L362">362</span>
<span id="L363" rel="#L363">363</span>
<span id="L364" rel="#L364">364</span>
<span id="L365" rel="#L365">365</span>
<span id="L366" rel="#L366">366</span>
<span id="L367" rel="#L367">367</span>
<span id="L368" rel="#L368">368</span>
<span id="L369" rel="#L369">369</span>
<span id="L370" rel="#L370">370</span>
<span id="L371" rel="#L371">371</span>
<span id="L372" rel="#L372">372</span>
<span id="L373" rel="#L373">373</span>
<span id="L374" rel="#L374">374</span>
<span id="L375" rel="#L375">375</span>
<span id="L376" rel="#L376">376</span>
<span id="L377" rel="#L377">377</span>
<span id="L378" rel="#L378">378</span>
<span id="L379" rel="#L379">379</span>
<span id="L380" rel="#L380">380</span>
<span id="L381" rel="#L381">381</span>
<span id="L382" rel="#L382">382</span>
<span id="L383" rel="#L383">383</span>
<span id="L384" rel="#L384">384</span>
<span id="L385" rel="#L385">385</span>
<span id="L386" rel="#L386">386</span>
<span id="L387" rel="#L387">387</span>
<span id="L388" rel="#L388">388</span>
<span id="L389" rel="#L389">389</span>
<span id="L390" rel="#L390">390</span>
<span id="L391" rel="#L391">391</span>
<span id="L392" rel="#L392">392</span>
<span id="L393" rel="#L393">393</span>
<span id="L394" rel="#L394">394</span>
<span id="L395" rel="#L395">395</span>
<span id="L396" rel="#L396">396</span>
<span id="L397" rel="#L397">397</span>
<span id="L398" rel="#L398">398</span>
<span id="L399" rel="#L399">399</span>
<span id="L400" rel="#L400">400</span>
<span id="L401" rel="#L401">401</span>
<span id="L402" rel="#L402">402</span>
<span id="L403" rel="#L403">403</span>
<span id="L404" rel="#L404">404</span>
<span id="L405" rel="#L405">405</span>
<span id="L406" rel="#L406">406</span>
<span id="L407" rel="#L407">407</span>
<span id="L408" rel="#L408">408</span>
<span id="L409" rel="#L409">409</span>
<span id="L410" rel="#L410">410</span>
<span id="L411" rel="#L411">411</span>
<span id="L412" rel="#L412">412</span>
<span id="L413" rel="#L413">413</span>
<span id="L414" rel="#L414">414</span>
<span id="L415" rel="#L415">415</span>
<span id="L416" rel="#L416">416</span>
<span id="L417" rel="#L417">417</span>
<span id="L418" rel="#L418">418</span>
<span id="L419" rel="#L419">419</span>
<span id="L420" rel="#L420">420</span>
<span id="L421" rel="#L421">421</span>
<span id="L422" rel="#L422">422</span>
<span id="L423" rel="#L423">423</span>
<span id="L424" rel="#L424">424</span>
<span id="L425" rel="#L425">425</span>
<span id="L426" rel="#L426">426</span>
<span id="L427" rel="#L427">427</span>
<span id="L428" rel="#L428">428</span>
<span id="L429" rel="#L429">429</span>
<span id="L430" rel="#L430">430</span>
<span id="L431" rel="#L431">431</span>
<span id="L432" rel="#L432">432</span>
<span id="L433" rel="#L433">433</span>
<span id="L434" rel="#L434">434</span>
<span id="L435" rel="#L435">435</span>
<span id="L436" rel="#L436">436</span>
<span id="L437" rel="#L437">437</span>
<span id="L438" rel="#L438">438</span>
<span id="L439" rel="#L439">439</span>
<span id="L440" rel="#L440">440</span>
<span id="L441" rel="#L441">441</span>
<span id="L442" rel="#L442">442</span>
<span id="L443" rel="#L443">443</span>
<span id="L444" rel="#L444">444</span>
<span id="L445" rel="#L445">445</span>
<span id="L446" rel="#L446">446</span>
<span id="L447" rel="#L447">447</span>
<span id="L448" rel="#L448">448</span>
<span id="L449" rel="#L449">449</span>
<span id="L450" rel="#L450">450</span>
<span id="L451" rel="#L451">451</span>
<span id="L452" rel="#L452">452</span>
<span id="L453" rel="#L453">453</span>
<span id="L454" rel="#L454">454</span>
<span id="L455" rel="#L455">455</span>
<span id="L456" rel="#L456">456</span>
<span id="L457" rel="#L457">457</span>
<span id="L458" rel="#L458">458</span>
<span id="L459" rel="#L459">459</span>
<span id="L460" rel="#L460">460</span>
<span id="L461" rel="#L461">461</span>
<span id="L462" rel="#L462">462</span>
<span id="L463" rel="#L463">463</span>
<span id="L464" rel="#L464">464</span>
<span id="L465" rel="#L465">465</span>
<span id="L466" rel="#L466">466</span>
<span id="L467" rel="#L467">467</span>
<span id="L468" rel="#L468">468</span>
<span id="L469" rel="#L469">469</span>
<span id="L470" rel="#L470">470</span>
<span id="L471" rel="#L471">471</span>
<span id="L472" rel="#L472">472</span>
<span id="L473" rel="#L473">473</span>
<span id="L474" rel="#L474">474</span>
<span id="L475" rel="#L475">475</span>
<span id="L476" rel="#L476">476</span>
<span id="L477" rel="#L477">477</span>
<span id="L478" rel="#L478">478</span>
<span id="L479" rel="#L479">479</span>
<span id="L480" rel="#L480">480</span>
<span id="L481" rel="#L481">481</span>
<span id="L482" rel="#L482">482</span>
<span id="L483" rel="#L483">483</span>
<span id="L484" rel="#L484">484</span>
<span id="L485" rel="#L485">485</span>
<span id="L486" rel="#L486">486</span>
<span id="L487" rel="#L487">487</span>
<span id="L488" rel="#L488">488</span>
<span id="L489" rel="#L489">489</span>
<span id="L490" rel="#L490">490</span>
<span id="L491" rel="#L491">491</span>
<span id="L492" rel="#L492">492</span>
<span id="L493" rel="#L493">493</span>
<span id="L494" rel="#L494">494</span>
<span id="L495" rel="#L495">495</span>
<span id="L496" rel="#L496">496</span>
<span id="L497" rel="#L497">497</span>
<span id="L498" rel="#L498">498</span>
<span id="L499" rel="#L499">499</span>
<span id="L500" rel="#L500">500</span>
<span id="L501" rel="#L501">501</span>
<span id="L502" rel="#L502">502</span>
<span id="L503" rel="#L503">503</span>
<span id="L504" rel="#L504">504</span>
<span id="L505" rel="#L505">505</span>
<span id="L506" rel="#L506">506</span>
<span id="L507" rel="#L507">507</span>
<span id="L508" rel="#L508">508</span>
<span id="L509" rel="#L509">509</span>
<span id="L510" rel="#L510">510</span>
<span id="L511" rel="#L511">511</span>
<span id="L512" rel="#L512">512</span>
<span id="L513" rel="#L513">513</span>
<span id="L514" rel="#L514">514</span>
<span id="L515" rel="#L515">515</span>
<span id="L516" rel="#L516">516</span>
<span id="L517" rel="#L517">517</span>
<span id="L518" rel="#L518">518</span>
<span id="L519" rel="#L519">519</span>
<span id="L520" rel="#L520">520</span>
<span id="L521" rel="#L521">521</span>
<span id="L522" rel="#L522">522</span>
<span id="L523" rel="#L523">523</span>
<span id="L524" rel="#L524">524</span>
<span id="L525" rel="#L525">525</span>
<span id="L526" rel="#L526">526</span>
<span id="L527" rel="#L527">527</span>
<span id="L528" rel="#L528">528</span>
<span id="L529" rel="#L529">529</span>
<span id="L530" rel="#L530">530</span>
<span id="L531" rel="#L531">531</span>
<span id="L532" rel="#L532">532</span>
<span id="L533" rel="#L533">533</span>
<span id="L534" rel="#L534">534</span>
<span id="L535" rel="#L535">535</span>
<span id="L536" rel="#L536">536</span>
<span id="L537" rel="#L537">537</span>
<span id="L538" rel="#L538">538</span>
<span id="L539" rel="#L539">539</span>
<span id="L540" rel="#L540">540</span>
<span id="L541" rel="#L541">541</span>
<span id="L542" rel="#L542">542</span>
<span id="L543" rel="#L543">543</span>
<span id="L544" rel="#L544">544</span>
<span id="L545" rel="#L545">545</span>
<span id="L546" rel="#L546">546</span>
<span id="L547" rel="#L547">547</span>
<span id="L548" rel="#L548">548</span>
<span id="L549" rel="#L549">549</span>
<span id="L550" rel="#L550">550</span>
<span id="L551" rel="#L551">551</span>
<span id="L552" rel="#L552">552</span>
<span id="L553" rel="#L553">553</span>
<span id="L554" rel="#L554">554</span>
<span id="L555" rel="#L555">555</span>
<span id="L556" rel="#L556">556</span>
<span id="L557" rel="#L557">557</span>
<span id="L558" rel="#L558">558</span>
<span id="L559" rel="#L559">559</span>
<span id="L560" rel="#L560">560</span>
<span id="L561" rel="#L561">561</span>
<span id="L562" rel="#L562">562</span>
<span id="L563" rel="#L563">563</span>
<span id="L564" rel="#L564">564</span>
<span id="L565" rel="#L565">565</span>
<span id="L566" rel="#L566">566</span>
<span id="L567" rel="#L567">567</span>
<span id="L568" rel="#L568">568</span>
<span id="L569" rel="#L569">569</span>
<span id="L570" rel="#L570">570</span>
<span id="L571" rel="#L571">571</span>
<span id="L572" rel="#L572">572</span>
<span id="L573" rel="#L573">573</span>
<span id="L574" rel="#L574">574</span>
<span id="L575" rel="#L575">575</span>
<span id="L576" rel="#L576">576</span>
<span id="L577" rel="#L577">577</span>
<span id="L578" rel="#L578">578</span>
<span id="L579" rel="#L579">579</span>
<span id="L580" rel="#L580">580</span>
<span id="L581" rel="#L581">581</span>
<span id="L582" rel="#L582">582</span>
<span id="L583" rel="#L583">583</span>
<span id="L584" rel="#L584">584</span>
<span id="L585" rel="#L585">585</span>
<span id="L586" rel="#L586">586</span>
<span id="L587" rel="#L587">587</span>
<span id="L588" rel="#L588">588</span>
<span id="L589" rel="#L589">589</span>
<span id="L590" rel="#L590">590</span>
<span id="L591" rel="#L591">591</span>
<span id="L592" rel="#L592">592</span>
<span id="L593" rel="#L593">593</span>
<span id="L594" rel="#L594">594</span>
<span id="L595" rel="#L595">595</span>
<span id="L596" rel="#L596">596</span>
<span id="L597" rel="#L597">597</span>
<span id="L598" rel="#L598">598</span>
<span id="L599" rel="#L599">599</span>
<span id="L600" rel="#L600">600</span>
<span id="L601" rel="#L601">601</span>
<span id="L602" rel="#L602">602</span>
<span id="L603" rel="#L603">603</span>
<span id="L604" rel="#L604">604</span>
<span id="L605" rel="#L605">605</span>
<span id="L606" rel="#L606">606</span>
<span id="L607" rel="#L607">607</span>
<span id="L608" rel="#L608">608</span>
<span id="L609" rel="#L609">609</span>
<span id="L610" rel="#L610">610</span>
<span id="L611" rel="#L611">611</span>
<span id="L612" rel="#L612">612</span>
<span id="L613" rel="#L613">613</span>
<span id="L614" rel="#L614">614</span>
<span id="L615" rel="#L615">615</span>
<span id="L616" rel="#L616">616</span>
<span id="L617" rel="#L617">617</span>
<span id="L618" rel="#L618">618</span>
<span id="L619" rel="#L619">619</span>
<span id="L620" rel="#L620">620</span>
<span id="L621" rel="#L621">621</span>
<span id="L622" rel="#L622">622</span>
<span id="L623" rel="#L623">623</span>
<span id="L624" rel="#L624">624</span>
<span id="L625" rel="#L625">625</span>
<span id="L626" rel="#L626">626</span>
<span id="L627" rel="#L627">627</span>
<span id="L628" rel="#L628">628</span>
<span id="L629" rel="#L629">629</span>
<span id="L630" rel="#L630">630</span>
<span id="L631" rel="#L631">631</span>
<span id="L632" rel="#L632">632</span>
<span id="L633" rel="#L633">633</span>
<span id="L634" rel="#L634">634</span>
<span id="L635" rel="#L635">635</span>
<span id="L636" rel="#L636">636</span>
<span id="L637" rel="#L637">637</span>
<span id="L638" rel="#L638">638</span>
<span id="L639" rel="#L639">639</span>
<span id="L640" rel="#L640">640</span>
<span id="L641" rel="#L641">641</span>
<span id="L642" rel="#L642">642</span>
<span id="L643" rel="#L643">643</span>
<span id="L644" rel="#L644">644</span>
<span id="L645" rel="#L645">645</span>
<span id="L646" rel="#L646">646</span>
<span id="L647" rel="#L647">647</span>
<span id="L648" rel="#L648">648</span>
<span id="L649" rel="#L649">649</span>
<span id="L650" rel="#L650">650</span>
<span id="L651" rel="#L651">651</span>
<span id="L652" rel="#L652">652</span>
<span id="L653" rel="#L653">653</span>
<span id="L654" rel="#L654">654</span>
<span id="L655" rel="#L655">655</span>
<span id="L656" rel="#L656">656</span>
<span id="L657" rel="#L657">657</span>
<span id="L658" rel="#L658">658</span>
<span id="L659" rel="#L659">659</span>
<span id="L660" rel="#L660">660</span>
<span id="L661" rel="#L661">661</span>
<span id="L662" rel="#L662">662</span>
<span id="L663" rel="#L663">663</span>
<span id="L664" rel="#L664">664</span>
<span id="L665" rel="#L665">665</span>
<span id="L666" rel="#L666">666</span>
<span id="L667" rel="#L667">667</span>
<span id="L668" rel="#L668">668</span>
<span id="L669" rel="#L669">669</span>
<span id="L670" rel="#L670">670</span>
<span id="L671" rel="#L671">671</span>
<span id="L672" rel="#L672">672</span>
<span id="L673" rel="#L673">673</span>
<span id="L674" rel="#L674">674</span>
<span id="L675" rel="#L675">675</span>
<span id="L676" rel="#L676">676</span>
<span id="L677" rel="#L677">677</span>
<span id="L678" rel="#L678">678</span>
<span id="L679" rel="#L679">679</span>
<span id="L680" rel="#L680">680</span>
<span id="L681" rel="#L681">681</span>
<span id="L682" rel="#L682">682</span>
<span id="L683" rel="#L683">683</span>
<span id="L684" rel="#L684">684</span>
<span id="L685" rel="#L685">685</span>
<span id="L686" rel="#L686">686</span>
<span id="L687" rel="#L687">687</span>
<span id="L688" rel="#L688">688</span>
<span id="L689" rel="#L689">689</span>
<span id="L690" rel="#L690">690</span>
<span id="L691" rel="#L691">691</span>
<span id="L692" rel="#L692">692</span>
<span id="L693" rel="#L693">693</span>
<span id="L694" rel="#L694">694</span>
<span id="L695" rel="#L695">695</span>
<span id="L696" rel="#L696">696</span>
<span id="L697" rel="#L697">697</span>
<span id="L698" rel="#L698">698</span>
<span id="L699" rel="#L699">699</span>
<span id="L700" rel="#L700">700</span>
<span id="L701" rel="#L701">701</span>
<span id="L702" rel="#L702">702</span>
<span id="L703" rel="#L703">703</span>
<span id="L704" rel="#L704">704</span>
<span id="L705" rel="#L705">705</span>
<span id="L706" rel="#L706">706</span>
<span id="L707" rel="#L707">707</span>
<span id="L708" rel="#L708">708</span>
<span id="L709" rel="#L709">709</span>
<span id="L710" rel="#L710">710</span>
<span id="L711" rel="#L711">711</span>
<span id="L712" rel="#L712">712</span>
<span id="L713" rel="#L713">713</span>
<span id="L714" rel="#L714">714</span>
<span id="L715" rel="#L715">715</span>
<span id="L716" rel="#L716">716</span>
<span id="L717" rel="#L717">717</span>
<span id="L718" rel="#L718">718</span>
<span id="L719" rel="#L719">719</span>
<span id="L720" rel="#L720">720</span>
<span id="L721" rel="#L721">721</span>
<span id="L722" rel="#L722">722</span>
<span id="L723" rel="#L723">723</span>
<span id="L724" rel="#L724">724</span>
<span id="L725" rel="#L725">725</span>
<span id="L726" rel="#L726">726</span>
<span id="L727" rel="#L727">727</span>
<span id="L728" rel="#L728">728</span>
<span id="L729" rel="#L729">729</span>
<span id="L730" rel="#L730">730</span>
<span id="L731" rel="#L731">731</span>
<span id="L732" rel="#L732">732</span>
<span id="L733" rel="#L733">733</span>
<span id="L734" rel="#L734">734</span>
<span id="L735" rel="#L735">735</span>
<span id="L736" rel="#L736">736</span>
<span id="L737" rel="#L737">737</span>
<span id="L738" rel="#L738">738</span>
<span id="L739" rel="#L739">739</span>
<span id="L740" rel="#L740">740</span>
<span id="L741" rel="#L741">741</span>
<span id="L742" rel="#L742">742</span>
<span id="L743" rel="#L743">743</span>
<span id="L744" rel="#L744">744</span>
<span id="L745" rel="#L745">745</span>
<span id="L746" rel="#L746">746</span>
<span id="L747" rel="#L747">747</span>
<span id="L748" rel="#L748">748</span>
<span id="L749" rel="#L749">749</span>
<span id="L750" rel="#L750">750</span>
<span id="L751" rel="#L751">751</span>
<span id="L752" rel="#L752">752</span>
<span id="L753" rel="#L753">753</span>
<span id="L754" rel="#L754">754</span>
<span id="L755" rel="#L755">755</span>
<span id="L756" rel="#L756">756</span>
<span id="L757" rel="#L757">757</span>
<span id="L758" rel="#L758">758</span>
<span id="L759" rel="#L759">759</span>
<span id="L760" rel="#L760">760</span>
<span id="L761" rel="#L761">761</span>
<span id="L762" rel="#L762">762</span>
<span id="L763" rel="#L763">763</span>
<span id="L764" rel="#L764">764</span>
<span id="L765" rel="#L765">765</span>
<span id="L766" rel="#L766">766</span>
<span id="L767" rel="#L767">767</span>
<span id="L768" rel="#L768">768</span>
<span id="L769" rel="#L769">769</span>
<span id="L770" rel="#L770">770</span>
<span id="L771" rel="#L771">771</span>
<span id="L772" rel="#L772">772</span>
<span id="L773" rel="#L773">773</span>
<span id="L774" rel="#L774">774</span>
<span id="L775" rel="#L775">775</span>
<span id="L776" rel="#L776">776</span>
<span id="L777" rel="#L777">777</span>
<span id="L778" rel="#L778">778</span>
<span id="L779" rel="#L779">779</span>
<span id="L780" rel="#L780">780</span>
<span id="L781" rel="#L781">781</span>
<span id="L782" rel="#L782">782</span>
<span id="L783" rel="#L783">783</span>
<span id="L784" rel="#L784">784</span>
<span id="L785" rel="#L785">785</span>
<span id="L786" rel="#L786">786</span>
<span id="L787" rel="#L787">787</span>
<span id="L788" rel="#L788">788</span>
<span id="L789" rel="#L789">789</span>
<span id="L790" rel="#L790">790</span>
<span id="L791" rel="#L791">791</span>
<span id="L792" rel="#L792">792</span>
<span id="L793" rel="#L793">793</span>
<span id="L794" rel="#L794">794</span>
<span id="L795" rel="#L795">795</span>
<span id="L796" rel="#L796">796</span>
<span id="L797" rel="#L797">797</span>
<span id="L798" rel="#L798">798</span>
<span id="L799" rel="#L799">799</span>
<span id="L800" rel="#L800">800</span>
<span id="L801" rel="#L801">801</span>
<span id="L802" rel="#L802">802</span>
<span id="L803" rel="#L803">803</span>
<span id="L804" rel="#L804">804</span>
<span id="L805" rel="#L805">805</span>
<span id="L806" rel="#L806">806</span>
<span id="L807" rel="#L807">807</span>
<span id="L808" rel="#L808">808</span>
<span id="L809" rel="#L809">809</span>
<span id="L810" rel="#L810">810</span>
<span id="L811" rel="#L811">811</span>
<span id="L812" rel="#L812">812</span>
<span id="L813" rel="#L813">813</span>
<span id="L814" rel="#L814">814</span>
<span id="L815" rel="#L815">815</span>
<span id="L816" rel="#L816">816</span>
<span id="L817" rel="#L817">817</span>
<span id="L818" rel="#L818">818</span>
<span id="L819" rel="#L819">819</span>
<span id="L820" rel="#L820">820</span>
<span id="L821" rel="#L821">821</span>
<span id="L822" rel="#L822">822</span>
<span id="L823" rel="#L823">823</span>
<span id="L824" rel="#L824">824</span>
<span id="L825" rel="#L825">825</span>
<span id="L826" rel="#L826">826</span>
<span id="L827" rel="#L827">827</span>
<span id="L828" rel="#L828">828</span>
<span id="L829" rel="#L829">829</span>
<span id="L830" rel="#L830">830</span>
<span id="L831" rel="#L831">831</span>
<span id="L832" rel="#L832">832</span>
<span id="L833" rel="#L833">833</span>
<span id="L834" rel="#L834">834</span>
<span id="L835" rel="#L835">835</span>
<span id="L836" rel="#L836">836</span>
<span id="L837" rel="#L837">837</span>
<span id="L838" rel="#L838">838</span>
<span id="L839" rel="#L839">839</span>
<span id="L840" rel="#L840">840</span>
<span id="L841" rel="#L841">841</span>
<span id="L842" rel="#L842">842</span>
<span id="L843" rel="#L843">843</span>
<span id="L844" rel="#L844">844</span>
<span id="L845" rel="#L845">845</span>
<span id="L846" rel="#L846">846</span>
<span id="L847" rel="#L847">847</span>
<span id="L848" rel="#L848">848</span>
<span id="L849" rel="#L849">849</span>
<span id="L850" rel="#L850">850</span>
<span id="L851" rel="#L851">851</span>
<span id="L852" rel="#L852">852</span>
<span id="L853" rel="#L853">853</span>
<span id="L854" rel="#L854">854</span>
<span id="L855" rel="#L855">855</span>
<span id="L856" rel="#L856">856</span>
<span id="L857" rel="#L857">857</span>
<span id="L858" rel="#L858">858</span>
<span id="L859" rel="#L859">859</span>
<span id="L860" rel="#L860">860</span>
<span id="L861" rel="#L861">861</span>
<span id="L862" rel="#L862">862</span>
<span id="L863" rel="#L863">863</span>
<span id="L864" rel="#L864">864</span>
<span id="L865" rel="#L865">865</span>
<span id="L866" rel="#L866">866</span>
<span id="L867" rel="#L867">867</span>
<span id="L868" rel="#L868">868</span>
<span id="L869" rel="#L869">869</span>
<span id="L870" rel="#L870">870</span>
<span id="L871" rel="#L871">871</span>
<span id="L872" rel="#L872">872</span>
<span id="L873" rel="#L873">873</span>
<span id="L874" rel="#L874">874</span>
<span id="L875" rel="#L875">875</span>
<span id="L876" rel="#L876">876</span>
<span id="L877" rel="#L877">877</span>
<span id="L878" rel="#L878">878</span>
<span id="L879" rel="#L879">879</span>
<span id="L880" rel="#L880">880</span>
<span id="L881" rel="#L881">881</span>
<span id="L882" rel="#L882">882</span>
<span id="L883" rel="#L883">883</span>
<span id="L884" rel="#L884">884</span>
<span id="L885" rel="#L885">885</span>
<span id="L886" rel="#L886">886</span>
<span id="L887" rel="#L887">887</span>
<span id="L888" rel="#L888">888</span>
<span id="L889" rel="#L889">889</span>
<span id="L890" rel="#L890">890</span>
<span id="L891" rel="#L891">891</span>
<span id="L892" rel="#L892">892</span>
<span id="L893" rel="#L893">893</span>
<span id="L894" rel="#L894">894</span>
<span id="L895" rel="#L895">895</span>
<span id="L896" rel="#L896">896</span>
<span id="L897" rel="#L897">897</span>
<span id="L898" rel="#L898">898</span>
<span id="L899" rel="#L899">899</span>
<span id="L900" rel="#L900">900</span>
<span id="L901" rel="#L901">901</span>
<span id="L902" rel="#L902">902</span>
<span id="L903" rel="#L903">903</span>
<span id="L904" rel="#L904">904</span>
<span id="L905" rel="#L905">905</span>
<span id="L906" rel="#L906">906</span>
<span id="L907" rel="#L907">907</span>
<span id="L908" rel="#L908">908</span>
<span id="L909" rel="#L909">909</span>
<span id="L910" rel="#L910">910</span>
<span id="L911" rel="#L911">911</span>
<span id="L912" rel="#L912">912</span>
<span id="L913" rel="#L913">913</span>
<span id="L914" rel="#L914">914</span>
<span id="L915" rel="#L915">915</span>
<span id="L916" rel="#L916">916</span>
<span id="L917" rel="#L917">917</span>
<span id="L918" rel="#L918">918</span>
<span id="L919" rel="#L919">919</span>
<span id="L920" rel="#L920">920</span>
<span id="L921" rel="#L921">921</span>
<span id="L922" rel="#L922">922</span>
<span id="L923" rel="#L923">923</span>
<span id="L924" rel="#L924">924</span>
<span id="L925" rel="#L925">925</span>
<span id="L926" rel="#L926">926</span>
<span id="L927" rel="#L927">927</span>
<span id="L928" rel="#L928">928</span>
<span id="L929" rel="#L929">929</span>
<span id="L930" rel="#L930">930</span>
<span id="L931" rel="#L931">931</span>
<span id="L932" rel="#L932">932</span>
<span id="L933" rel="#L933">933</span>
<span id="L934" rel="#L934">934</span>
<span id="L935" rel="#L935">935</span>
<span id="L936" rel="#L936">936</span>
<span id="L937" rel="#L937">937</span>
<span id="L938" rel="#L938">938</span>
<span id="L939" rel="#L939">939</span>
<span id="L940" rel="#L940">940</span>
<span id="L941" rel="#L941">941</span>
<span id="L942" rel="#L942">942</span>
<span id="L943" rel="#L943">943</span>
<span id="L944" rel="#L944">944</span>
<span id="L945" rel="#L945">945</span>
<span id="L946" rel="#L946">946</span>
<span id="L947" rel="#L947">947</span>
<span id="L948" rel="#L948">948</span>
<span id="L949" rel="#L949">949</span>
<span id="L950" rel="#L950">950</span>
<span id="L951" rel="#L951">951</span>
<span id="L952" rel="#L952">952</span>
<span id="L953" rel="#L953">953</span>
<span id="L954" rel="#L954">954</span>
<span id="L955" rel="#L955">955</span>
<span id="L956" rel="#L956">956</span>
<span id="L957" rel="#L957">957</span>
<span id="L958" rel="#L958">958</span>
<span id="L959" rel="#L959">959</span>
<span id="L960" rel="#L960">960</span>
<span id="L961" rel="#L961">961</span>
<span id="L962" rel="#L962">962</span>
<span id="L963" rel="#L963">963</span>
<span id="L964" rel="#L964">964</span>
<span id="L965" rel="#L965">965</span>
<span id="L966" rel="#L966">966</span>
<span id="L967" rel="#L967">967</span>
<span id="L968" rel="#L968">968</span>
<span id="L969" rel="#L969">969</span>
<span id="L970" rel="#L970">970</span>
<span id="L971" rel="#L971">971</span>
<span id="L972" rel="#L972">972</span>
<span id="L973" rel="#L973">973</span>
<span id="L974" rel="#L974">974</span>
<span id="L975" rel="#L975">975</span>
<span id="L976" rel="#L976">976</span>
<span id="L977" rel="#L977">977</span>

           </td>
           <td class="blob-line-code"><div class="code-body highlight"><pre><div class='line' id='LC1'><span class="kn">package</span> <span class="n">org</span><span class="o">.</span><span class="na">json</span><span class="o">;</span></div><div class='line' id='LC2'><br/></div><div class='line' id='LC3'><span class="cm">/*</span></div><div class='line' id='LC4'><span class="cm"> Copyright (c) 2002 JSON.org</span></div><div class='line' id='LC5'><br/></div><div class='line' id='LC6'><span class="cm"> Permission is hereby granted, free of charge, to any person obtaining a copy</span></div><div class='line' id='LC7'><span class="cm"> of this software and associated documentation files (the &quot;Software&quot;), to deal</span></div><div class='line' id='LC8'><span class="cm"> in the Software without restriction, including without limitation the rights</span></div><div class='line' id='LC9'><span class="cm"> to use, copy, modify, merge, publish, distribute, sublicense, and/or sell</span></div><div class='line' id='LC10'><span class="cm"> copies of the Software, and to permit persons to whom the Software is</span></div><div class='line' id='LC11'><span class="cm"> furnished to do so, subject to the following conditions:</span></div><div class='line' id='LC12'><br/></div><div class='line' id='LC13'><span class="cm"> The above copyright notice and this permission notice shall be included in all</span></div><div class='line' id='LC14'><span class="cm"> copies or substantial portions of the Software.</span></div><div class='line' id='LC15'><br/></div><div class='line' id='LC16'><span class="cm"> The Software shall be used for Good, not Evil.</span></div><div class='line' id='LC17'><br/></div><div class='line' id='LC18'><span class="cm"> THE SOFTWARE IS PROVIDED &quot;AS IS&quot;, WITHOUT WARRANTY OF ANY KIND, EXPRESS OR</span></div><div class='line' id='LC19'><span class="cm"> IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,</span></div><div class='line' id='LC20'><span class="cm"> FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE</span></div><div class='line' id='LC21'><span class="cm"> AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER</span></div><div class='line' id='LC22'><span class="cm"> LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,</span></div><div class='line' id='LC23'><span class="cm"> OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE</span></div><div class='line' id='LC24'><span class="cm"> SOFTWARE.</span></div><div class='line' id='LC25'><span class="cm"> */</span></div><div class='line' id='LC26'><br/></div><div class='line' id='LC27'><span class="kn">import</span> <span class="nn">java.io.IOException</span><span class="o">;</span></div><div class='line' id='LC28'><span class="kn">import</span> <span class="nn">java.io.StringWriter</span><span class="o">;</span></div><div class='line' id='LC29'><span class="kn">import</span> <span class="nn">java.io.Writer</span><span class="o">;</span></div><div class='line' id='LC30'><span class="kn">import</span> <span class="nn">java.lang.reflect.Array</span><span class="o">;</span></div><div class='line' id='LC31'><span class="kn">import</span> <span class="nn">java.util.ArrayList</span><span class="o">;</span></div><div class='line' id='LC32'><span class="kn">import</span> <span class="nn">java.util.Collection</span><span class="o">;</span></div><div class='line' id='LC33'><span class="kn">import</span> <span class="nn">java.util.Iterator</span><span class="o">;</span></div><div class='line' id='LC34'><span class="kn">import</span> <span class="nn">java.util.Map</span><span class="o">;</span></div><div class='line' id='LC35'><br/></div><div class='line' id='LC36'><span class="cm">/**</span></div><div class='line' id='LC37'><span class="cm"> * A JSONArray is an ordered sequence of values. Its external text form is a</span></div><div class='line' id='LC38'><span class="cm"> * string wrapped in square brackets with commas separating the values. The</span></div><div class='line' id='LC39'><span class="cm"> * internal form is an object having &lt;code&gt;get&lt;/code&gt; and &lt;code&gt;opt&lt;/code&gt;</span></div><div class='line' id='LC40'><span class="cm"> * methods for accessing the values by index, and &lt;code&gt;put&lt;/code&gt; methods for</span></div><div class='line' id='LC41'><span class="cm"> * adding or replacing values. The values can be any of these types:</span></div><div class='line' id='LC42'><span class="cm"> * &lt;code&gt;Boolean&lt;/code&gt;, &lt;code&gt;JSONArray&lt;/code&gt;, &lt;code&gt;JSONObject&lt;/code&gt;,</span></div><div class='line' id='LC43'><span class="cm"> * &lt;code&gt;Number&lt;/code&gt;, &lt;code&gt;String&lt;/code&gt;, or the</span></div><div class='line' id='LC44'><span class="cm"> * &lt;code&gt;JSONObject.NULL object&lt;/code&gt;.</span></div><div class='line' id='LC45'><span class="cm"> * &lt;p&gt;</span></div><div class='line' id='LC46'><span class="cm"> * The constructor can convert a JSON text into a Java object. The</span></div><div class='line' id='LC47'><span class="cm"> * &lt;code&gt;toString&lt;/code&gt; method converts to JSON text.</span></div><div class='line' id='LC48'><span class="cm"> * &lt;p&gt;</span></div><div class='line' id='LC49'><span class="cm"> * A &lt;code&gt;get&lt;/code&gt; method returns a value if one can be found, and throws an</span></div><div class='line' id='LC50'><span class="cm"> * exception if one cannot be found. An &lt;code&gt;opt&lt;/code&gt; method returns a</span></div><div class='line' id='LC51'><span class="cm"> * default value instead of throwing an exception, and so is useful for</span></div><div class='line' id='LC52'><span class="cm"> * obtaining optional values.</span></div><div class='line' id='LC53'><span class="cm"> * &lt;p&gt;</span></div><div class='line' id='LC54'><span class="cm"> * The generic &lt;code&gt;get()&lt;/code&gt; and &lt;code&gt;opt()&lt;/code&gt; methods return an</span></div><div class='line' id='LC55'><span class="cm"> * object which you can cast or query for type. There are also typed</span></div><div class='line' id='LC56'><span class="cm"> * &lt;code&gt;get&lt;/code&gt; and &lt;code&gt;opt&lt;/code&gt; methods that do type checking and type</span></div><div class='line' id='LC57'><span class="cm"> * coercion for you.</span></div><div class='line' id='LC58'><span class="cm"> * &lt;p&gt;</span></div><div class='line' id='LC59'><span class="cm"> * The texts produced by the &lt;code&gt;toString&lt;/code&gt; methods strictly conform to</span></div><div class='line' id='LC60'><span class="cm"> * JSON syntax rules. The constructors are more forgiving in the texts they will</span></div><div class='line' id='LC61'><span class="cm"> * accept:</span></div><div class='line' id='LC62'><span class="cm"> * &lt;ul&gt;</span></div><div class='line' id='LC63'><span class="cm"> * &lt;li&gt;An extra &lt;code&gt;,&lt;/code&gt;&amp;nbsp;&lt;small&gt;(comma)&lt;/small&gt; may appear just</span></div><div class='line' id='LC64'><span class="cm"> * before the closing bracket.&lt;/li&gt;</span></div><div class='line' id='LC65'><span class="cm"> * &lt;li&gt;The &lt;code&gt;null&lt;/code&gt; value will be inserted when there is &lt;code&gt;,&lt;/code&gt;</span></div><div class='line' id='LC66'><span class="cm"> * &amp;nbsp;&lt;small&gt;(comma)&lt;/small&gt; elision.&lt;/li&gt;</span></div><div class='line' id='LC67'><span class="cm"> * &lt;li&gt;Strings may be quoted with &lt;code&gt;&#39;&lt;/code&gt;&amp;nbsp;&lt;small&gt;(single</span></div><div class='line' id='LC68'><span class="cm"> * quote)&lt;/small&gt;.&lt;/li&gt;</span></div><div class='line' id='LC69'><span class="cm"> * &lt;li&gt;Strings do not need to be quoted at all if they do not begin with a quote</span></div><div class='line' id='LC70'><span class="cm"> * or single quote, and if they do not contain leading or trailing spaces, and</span></div><div class='line' id='LC71'><span class="cm"> * if they do not contain any of these characters:</span></div><div class='line' id='LC72'><span class="cm"> * &lt;code&gt;{ } [ ] / \ : , #&lt;/code&gt; and if they do not look like numbers and</span></div><div class='line' id='LC73'><span class="cm"> * if they are not the reserved words &lt;code&gt;true&lt;/code&gt;, &lt;code&gt;false&lt;/code&gt;, or</span></div><div class='line' id='LC74'><span class="cm"> * &lt;code&gt;null&lt;/code&gt;.&lt;/li&gt;</span></div><div class='line' id='LC75'><span class="cm"> * &lt;/ul&gt;</span></div><div class='line' id='LC76'><span class="cm"> *</span></div><div class='line' id='LC77'><span class="cm"> * @author JSON.org</span></div><div class='line' id='LC78'><span class="cm"> * @version 2014-05-03</span></div><div class='line' id='LC79'><span class="cm"> */</span></div><div class='line' id='LC80'><span class="kd">public</span> <span class="kd">class</span> <span class="nc">JSONArray</span> <span class="o">{</span></div><div class='line' id='LC81'><br/></div><div class='line' id='LC82'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC83'><span class="cm">     * The arrayList where the JSONArray&#39;s properties are kept.</span></div><div class='line' id='LC84'><span class="cm">     */</span></div><div class='line' id='LC85'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">private</span> <span class="kd">final</span> <span class="n">ArrayList</span><span class="o">&lt;</span><span class="n">Object</span><span class="o">&gt;</span> <span class="n">myArrayList</span><span class="o">;</span></div><div class='line' id='LC86'><br/></div><div class='line' id='LC87'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC88'><span class="cm">     * Construct an empty JSONArray.</span></div><div class='line' id='LC89'><span class="cm">     */</span></div><div class='line' id='LC90'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="nf">JSONArray</span><span class="o">()</span> <span class="o">{</span></div><div class='line' id='LC91'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">this</span><span class="o">.</span><span class="na">myArrayList</span> <span class="o">=</span> <span class="k">new</span> <span class="n">ArrayList</span><span class="o">&lt;</span><span class="n">Object</span><span class="o">&gt;();</span></div><div class='line' id='LC92'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC93'><br/></div><div class='line' id='LC94'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC95'><span class="cm">     * Construct a JSONArray from a JSONTokener.</span></div><div class='line' id='LC96'><span class="cm">     *</span></div><div class='line' id='LC97'><span class="cm">     * @param x</span></div><div class='line' id='LC98'><span class="cm">     *            A JSONTokener</span></div><div class='line' id='LC99'><span class="cm">     * @throws JSONException</span></div><div class='line' id='LC100'><span class="cm">     *             If there is a syntax error.</span></div><div class='line' id='LC101'><span class="cm">     */</span></div><div class='line' id='LC102'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="nf">JSONArray</span><span class="o">(</span><span class="n">JSONTokener</span> <span class="n">x</span><span class="o">)</span> <span class="kd">throws</span> <span class="n">JSONException</span> <span class="o">{</span></div><div class='line' id='LC103'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">this</span><span class="o">();</span></div><div class='line' id='LC104'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(</span><span class="n">x</span><span class="o">.</span><span class="na">nextClean</span><span class="o">()</span> <span class="o">!=</span> <span class="sc">&#39;[&#39;</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC105'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">throw</span> <span class="n">x</span><span class="o">.</span><span class="na">syntaxError</span><span class="o">(</span><span class="s">&quot;A JSONArray text must start with &#39;[&#39;&quot;</span><span class="o">);</span></div><div class='line' id='LC106'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC107'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(</span><span class="n">x</span><span class="o">.</span><span class="na">nextClean</span><span class="o">()</span> <span class="o">!=</span> <span class="sc">&#39;]&#39;</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC108'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">x</span><span class="o">.</span><span class="na">back</span><span class="o">();</span></div><div class='line' id='LC109'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">for</span> <span class="o">(;;)</span> <span class="o">{</span></div><div class='line' id='LC110'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(</span><span class="n">x</span><span class="o">.</span><span class="na">nextClean</span><span class="o">()</span> <span class="o">==</span> <span class="sc">&#39;,&#39;</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC111'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">x</span><span class="o">.</span><span class="na">back</span><span class="o">();</span></div><div class='line' id='LC112'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">this</span><span class="o">.</span><span class="na">myArrayList</span><span class="o">.</span><span class="na">add</span><span class="o">(</span><span class="n">JSONObject</span><span class="o">.</span><span class="na">NULL</span><span class="o">);</span></div><div class='line' id='LC113'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span> <span class="k">else</span> <span class="o">{</span></div><div class='line' id='LC114'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">x</span><span class="o">.</span><span class="na">back</span><span class="o">();</span></div><div class='line' id='LC115'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">this</span><span class="o">.</span><span class="na">myArrayList</span><span class="o">.</span><span class="na">add</span><span class="o">(</span><span class="n">x</span><span class="o">.</span><span class="na">nextValue</span><span class="o">());</span></div><div class='line' id='LC116'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC117'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">switch</span> <span class="o">(</span><span class="n">x</span><span class="o">.</span><span class="na">nextClean</span><span class="o">())</span> <span class="o">{</span></div><div class='line' id='LC118'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">case</span> <span class="sc">&#39;,&#39;</span><span class="o">:</span></div><div class='line' id='LC119'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(</span><span class="n">x</span><span class="o">.</span><span class="na">nextClean</span><span class="o">()</span> <span class="o">==</span> <span class="sc">&#39;]&#39;</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC120'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span><span class="o">;</span></div><div class='line' id='LC121'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC122'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">x</span><span class="o">.</span><span class="na">back</span><span class="o">();</span></div><div class='line' id='LC123'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">break</span><span class="o">;</span></div><div class='line' id='LC124'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">case</span> <span class="sc">&#39;]&#39;</span><span class="o">:</span></div><div class='line' id='LC125'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span><span class="o">;</span></div><div class='line' id='LC126'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">default</span><span class="o">:</span></div><div class='line' id='LC127'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">throw</span> <span class="n">x</span><span class="o">.</span><span class="na">syntaxError</span><span class="o">(</span><span class="s">&quot;Expected a &#39;,&#39; or &#39;]&#39;&quot;</span><span class="o">);</span></div><div class='line' id='LC128'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC129'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC130'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC131'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC132'><br/></div><div class='line' id='LC133'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC134'><span class="cm">     * Construct a JSONArray from a source JSON text.</span></div><div class='line' id='LC135'><span class="cm">     *</span></div><div class='line' id='LC136'><span class="cm">     * @param source</span></div><div class='line' id='LC137'><span class="cm">     *            A string that begins with &lt;code&gt;[&lt;/code&gt;&amp;nbsp;&lt;small&gt;(left</span></div><div class='line' id='LC138'><span class="cm">     *            bracket)&lt;/small&gt; and ends with &lt;code&gt;]&lt;/code&gt;</span></div><div class='line' id='LC139'><span class="cm">     *            &amp;nbsp;&lt;small&gt;(right bracket)&lt;/small&gt;.</span></div><div class='line' id='LC140'><span class="cm">     * @throws JSONException</span></div><div class='line' id='LC141'><span class="cm">     *             If there is a syntax error.</span></div><div class='line' id='LC142'><span class="cm">     */</span></div><div class='line' id='LC143'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="nf">JSONArray</span><span class="o">(</span><span class="n">String</span> <span class="n">source</span><span class="o">)</span> <span class="kd">throws</span> <span class="n">JSONException</span> <span class="o">{</span></div><div class='line' id='LC144'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">this</span><span class="o">(</span><span class="k">new</span> <span class="n">JSONTokener</span><span class="o">(</span><span class="n">source</span><span class="o">));</span></div><div class='line' id='LC145'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC146'><br/></div><div class='line' id='LC147'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC148'><span class="cm">     * Construct a JSONArray from a Collection.</span></div><div class='line' id='LC149'><span class="cm">     *</span></div><div class='line' id='LC150'><span class="cm">     * @param collection</span></div><div class='line' id='LC151'><span class="cm">     *            A Collection.</span></div><div class='line' id='LC152'><span class="cm">     */</span></div><div class='line' id='LC153'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="nf">JSONArray</span><span class="o">(</span><span class="n">Collection</span><span class="o">&lt;</span><span class="n">Object</span><span class="o">&gt;</span> <span class="n">collection</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC154'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">this</span><span class="o">.</span><span class="na">myArrayList</span> <span class="o">=</span> <span class="k">new</span> <span class="n">ArrayList</span><span class="o">&lt;</span><span class="n">Object</span><span class="o">&gt;();</span></div><div class='line' id='LC155'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(</span><span class="n">collection</span> <span class="o">!=</span> <span class="kc">null</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC156'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">Iterator</span><span class="o">&lt;</span><span class="n">Object</span><span class="o">&gt;</span> <span class="n">iter</span> <span class="o">=</span> <span class="n">collection</span><span class="o">.</span><span class="na">iterator</span><span class="o">();</span></div><div class='line' id='LC157'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">while</span> <span class="o">(</span><span class="n">iter</span><span class="o">.</span><span class="na">hasNext</span><span class="o">())</span> <span class="o">{</span></div><div class='line' id='LC158'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">this</span><span class="o">.</span><span class="na">myArrayList</span><span class="o">.</span><span class="na">add</span><span class="o">(</span><span class="n">JSONObject</span><span class="o">.</span><span class="na">wrap</span><span class="o">(</span><span class="n">iter</span><span class="o">.</span><span class="na">next</span><span class="o">()));</span></div><div class='line' id='LC159'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC160'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC161'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC162'><br/></div><div class='line' id='LC163'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC164'><span class="cm">     * Construct a JSONArray from an array</span></div><div class='line' id='LC165'><span class="cm">     *</span></div><div class='line' id='LC166'><span class="cm">     * @throws JSONException</span></div><div class='line' id='LC167'><span class="cm">     *             If not an array.</span></div><div class='line' id='LC168'><span class="cm">     */</span></div><div class='line' id='LC169'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="nf">JSONArray</span><span class="o">(</span><span class="n">Object</span> <span class="n">array</span><span class="o">)</span> <span class="kd">throws</span> <span class="n">JSONException</span> <span class="o">{</span></div><div class='line' id='LC170'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">this</span><span class="o">();</span></div><div class='line' id='LC171'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(</span><span class="n">array</span><span class="o">.</span><span class="na">getClass</span><span class="o">().</span><span class="na">isArray</span><span class="o">())</span> <span class="o">{</span></div><div class='line' id='LC172'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kt">int</span> <span class="n">length</span> <span class="o">=</span> <span class="n">Array</span><span class="o">.</span><span class="na">getLength</span><span class="o">(</span><span class="n">array</span><span class="o">);</span></div><div class='line' id='LC173'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">for</span> <span class="o">(</span><span class="kt">int</span> <span class="n">i</span> <span class="o">=</span> <span class="mi">0</span><span class="o">;</span> <span class="n">i</span> <span class="o">&lt;</span> <span class="n">length</span><span class="o">;</span> <span class="n">i</span> <span class="o">+=</span> <span class="mi">1</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC174'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">this</span><span class="o">.</span><span class="na">put</span><span class="o">(</span><span class="n">JSONObject</span><span class="o">.</span><span class="na">wrap</span><span class="o">(</span><span class="n">Array</span><span class="o">.</span><span class="na">get</span><span class="o">(</span><span class="n">array</span><span class="o">,</span> <span class="n">i</span><span class="o">)));</span></div><div class='line' id='LC175'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC176'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span> <span class="k">else</span> <span class="o">{</span></div><div class='line' id='LC177'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">throw</span> <span class="k">new</span> <span class="nf">JSONException</span><span class="o">(</span></div><div class='line' id='LC178'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="s">&quot;JSONArray initial value should be a string or collection or array.&quot;</span><span class="o">);</span></div><div class='line' id='LC179'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC180'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC181'><br/></div><div class='line' id='LC182'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC183'><span class="cm">     * Get the object value associated with an index.</span></div><div class='line' id='LC184'><span class="cm">     *</span></div><div class='line' id='LC185'><span class="cm">     * @param index</span></div><div class='line' id='LC186'><span class="cm">     *            The index must be between 0 and length() - 1.</span></div><div class='line' id='LC187'><span class="cm">     * @return An object value.</span></div><div class='line' id='LC188'><span class="cm">     * @throws JSONException</span></div><div class='line' id='LC189'><span class="cm">     *             If there is no value for the index.</span></div><div class='line' id='LC190'><span class="cm">     */</span></div><div class='line' id='LC191'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="n">Object</span> <span class="nf">get</span><span class="o">(</span><span class="kt">int</span> <span class="n">index</span><span class="o">)</span> <span class="kd">throws</span> <span class="n">JSONException</span> <span class="o">{</span></div><div class='line' id='LC192'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">Object</span> <span class="n">object</span> <span class="o">=</span> <span class="k">this</span><span class="o">.</span><span class="na">opt</span><span class="o">(</span><span class="n">index</span><span class="o">);</span></div><div class='line' id='LC193'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(</span><span class="n">object</span> <span class="o">==</span> <span class="kc">null</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC194'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">throw</span> <span class="k">new</span> <span class="nf">JSONException</span><span class="o">(</span><span class="s">&quot;JSONArray[&quot;</span> <span class="o">+</span> <span class="n">index</span> <span class="o">+</span> <span class="s">&quot;] not found.&quot;</span><span class="o">);</span></div><div class='line' id='LC195'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC196'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="n">object</span><span class="o">;</span></div><div class='line' id='LC197'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC198'><br/></div><div class='line' id='LC199'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC200'><span class="cm">     * Get the boolean value associated with an index. The string values &quot;true&quot;</span></div><div class='line' id='LC201'><span class="cm">     * and &quot;false&quot; are converted to boolean.</span></div><div class='line' id='LC202'><span class="cm">     *</span></div><div class='line' id='LC203'><span class="cm">     * @param index</span></div><div class='line' id='LC204'><span class="cm">     *            The index must be between 0 and length() - 1.</span></div><div class='line' id='LC205'><span class="cm">     * @return The truth.</span></div><div class='line' id='LC206'><span class="cm">     * @throws JSONException</span></div><div class='line' id='LC207'><span class="cm">     *             If there is no value for the index or if the value is not</span></div><div class='line' id='LC208'><span class="cm">     *             convertible to boolean.</span></div><div class='line' id='LC209'><span class="cm">     */</span></div><div class='line' id='LC210'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="kt">boolean</span> <span class="nf">getBoolean</span><span class="o">(</span><span class="kt">int</span> <span class="n">index</span><span class="o">)</span> <span class="kd">throws</span> <span class="n">JSONException</span> <span class="o">{</span></div><div class='line' id='LC211'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">Object</span> <span class="n">object</span> <span class="o">=</span> <span class="k">this</span><span class="o">.</span><span class="na">get</span><span class="o">(</span><span class="n">index</span><span class="o">);</span></div><div class='line' id='LC212'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(</span><span class="n">object</span><span class="o">.</span><span class="na">equals</span><span class="o">(</span><span class="n">Boolean</span><span class="o">.</span><span class="na">FALSE</span><span class="o">)</span></div><div class='line' id='LC213'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">||</span> <span class="o">(</span><span class="n">object</span> <span class="k">instanceof</span> <span class="n">String</span> <span class="o">&amp;&amp;</span> <span class="o">((</span><span class="n">String</span><span class="o">)</span> <span class="n">object</span><span class="o">)</span></div><div class='line' id='LC214'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">.</span><span class="na">equalsIgnoreCase</span><span class="o">(</span><span class="s">&quot;false&quot;</span><span class="o">)))</span> <span class="o">{</span></div><div class='line' id='LC215'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="kc">false</span><span class="o">;</span></div><div class='line' id='LC216'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span> <span class="k">else</span> <span class="k">if</span> <span class="o">(</span><span class="n">object</span><span class="o">.</span><span class="na">equals</span><span class="o">(</span><span class="n">Boolean</span><span class="o">.</span><span class="na">TRUE</span><span class="o">)</span></div><div class='line' id='LC217'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">||</span> <span class="o">(</span><span class="n">object</span> <span class="k">instanceof</span> <span class="n">String</span> <span class="o">&amp;&amp;</span> <span class="o">((</span><span class="n">String</span><span class="o">)</span> <span class="n">object</span><span class="o">)</span></div><div class='line' id='LC218'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">.</span><span class="na">equalsIgnoreCase</span><span class="o">(</span><span class="s">&quot;true&quot;</span><span class="o">)))</span> <span class="o">{</span></div><div class='line' id='LC219'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="kc">true</span><span class="o">;</span></div><div class='line' id='LC220'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC221'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">throw</span> <span class="k">new</span> <span class="nf">JSONException</span><span class="o">(</span><span class="s">&quot;JSONArray[&quot;</span> <span class="o">+</span> <span class="n">index</span> <span class="o">+</span> <span class="s">&quot;] is not a boolean.&quot;</span><span class="o">);</span></div><div class='line' id='LC222'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC223'><br/></div><div class='line' id='LC224'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC225'><span class="cm">     * Get the double value associated with an index.</span></div><div class='line' id='LC226'><span class="cm">     *</span></div><div class='line' id='LC227'><span class="cm">     * @param index</span></div><div class='line' id='LC228'><span class="cm">     *            The index must be between 0 and length() - 1.</span></div><div class='line' id='LC229'><span class="cm">     * @return The value.</span></div><div class='line' id='LC230'><span class="cm">     * @throws JSONException</span></div><div class='line' id='LC231'><span class="cm">     *             If the key is not found or if the value cannot be converted</span></div><div class='line' id='LC232'><span class="cm">     *             to a number.</span></div><div class='line' id='LC233'><span class="cm">     */</span></div><div class='line' id='LC234'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="kt">double</span> <span class="nf">getDouble</span><span class="o">(</span><span class="kt">int</span> <span class="n">index</span><span class="o">)</span> <span class="kd">throws</span> <span class="n">JSONException</span> <span class="o">{</span></div><div class='line' id='LC235'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">Object</span> <span class="n">object</span> <span class="o">=</span> <span class="k">this</span><span class="o">.</span><span class="na">get</span><span class="o">(</span><span class="n">index</span><span class="o">);</span></div><div class='line' id='LC236'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">try</span> <span class="o">{</span></div><div class='line' id='LC237'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="n">object</span> <span class="k">instanceof</span> <span class="n">Number</span> <span class="o">?</span> <span class="o">((</span><span class="n">Number</span><span class="o">)</span> <span class="n">object</span><span class="o">).</span><span class="na">doubleValue</span><span class="o">()</span></div><div class='line' id='LC238'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">:</span> <span class="n">Double</span><span class="o">.</span><span class="na">parseDouble</span><span class="o">((</span><span class="n">String</span><span class="o">)</span> <span class="n">object</span><span class="o">);</span></div><div class='line' id='LC239'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span> <span class="k">catch</span> <span class="o">(</span><span class="n">Exception</span> <span class="n">e</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC240'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">throw</span> <span class="k">new</span> <span class="nf">JSONException</span><span class="o">(</span><span class="s">&quot;JSONArray[&quot;</span> <span class="o">+</span> <span class="n">index</span> <span class="o">+</span> <span class="s">&quot;] is not a number.&quot;</span><span class="o">);</span></div><div class='line' id='LC241'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC242'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC243'><br/></div><div class='line' id='LC244'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC245'><span class="cm">     * Get the int value associated with an index.</span></div><div class='line' id='LC246'><span class="cm">     *</span></div><div class='line' id='LC247'><span class="cm">     * @param index</span></div><div class='line' id='LC248'><span class="cm">     *            The index must be between 0 and length() - 1.</span></div><div class='line' id='LC249'><span class="cm">     * @return The value.</span></div><div class='line' id='LC250'><span class="cm">     * @throws JSONException</span></div><div class='line' id='LC251'><span class="cm">     *             If the key is not found or if the value is not a number.</span></div><div class='line' id='LC252'><span class="cm">     */</span></div><div class='line' id='LC253'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="kt">int</span> <span class="nf">getInt</span><span class="o">(</span><span class="kt">int</span> <span class="n">index</span><span class="o">)</span> <span class="kd">throws</span> <span class="n">JSONException</span> <span class="o">{</span></div><div class='line' id='LC254'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">Object</span> <span class="n">object</span> <span class="o">=</span> <span class="k">this</span><span class="o">.</span><span class="na">get</span><span class="o">(</span><span class="n">index</span><span class="o">);</span></div><div class='line' id='LC255'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">try</span> <span class="o">{</span></div><div class='line' id='LC256'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="n">object</span> <span class="k">instanceof</span> <span class="n">Number</span> <span class="o">?</span> <span class="o">((</span><span class="n">Number</span><span class="o">)</span> <span class="n">object</span><span class="o">).</span><span class="na">intValue</span><span class="o">()</span></div><div class='line' id='LC257'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">:</span> <span class="n">Integer</span><span class="o">.</span><span class="na">parseInt</span><span class="o">((</span><span class="n">String</span><span class="o">)</span> <span class="n">object</span><span class="o">);</span></div><div class='line' id='LC258'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span> <span class="k">catch</span> <span class="o">(</span><span class="n">Exception</span> <span class="n">e</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC259'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">throw</span> <span class="k">new</span> <span class="nf">JSONException</span><span class="o">(</span><span class="s">&quot;JSONArray[&quot;</span> <span class="o">+</span> <span class="n">index</span> <span class="o">+</span> <span class="s">&quot;] is not a number.&quot;</span><span class="o">);</span></div><div class='line' id='LC260'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC261'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC262'><br/></div><div class='line' id='LC263'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC264'><span class="cm">     * Get the JSONArray associated with an index.</span></div><div class='line' id='LC265'><span class="cm">     *</span></div><div class='line' id='LC266'><span class="cm">     * @param index</span></div><div class='line' id='LC267'><span class="cm">     *            The index must be between 0 and length() - 1.</span></div><div class='line' id='LC268'><span class="cm">     * @return A JSONArray value.</span></div><div class='line' id='LC269'><span class="cm">     * @throws JSONException</span></div><div class='line' id='LC270'><span class="cm">     *             If there is no value for the index. or if the value is not a</span></div><div class='line' id='LC271'><span class="cm">     *             JSONArray</span></div><div class='line' id='LC272'><span class="cm">     */</span></div><div class='line' id='LC273'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="n">JSONArray</span> <span class="nf">getJSONArray</span><span class="o">(</span><span class="kt">int</span> <span class="n">index</span><span class="o">)</span> <span class="kd">throws</span> <span class="n">JSONException</span> <span class="o">{</span></div><div class='line' id='LC274'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">Object</span> <span class="n">object</span> <span class="o">=</span> <span class="k">this</span><span class="o">.</span><span class="na">get</span><span class="o">(</span><span class="n">index</span><span class="o">);</span></div><div class='line' id='LC275'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(</span><span class="n">object</span> <span class="k">instanceof</span> <span class="n">JSONArray</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC276'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="o">(</span><span class="n">JSONArray</span><span class="o">)</span> <span class="n">object</span><span class="o">;</span></div><div class='line' id='LC277'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC278'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">throw</span> <span class="k">new</span> <span class="nf">JSONException</span><span class="o">(</span><span class="s">&quot;JSONArray[&quot;</span> <span class="o">+</span> <span class="n">index</span> <span class="o">+</span> <span class="s">&quot;] is not a JSONArray.&quot;</span><span class="o">);</span></div><div class='line' id='LC279'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC280'><br/></div><div class='line' id='LC281'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC282'><span class="cm">     * Get the JSONObject associated with an index.</span></div><div class='line' id='LC283'><span class="cm">     *</span></div><div class='line' id='LC284'><span class="cm">     * @param index</span></div><div class='line' id='LC285'><span class="cm">     *            subscript</span></div><div class='line' id='LC286'><span class="cm">     * @return A JSONObject value.</span></div><div class='line' id='LC287'><span class="cm">     * @throws JSONException</span></div><div class='line' id='LC288'><span class="cm">     *             If there is no value for the index or if the value is not a</span></div><div class='line' id='LC289'><span class="cm">     *             JSONObject</span></div><div class='line' id='LC290'><span class="cm">     */</span></div><div class='line' id='LC291'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="n">JSONObject</span> <span class="nf">getJSONObject</span><span class="o">(</span><span class="kt">int</span> <span class="n">index</span><span class="o">)</span> <span class="kd">throws</span> <span class="n">JSONException</span> <span class="o">{</span></div><div class='line' id='LC292'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">Object</span> <span class="n">object</span> <span class="o">=</span> <span class="k">this</span><span class="o">.</span><span class="na">get</span><span class="o">(</span><span class="n">index</span><span class="o">);</span></div><div class='line' id='LC293'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(</span><span class="n">object</span> <span class="k">instanceof</span> <span class="n">JSONObject</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC294'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="o">(</span><span class="n">JSONObject</span><span class="o">)</span> <span class="n">object</span><span class="o">;</span></div><div class='line' id='LC295'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC296'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">throw</span> <span class="k">new</span> <span class="nf">JSONException</span><span class="o">(</span><span class="s">&quot;JSONArray[&quot;</span> <span class="o">+</span> <span class="n">index</span> <span class="o">+</span> <span class="s">&quot;] is not a JSONObject.&quot;</span><span class="o">);</span></div><div class='line' id='LC297'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC298'><br/></div><div class='line' id='LC299'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC300'><span class="cm">     * Get the long value associated with an index.</span></div><div class='line' id='LC301'><span class="cm">     *</span></div><div class='line' id='LC302'><span class="cm">     * @param index</span></div><div class='line' id='LC303'><span class="cm">     *            The index must be between 0 and length() - 1.</span></div><div class='line' id='LC304'><span class="cm">     * @return The value.</span></div><div class='line' id='LC305'><span class="cm">     * @throws JSONException</span></div><div class='line' id='LC306'><span class="cm">     *             If the key is not found or if the value cannot be converted</span></div><div class='line' id='LC307'><span class="cm">     *             to a number.</span></div><div class='line' id='LC308'><span class="cm">     */</span></div><div class='line' id='LC309'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="kt">long</span> <span class="nf">getLong</span><span class="o">(</span><span class="kt">int</span> <span class="n">index</span><span class="o">)</span> <span class="kd">throws</span> <span class="n">JSONException</span> <span class="o">{</span></div><div class='line' id='LC310'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">Object</span> <span class="n">object</span> <span class="o">=</span> <span class="k">this</span><span class="o">.</span><span class="na">get</span><span class="o">(</span><span class="n">index</span><span class="o">);</span></div><div class='line' id='LC311'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">try</span> <span class="o">{</span></div><div class='line' id='LC312'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="n">object</span> <span class="k">instanceof</span> <span class="n">Number</span> <span class="o">?</span> <span class="o">((</span><span class="n">Number</span><span class="o">)</span> <span class="n">object</span><span class="o">).</span><span class="na">longValue</span><span class="o">()</span></div><div class='line' id='LC313'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">:</span> <span class="n">Long</span><span class="o">.</span><span class="na">parseLong</span><span class="o">((</span><span class="n">String</span><span class="o">)</span> <span class="n">object</span><span class="o">);</span></div><div class='line' id='LC314'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span> <span class="k">catch</span> <span class="o">(</span><span class="n">Exception</span> <span class="n">e</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC315'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">throw</span> <span class="k">new</span> <span class="nf">JSONException</span><span class="o">(</span><span class="s">&quot;JSONArray[&quot;</span> <span class="o">+</span> <span class="n">index</span> <span class="o">+</span> <span class="s">&quot;] is not a number.&quot;</span><span class="o">);</span></div><div class='line' id='LC316'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC317'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC318'><br/></div><div class='line' id='LC319'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC320'><span class="cm">     * Get the string associated with an index.</span></div><div class='line' id='LC321'><span class="cm">     *</span></div><div class='line' id='LC322'><span class="cm">     * @param index</span></div><div class='line' id='LC323'><span class="cm">     *            The index must be between 0 and length() - 1.</span></div><div class='line' id='LC324'><span class="cm">     * @return A string value.</span></div><div class='line' id='LC325'><span class="cm">     * @throws JSONException</span></div><div class='line' id='LC326'><span class="cm">     *             If there is no string value for the index.</span></div><div class='line' id='LC327'><span class="cm">     */</span></div><div class='line' id='LC328'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="n">String</span> <span class="nf">getString</span><span class="o">(</span><span class="kt">int</span> <span class="n">index</span><span class="o">)</span> <span class="kd">throws</span> <span class="n">JSONException</span> <span class="o">{</span></div><div class='line' id='LC329'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">Object</span> <span class="n">object</span> <span class="o">=</span> <span class="k">this</span><span class="o">.</span><span class="na">get</span><span class="o">(</span><span class="n">index</span><span class="o">);</span></div><div class='line' id='LC330'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(</span><span class="n">object</span> <span class="k">instanceof</span> <span class="n">String</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC331'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="o">(</span><span class="n">String</span><span class="o">)</span> <span class="n">object</span><span class="o">;</span></div><div class='line' id='LC332'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC333'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">throw</span> <span class="k">new</span> <span class="nf">JSONException</span><span class="o">(</span><span class="s">&quot;JSONArray[&quot;</span> <span class="o">+</span> <span class="n">index</span> <span class="o">+</span> <span class="s">&quot;] not a string.&quot;</span><span class="o">);</span></div><div class='line' id='LC334'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC335'><br/></div><div class='line' id='LC336'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC337'><span class="cm">     * Determine if the value is null.</span></div><div class='line' id='LC338'><span class="cm">     *</span></div><div class='line' id='LC339'><span class="cm">     * @param index</span></div><div class='line' id='LC340'><span class="cm">     *            The index must be between 0 and length() - 1.</span></div><div class='line' id='LC341'><span class="cm">     * @return true if the value at the index is null, or if there is no value.</span></div><div class='line' id='LC342'><span class="cm">     */</span></div><div class='line' id='LC343'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="kt">boolean</span> <span class="nf">isNull</span><span class="o">(</span><span class="kt">int</span> <span class="n">index</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC344'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="n">JSONObject</span><span class="o">.</span><span class="na">NULL</span><span class="o">.</span><span class="na">equals</span><span class="o">(</span><span class="k">this</span><span class="o">.</span><span class="na">opt</span><span class="o">(</span><span class="n">index</span><span class="o">));</span></div><div class='line' id='LC345'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC346'><br/></div><div class='line' id='LC347'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC348'><span class="cm">     * Make a string from the contents of this JSONArray. The</span></div><div class='line' id='LC349'><span class="cm">     * &lt;code&gt;separator&lt;/code&gt; string is inserted between each element. Warning:</span></div><div class='line' id='LC350'><span class="cm">     * This method assumes that the data structure is acyclical.</span></div><div class='line' id='LC351'><span class="cm">     *</span></div><div class='line' id='LC352'><span class="cm">     * @param separator</span></div><div class='line' id='LC353'><span class="cm">     *            A string that will be inserted between the elements.</span></div><div class='line' id='LC354'><span class="cm">     * @return a string.</span></div><div class='line' id='LC355'><span class="cm">     * @throws JSONException</span></div><div class='line' id='LC356'><span class="cm">     *             If the array contains an invalid number.</span></div><div class='line' id='LC357'><span class="cm">     */</span></div><div class='line' id='LC358'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="n">String</span> <span class="nf">join</span><span class="o">(</span><span class="n">String</span> <span class="n">separator</span><span class="o">)</span> <span class="kd">throws</span> <span class="n">JSONException</span> <span class="o">{</span></div><div class='line' id='LC359'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kt">int</span> <span class="n">len</span> <span class="o">=</span> <span class="k">this</span><span class="o">.</span><span class="na">length</span><span class="o">();</span></div><div class='line' id='LC360'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">StringBuilder</span> <span class="n">sb</span> <span class="o">=</span> <span class="k">new</span> <span class="n">StringBuilder</span><span class="o">();</span></div><div class='line' id='LC361'><br/></div><div class='line' id='LC362'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">for</span> <span class="o">(</span><span class="kt">int</span> <span class="n">i</span> <span class="o">=</span> <span class="mi">0</span><span class="o">;</span> <span class="n">i</span> <span class="o">&lt;</span> <span class="n">len</span><span class="o">;</span> <span class="n">i</span> <span class="o">+=</span> <span class="mi">1</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC363'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(</span><span class="n">i</span> <span class="o">&gt;</span> <span class="mi">0</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC364'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">sb</span><span class="o">.</span><span class="na">append</span><span class="o">(</span><span class="n">separator</span><span class="o">);</span></div><div class='line' id='LC365'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC366'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">sb</span><span class="o">.</span><span class="na">append</span><span class="o">(</span><span class="n">JSONObject</span><span class="o">.</span><span class="na">valueToString</span><span class="o">(</span><span class="k">this</span><span class="o">.</span><span class="na">myArrayList</span><span class="o">.</span><span class="na">get</span><span class="o">(</span><span class="n">i</span><span class="o">)));</span></div><div class='line' id='LC367'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC368'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="n">sb</span><span class="o">.</span><span class="na">toString</span><span class="o">();</span></div><div class='line' id='LC369'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC370'><br/></div><div class='line' id='LC371'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC372'><span class="cm">     * Get the number of elements in the JSONArray, included nulls.</span></div><div class='line' id='LC373'><span class="cm">     *</span></div><div class='line' id='LC374'><span class="cm">     * @return The length (or size).</span></div><div class='line' id='LC375'><span class="cm">     */</span></div><div class='line' id='LC376'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="kt">int</span> <span class="nf">length</span><span class="o">()</span> <span class="o">{</span></div><div class='line' id='LC377'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="k">this</span><span class="o">.</span><span class="na">myArrayList</span><span class="o">.</span><span class="na">size</span><span class="o">();</span></div><div class='line' id='LC378'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC379'><br/></div><div class='line' id='LC380'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC381'><span class="cm">     * Get the optional object value associated with an index.</span></div><div class='line' id='LC382'><span class="cm">     *</span></div><div class='line' id='LC383'><span class="cm">     * @param index</span></div><div class='line' id='LC384'><span class="cm">     *            The index must be between 0 and length() - 1.</span></div><div class='line' id='LC385'><span class="cm">     * @return An object value, or null if there is no object at that index.</span></div><div class='line' id='LC386'><span class="cm">     */</span></div><div class='line' id='LC387'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="n">Object</span> <span class="nf">opt</span><span class="o">(</span><span class="kt">int</span> <span class="n">index</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC388'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="o">(</span><span class="n">index</span> <span class="o">&lt;</span> <span class="mi">0</span> <span class="o">||</span> <span class="n">index</span> <span class="o">&gt;=</span> <span class="k">this</span><span class="o">.</span><span class="na">length</span><span class="o">())</span> <span class="o">?</span> <span class="kc">null</span> <span class="o">:</span> <span class="k">this</span><span class="o">.</span><span class="na">myArrayList</span></div><div class='line' id='LC389'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">.</span><span class="na">get</span><span class="o">(</span><span class="n">index</span><span class="o">);</span></div><div class='line' id='LC390'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC391'><br/></div><div class='line' id='LC392'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC393'><span class="cm">     * Get the optional boolean value associated with an index. It returns false</span></div><div class='line' id='LC394'><span class="cm">     * if there is no value at that index, or if the value is not Boolean.TRUE</span></div><div class='line' id='LC395'><span class="cm">     * or the String &quot;true&quot;.</span></div><div class='line' id='LC396'><span class="cm">     *</span></div><div class='line' id='LC397'><span class="cm">     * @param index</span></div><div class='line' id='LC398'><span class="cm">     *            The index must be between 0 and length() - 1.</span></div><div class='line' id='LC399'><span class="cm">     * @return The truth.</span></div><div class='line' id='LC400'><span class="cm">     */</span></div><div class='line' id='LC401'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="kt">boolean</span> <span class="nf">optBoolean</span><span class="o">(</span><span class="kt">int</span> <span class="n">index</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC402'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="k">this</span><span class="o">.</span><span class="na">optBoolean</span><span class="o">(</span><span class="n">index</span><span class="o">,</span> <span class="kc">false</span><span class="o">);</span></div><div class='line' id='LC403'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC404'><br/></div><div class='line' id='LC405'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC406'><span class="cm">     * Get the optional boolean value associated with an index. It returns the</span></div><div class='line' id='LC407'><span class="cm">     * defaultValue if there is no value at that index or if it is not a Boolean</span></div><div class='line' id='LC408'><span class="cm">     * or the String &quot;true&quot; or &quot;false&quot; (case insensitive).</span></div><div class='line' id='LC409'><span class="cm">     *</span></div><div class='line' id='LC410'><span class="cm">     * @param index</span></div><div class='line' id='LC411'><span class="cm">     *            The index must be between 0 and length() - 1.</span></div><div class='line' id='LC412'><span class="cm">     * @param defaultValue</span></div><div class='line' id='LC413'><span class="cm">     *            A boolean default.</span></div><div class='line' id='LC414'><span class="cm">     * @return The truth.</span></div><div class='line' id='LC415'><span class="cm">     */</span></div><div class='line' id='LC416'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="kt">boolean</span> <span class="nf">optBoolean</span><span class="o">(</span><span class="kt">int</span> <span class="n">index</span><span class="o">,</span> <span class="kt">boolean</span> <span class="n">defaultValue</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC417'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">try</span> <span class="o">{</span></div><div class='line' id='LC418'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="k">this</span><span class="o">.</span><span class="na">getBoolean</span><span class="o">(</span><span class="n">index</span><span class="o">);</span></div><div class='line' id='LC419'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span> <span class="k">catch</span> <span class="o">(</span><span class="n">Exception</span> <span class="n">e</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC420'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="n">defaultValue</span><span class="o">;</span></div><div class='line' id='LC421'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC422'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC423'><br/></div><div class='line' id='LC424'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC425'><span class="cm">     * Get the optional double value associated with an index. NaN is returned</span></div><div class='line' id='LC426'><span class="cm">     * if there is no value for the index, or if the value is not a number and</span></div><div class='line' id='LC427'><span class="cm">     * cannot be converted to a number.</span></div><div class='line' id='LC428'><span class="cm">     *</span></div><div class='line' id='LC429'><span class="cm">     * @param index</span></div><div class='line' id='LC430'><span class="cm">     *            The index must be between 0 and length() - 1.</span></div><div class='line' id='LC431'><span class="cm">     * @return The value.</span></div><div class='line' id='LC432'><span class="cm">     */</span></div><div class='line' id='LC433'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="kt">double</span> <span class="nf">optDouble</span><span class="o">(</span><span class="kt">int</span> <span class="n">index</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC434'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="k">this</span><span class="o">.</span><span class="na">optDouble</span><span class="o">(</span><span class="n">index</span><span class="o">,</span> <span class="n">Double</span><span class="o">.</span><span class="na">NaN</span><span class="o">);</span></div><div class='line' id='LC435'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC436'><br/></div><div class='line' id='LC437'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC438'><span class="cm">     * Get the optional double value associated with an index. The defaultValue</span></div><div class='line' id='LC439'><span class="cm">     * is returned if there is no value for the index, or if the value is not a</span></div><div class='line' id='LC440'><span class="cm">     * number and cannot be converted to a number.</span></div><div class='line' id='LC441'><span class="cm">     *</span></div><div class='line' id='LC442'><span class="cm">     * @param index</span></div><div class='line' id='LC443'><span class="cm">     *            subscript</span></div><div class='line' id='LC444'><span class="cm">     * @param defaultValue</span></div><div class='line' id='LC445'><span class="cm">     *            The default value.</span></div><div class='line' id='LC446'><span class="cm">     * @return The value.</span></div><div class='line' id='LC447'><span class="cm">     */</span></div><div class='line' id='LC448'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="kt">double</span> <span class="nf">optDouble</span><span class="o">(</span><span class="kt">int</span> <span class="n">index</span><span class="o">,</span> <span class="kt">double</span> <span class="n">defaultValue</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC449'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">try</span> <span class="o">{</span></div><div class='line' id='LC450'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="k">this</span><span class="o">.</span><span class="na">getDouble</span><span class="o">(</span><span class="n">index</span><span class="o">);</span></div><div class='line' id='LC451'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span> <span class="k">catch</span> <span class="o">(</span><span class="n">Exception</span> <span class="n">e</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC452'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="n">defaultValue</span><span class="o">;</span></div><div class='line' id='LC453'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC454'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC455'><br/></div><div class='line' id='LC456'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC457'><span class="cm">     * Get the optional int value associated with an index. Zero is returned if</span></div><div class='line' id='LC458'><span class="cm">     * there is no value for the index, or if the value is not a number and</span></div><div class='line' id='LC459'><span class="cm">     * cannot be converted to a number.</span></div><div class='line' id='LC460'><span class="cm">     *</span></div><div class='line' id='LC461'><span class="cm">     * @param index</span></div><div class='line' id='LC462'><span class="cm">     *            The index must be between 0 and length() - 1.</span></div><div class='line' id='LC463'><span class="cm">     * @return The value.</span></div><div class='line' id='LC464'><span class="cm">     */</span></div><div class='line' id='LC465'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="kt">int</span> <span class="nf">optInt</span><span class="o">(</span><span class="kt">int</span> <span class="n">index</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC466'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="k">this</span><span class="o">.</span><span class="na">optInt</span><span class="o">(</span><span class="n">index</span><span class="o">,</span> <span class="mi">0</span><span class="o">);</span></div><div class='line' id='LC467'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC468'><br/></div><div class='line' id='LC469'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC470'><span class="cm">     * Get the optional int value associated with an index. The defaultValue is</span></div><div class='line' id='LC471'><span class="cm">     * returned if there is no value for the index, or if the value is not a</span></div><div class='line' id='LC472'><span class="cm">     * number and cannot be converted to a number.</span></div><div class='line' id='LC473'><span class="cm">     *</span></div><div class='line' id='LC474'><span class="cm">     * @param index</span></div><div class='line' id='LC475'><span class="cm">     *            The index must be between 0 and length() - 1.</span></div><div class='line' id='LC476'><span class="cm">     * @param defaultValue</span></div><div class='line' id='LC477'><span class="cm">     *            The default value.</span></div><div class='line' id='LC478'><span class="cm">     * @return The value.</span></div><div class='line' id='LC479'><span class="cm">     */</span></div><div class='line' id='LC480'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="kt">int</span> <span class="nf">optInt</span><span class="o">(</span><span class="kt">int</span> <span class="n">index</span><span class="o">,</span> <span class="kt">int</span> <span class="n">defaultValue</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC481'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">try</span> <span class="o">{</span></div><div class='line' id='LC482'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="k">this</span><span class="o">.</span><span class="na">getInt</span><span class="o">(</span><span class="n">index</span><span class="o">);</span></div><div class='line' id='LC483'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span> <span class="k">catch</span> <span class="o">(</span><span class="n">Exception</span> <span class="n">e</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC484'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="n">defaultValue</span><span class="o">;</span></div><div class='line' id='LC485'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC486'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC487'><br/></div><div class='line' id='LC488'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC489'><span class="cm">     * Get the optional JSONArray associated with an index.</span></div><div class='line' id='LC490'><span class="cm">     *</span></div><div class='line' id='LC491'><span class="cm">     * @param index</span></div><div class='line' id='LC492'><span class="cm">     *            subscript</span></div><div class='line' id='LC493'><span class="cm">     * @return A JSONArray value, or null if the index has no value, or if the</span></div><div class='line' id='LC494'><span class="cm">     *         value is not a JSONArray.</span></div><div class='line' id='LC495'><span class="cm">     */</span></div><div class='line' id='LC496'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="n">JSONArray</span> <span class="nf">optJSONArray</span><span class="o">(</span><span class="kt">int</span> <span class="n">index</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC497'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">Object</span> <span class="n">o</span> <span class="o">=</span> <span class="k">this</span><span class="o">.</span><span class="na">opt</span><span class="o">(</span><span class="n">index</span><span class="o">);</span></div><div class='line' id='LC498'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="n">o</span> <span class="k">instanceof</span> <span class="n">JSONArray</span> <span class="o">?</span> <span class="o">(</span><span class="n">JSONArray</span><span class="o">)</span> <span class="n">o</span> <span class="o">:</span> <span class="kc">null</span><span class="o">;</span></div><div class='line' id='LC499'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC500'><br/></div><div class='line' id='LC501'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC502'><span class="cm">     * Get the optional JSONObject associated with an index. Null is returned if</span></div><div class='line' id='LC503'><span class="cm">     * the key is not found, or null if the index has no value, or if the value</span></div><div class='line' id='LC504'><span class="cm">     * is not a JSONObject.</span></div><div class='line' id='LC505'><span class="cm">     *</span></div><div class='line' id='LC506'><span class="cm">     * @param index</span></div><div class='line' id='LC507'><span class="cm">     *            The index must be between 0 and length() - 1.</span></div><div class='line' id='LC508'><span class="cm">     * @return A JSONObject value.</span></div><div class='line' id='LC509'><span class="cm">     */</span></div><div class='line' id='LC510'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="n">JSONObject</span> <span class="nf">optJSONObject</span><span class="o">(</span><span class="kt">int</span> <span class="n">index</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC511'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">Object</span> <span class="n">o</span> <span class="o">=</span> <span class="k">this</span><span class="o">.</span><span class="na">opt</span><span class="o">(</span><span class="n">index</span><span class="o">);</span></div><div class='line' id='LC512'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="n">o</span> <span class="k">instanceof</span> <span class="n">JSONObject</span> <span class="o">?</span> <span class="o">(</span><span class="n">JSONObject</span><span class="o">)</span> <span class="n">o</span> <span class="o">:</span> <span class="kc">null</span><span class="o">;</span></div><div class='line' id='LC513'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC514'><br/></div><div class='line' id='LC515'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC516'><span class="cm">     * Get the optional long value associated with an index. Zero is returned if</span></div><div class='line' id='LC517'><span class="cm">     * there is no value for the index, or if the value is not a number and</span></div><div class='line' id='LC518'><span class="cm">     * cannot be converted to a number.</span></div><div class='line' id='LC519'><span class="cm">     *</span></div><div class='line' id='LC520'><span class="cm">     * @param index</span></div><div class='line' id='LC521'><span class="cm">     *            The index must be between 0 and length() - 1.</span></div><div class='line' id='LC522'><span class="cm">     * @return The value.</span></div><div class='line' id='LC523'><span class="cm">     */</span></div><div class='line' id='LC524'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="kt">long</span> <span class="nf">optLong</span><span class="o">(</span><span class="kt">int</span> <span class="n">index</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC525'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="k">this</span><span class="o">.</span><span class="na">optLong</span><span class="o">(</span><span class="n">index</span><span class="o">,</span> <span class="mi">0</span><span class="o">);</span></div><div class='line' id='LC526'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC527'><br/></div><div class='line' id='LC528'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC529'><span class="cm">     * Get the optional long value associated with an index. The defaultValue is</span></div><div class='line' id='LC530'><span class="cm">     * returned if there is no value for the index, or if the value is not a</span></div><div class='line' id='LC531'><span class="cm">     * number and cannot be converted to a number.</span></div><div class='line' id='LC532'><span class="cm">     *</span></div><div class='line' id='LC533'><span class="cm">     * @param index</span></div><div class='line' id='LC534'><span class="cm">     *            The index must be between 0 and length() - 1.</span></div><div class='line' id='LC535'><span class="cm">     * @param defaultValue</span></div><div class='line' id='LC536'><span class="cm">     *            The default value.</span></div><div class='line' id='LC537'><span class="cm">     * @return The value.</span></div><div class='line' id='LC538'><span class="cm">     */</span></div><div class='line' id='LC539'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="kt">long</span> <span class="nf">optLong</span><span class="o">(</span><span class="kt">int</span> <span class="n">index</span><span class="o">,</span> <span class="kt">long</span> <span class="n">defaultValue</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC540'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">try</span> <span class="o">{</span></div><div class='line' id='LC541'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="k">this</span><span class="o">.</span><span class="na">getLong</span><span class="o">(</span><span class="n">index</span><span class="o">);</span></div><div class='line' id='LC542'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span> <span class="k">catch</span> <span class="o">(</span><span class="n">Exception</span> <span class="n">e</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC543'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="n">defaultValue</span><span class="o">;</span></div><div class='line' id='LC544'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC545'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC546'><br/></div><div class='line' id='LC547'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC548'><span class="cm">     * Get the optional string value associated with an index. It returns an</span></div><div class='line' id='LC549'><span class="cm">     * empty string if there is no value at that index. If the value is not a</span></div><div class='line' id='LC550'><span class="cm">     * string and is not null, then it is coverted to a string.</span></div><div class='line' id='LC551'><span class="cm">     *</span></div><div class='line' id='LC552'><span class="cm">     * @param index</span></div><div class='line' id='LC553'><span class="cm">     *            The index must be between 0 and length() - 1.</span></div><div class='line' id='LC554'><span class="cm">     * @return A String value.</span></div><div class='line' id='LC555'><span class="cm">     */</span></div><div class='line' id='LC556'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="n">String</span> <span class="nf">optString</span><span class="o">(</span><span class="kt">int</span> <span class="n">index</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC557'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="k">this</span><span class="o">.</span><span class="na">optString</span><span class="o">(</span><span class="n">index</span><span class="o">,</span> <span class="s">&quot;&quot;</span><span class="o">);</span></div><div class='line' id='LC558'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC559'><br/></div><div class='line' id='LC560'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC561'><span class="cm">     * Get the optional string associated with an index. The defaultValue is</span></div><div class='line' id='LC562'><span class="cm">     * returned if the key is not found.</span></div><div class='line' id='LC563'><span class="cm">     *</span></div><div class='line' id='LC564'><span class="cm">     * @param index</span></div><div class='line' id='LC565'><span class="cm">     *            The index must be between 0 and length() - 1.</span></div><div class='line' id='LC566'><span class="cm">     * @param defaultValue</span></div><div class='line' id='LC567'><span class="cm">     *            The default value.</span></div><div class='line' id='LC568'><span class="cm">     * @return A String value.</span></div><div class='line' id='LC569'><span class="cm">     */</span></div><div class='line' id='LC570'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="n">String</span> <span class="nf">optString</span><span class="o">(</span><span class="kt">int</span> <span class="n">index</span><span class="o">,</span> <span class="n">String</span> <span class="n">defaultValue</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC571'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">Object</span> <span class="n">object</span> <span class="o">=</span> <span class="k">this</span><span class="o">.</span><span class="na">opt</span><span class="o">(</span><span class="n">index</span><span class="o">);</span></div><div class='line' id='LC572'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="n">JSONObject</span><span class="o">.</span><span class="na">NULL</span><span class="o">.</span><span class="na">equals</span><span class="o">(</span><span class="n">object</span><span class="o">)</span> <span class="o">?</span> <span class="n">defaultValue</span> <span class="o">:</span> <span class="n">object</span></div><div class='line' id='LC573'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">.</span><span class="na">toString</span><span class="o">();</span></div><div class='line' id='LC574'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC575'><br/></div><div class='line' id='LC576'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC577'><span class="cm">     * Append a boolean value. This increases the array&#39;s length by one.</span></div><div class='line' id='LC578'><span class="cm">     *</span></div><div class='line' id='LC579'><span class="cm">     * @param value</span></div><div class='line' id='LC580'><span class="cm">     *            A boolean value.</span></div><div class='line' id='LC581'><span class="cm">     * @return this.</span></div><div class='line' id='LC582'><span class="cm">     */</span></div><div class='line' id='LC583'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="n">JSONArray</span> <span class="nf">put</span><span class="o">(</span><span class="kt">boolean</span> <span class="n">value</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC584'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">this</span><span class="o">.</span><span class="na">put</span><span class="o">(</span><span class="n">value</span> <span class="o">?</span> <span class="n">Boolean</span><span class="o">.</span><span class="na">TRUE</span> <span class="o">:</span> <span class="n">Boolean</span><span class="o">.</span><span class="na">FALSE</span><span class="o">);</span></div><div class='line' id='LC585'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="k">this</span><span class="o">;</span></div><div class='line' id='LC586'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC587'><br/></div><div class='line' id='LC588'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC589'><span class="cm">     * Put a value in the JSONArray, where the value will be a JSONArray which</span></div><div class='line' id='LC590'><span class="cm">     * is produced from a Collection.</span></div><div class='line' id='LC591'><span class="cm">     *</span></div><div class='line' id='LC592'><span class="cm">     * @param value</span></div><div class='line' id='LC593'><span class="cm">     *            A Collection value.</span></div><div class='line' id='LC594'><span class="cm">     * @return this.</span></div><div class='line' id='LC595'><span class="cm">     */</span></div><div class='line' id='LC596'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="n">JSONArray</span> <span class="nf">put</span><span class="o">(</span><span class="n">Collection</span><span class="o">&lt;</span><span class="n">Object</span><span class="o">&gt;</span> <span class="n">value</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC597'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">this</span><span class="o">.</span><span class="na">put</span><span class="o">(</span><span class="k">new</span> <span class="n">JSONArray</span><span class="o">(</span><span class="n">value</span><span class="o">));</span></div><div class='line' id='LC598'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="k">this</span><span class="o">;</span></div><div class='line' id='LC599'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC600'><br/></div><div class='line' id='LC601'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC602'><span class="cm">     * Append a double value. This increases the array&#39;s length by one.</span></div><div class='line' id='LC603'><span class="cm">     *</span></div><div class='line' id='LC604'><span class="cm">     * @param value</span></div><div class='line' id='LC605'><span class="cm">     *            A double value.</span></div><div class='line' id='LC606'><span class="cm">     * @throws JSONException</span></div><div class='line' id='LC607'><span class="cm">     *             if the value is not finite.</span></div><div class='line' id='LC608'><span class="cm">     * @return this.</span></div><div class='line' id='LC609'><span class="cm">     */</span></div><div class='line' id='LC610'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="n">JSONArray</span> <span class="nf">put</span><span class="o">(</span><span class="kt">double</span> <span class="n">value</span><span class="o">)</span> <span class="kd">throws</span> <span class="n">JSONException</span> <span class="o">{</span></div><div class='line' id='LC611'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">Double</span> <span class="n">d</span> <span class="o">=</span> <span class="k">new</span> <span class="n">Double</span><span class="o">(</span><span class="n">value</span><span class="o">);</span></div><div class='line' id='LC612'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">JSONObject</span><span class="o">.</span><span class="na">testValidity</span><span class="o">(</span><span class="n">d</span><span class="o">);</span></div><div class='line' id='LC613'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">this</span><span class="o">.</span><span class="na">put</span><span class="o">(</span><span class="n">d</span><span class="o">);</span></div><div class='line' id='LC614'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="k">this</span><span class="o">;</span></div><div class='line' id='LC615'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC616'><br/></div><div class='line' id='LC617'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC618'><span class="cm">     * Append an int value. This increases the array&#39;s length by one.</span></div><div class='line' id='LC619'><span class="cm">     *</span></div><div class='line' id='LC620'><span class="cm">     * @param value</span></div><div class='line' id='LC621'><span class="cm">     *            An int value.</span></div><div class='line' id='LC622'><span class="cm">     * @return this.</span></div><div class='line' id='LC623'><span class="cm">     */</span></div><div class='line' id='LC624'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="n">JSONArray</span> <span class="nf">put</span><span class="o">(</span><span class="kt">int</span> <span class="n">value</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC625'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">this</span><span class="o">.</span><span class="na">put</span><span class="o">(</span><span class="k">new</span> <span class="n">Integer</span><span class="o">(</span><span class="n">value</span><span class="o">));</span></div><div class='line' id='LC626'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="k">this</span><span class="o">;</span></div><div class='line' id='LC627'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC628'><br/></div><div class='line' id='LC629'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC630'><span class="cm">     * Append an long value. This increases the array&#39;s length by one.</span></div><div class='line' id='LC631'><span class="cm">     *</span></div><div class='line' id='LC632'><span class="cm">     * @param value</span></div><div class='line' id='LC633'><span class="cm">     *            A long value.</span></div><div class='line' id='LC634'><span class="cm">     * @return this.</span></div><div class='line' id='LC635'><span class="cm">     */</span></div><div class='line' id='LC636'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="n">JSONArray</span> <span class="nf">put</span><span class="o">(</span><span class="kt">long</span> <span class="n">value</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC637'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">this</span><span class="o">.</span><span class="na">put</span><span class="o">(</span><span class="k">new</span> <span class="n">Long</span><span class="o">(</span><span class="n">value</span><span class="o">));</span></div><div class='line' id='LC638'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="k">this</span><span class="o">;</span></div><div class='line' id='LC639'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC640'><br/></div><div class='line' id='LC641'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC642'><span class="cm">     * Put a value in the JSONArray, where the value will be a JSONObject which</span></div><div class='line' id='LC643'><span class="cm">     * is produced from a Map.</span></div><div class='line' id='LC644'><span class="cm">     *</span></div><div class='line' id='LC645'><span class="cm">     * @param value</span></div><div class='line' id='LC646'><span class="cm">     *            A Map value.</span></div><div class='line' id='LC647'><span class="cm">     * @return this.</span></div><div class='line' id='LC648'><span class="cm">     */</span></div><div class='line' id='LC649'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="n">JSONArray</span> <span class="nf">put</span><span class="o">(</span><span class="n">Map</span><span class="o">&lt;</span><span class="n">String</span><span class="o">,</span> <span class="n">Object</span><span class="o">&gt;</span> <span class="n">value</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC650'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">this</span><span class="o">.</span><span class="na">put</span><span class="o">(</span><span class="k">new</span> <span class="n">JSONObject</span><span class="o">(</span><span class="n">value</span><span class="o">));</span></div><div class='line' id='LC651'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="k">this</span><span class="o">;</span></div><div class='line' id='LC652'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC653'><br/></div><div class='line' id='LC654'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC655'><span class="cm">     * Append an object value. This increases the array&#39;s length by one.</span></div><div class='line' id='LC656'><span class="cm">     *</span></div><div class='line' id='LC657'><span class="cm">     * @param value</span></div><div class='line' id='LC658'><span class="cm">     *            An object value. The value should be a Boolean, Double,</span></div><div class='line' id='LC659'><span class="cm">     *            Integer, JSONArray, JSONObject, Long, or String, or the</span></div><div class='line' id='LC660'><span class="cm">     *            JSONObject.NULL object.</span></div><div class='line' id='LC661'><span class="cm">     * @return this.</span></div><div class='line' id='LC662'><span class="cm">     */</span></div><div class='line' id='LC663'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="n">JSONArray</span> <span class="nf">put</span><span class="o">(</span><span class="n">Object</span> <span class="n">value</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC664'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">this</span><span class="o">.</span><span class="na">myArrayList</span><span class="o">.</span><span class="na">add</span><span class="o">(</span><span class="n">value</span><span class="o">);</span></div><div class='line' id='LC665'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="k">this</span><span class="o">;</span></div><div class='line' id='LC666'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC667'><br/></div><div class='line' id='LC668'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC669'><span class="cm">     * Put or replace a boolean value in the JSONArray. If the index is greater</span></div><div class='line' id='LC670'><span class="cm">     * than the length of the JSONArray, then null elements will be added as</span></div><div class='line' id='LC671'><span class="cm">     * necessary to pad it out.</span></div><div class='line' id='LC672'><span class="cm">     *</span></div><div class='line' id='LC673'><span class="cm">     * @param index</span></div><div class='line' id='LC674'><span class="cm">     *            The subscript.</span></div><div class='line' id='LC675'><span class="cm">     * @param value</span></div><div class='line' id='LC676'><span class="cm">     *            A boolean value.</span></div><div class='line' id='LC677'><span class="cm">     * @return this.</span></div><div class='line' id='LC678'><span class="cm">     * @throws JSONException</span></div><div class='line' id='LC679'><span class="cm">     *             If the index is negative.</span></div><div class='line' id='LC680'><span class="cm">     */</span></div><div class='line' id='LC681'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="n">JSONArray</span> <span class="nf">put</span><span class="o">(</span><span class="kt">int</span> <span class="n">index</span><span class="o">,</span> <span class="kt">boolean</span> <span class="n">value</span><span class="o">)</span> <span class="kd">throws</span> <span class="n">JSONException</span> <span class="o">{</span></div><div class='line' id='LC682'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">this</span><span class="o">.</span><span class="na">put</span><span class="o">(</span><span class="n">index</span><span class="o">,</span> <span class="n">value</span> <span class="o">?</span> <span class="n">Boolean</span><span class="o">.</span><span class="na">TRUE</span> <span class="o">:</span> <span class="n">Boolean</span><span class="o">.</span><span class="na">FALSE</span><span class="o">);</span></div><div class='line' id='LC683'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="k">this</span><span class="o">;</span></div><div class='line' id='LC684'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC685'><br/></div><div class='line' id='LC686'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC687'><span class="cm">     * Put a value in the JSONArray, where the value will be a JSONArray which</span></div><div class='line' id='LC688'><span class="cm">     * is produced from a Collection.</span></div><div class='line' id='LC689'><span class="cm">     *</span></div><div class='line' id='LC690'><span class="cm">     * @param index</span></div><div class='line' id='LC691'><span class="cm">     *            The subscript.</span></div><div class='line' id='LC692'><span class="cm">     * @param value</span></div><div class='line' id='LC693'><span class="cm">     *            A Collection value.</span></div><div class='line' id='LC694'><span class="cm">     * @return this.</span></div><div class='line' id='LC695'><span class="cm">     * @throws JSONException</span></div><div class='line' id='LC696'><span class="cm">     *             If the index is negative or if the value is not finite.</span></div><div class='line' id='LC697'><span class="cm">     */</span></div><div class='line' id='LC698'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="n">JSONArray</span> <span class="nf">put</span><span class="o">(</span><span class="kt">int</span> <span class="n">index</span><span class="o">,</span> <span class="n">Collection</span><span class="o">&lt;</span><span class="n">Object</span><span class="o">&gt;</span> <span class="n">value</span><span class="o">)</span> <span class="kd">throws</span> <span class="n">JSONException</span> <span class="o">{</span></div><div class='line' id='LC699'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">this</span><span class="o">.</span><span class="na">put</span><span class="o">(</span><span class="n">index</span><span class="o">,</span> <span class="k">new</span> <span class="n">JSONArray</span><span class="o">(</span><span class="n">value</span><span class="o">));</span></div><div class='line' id='LC700'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="k">this</span><span class="o">;</span></div><div class='line' id='LC701'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC702'><br/></div><div class='line' id='LC703'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC704'><span class="cm">     * Put or replace a double value. If the index is greater than the length of</span></div><div class='line' id='LC705'><span class="cm">     * the JSONArray, then null elements will be added as necessary to pad it</span></div><div class='line' id='LC706'><span class="cm">     * out.</span></div><div class='line' id='LC707'><span class="cm">     *</span></div><div class='line' id='LC708'><span class="cm">     * @param index</span></div><div class='line' id='LC709'><span class="cm">     *            The subscript.</span></div><div class='line' id='LC710'><span class="cm">     * @param value</span></div><div class='line' id='LC711'><span class="cm">     *            A double value.</span></div><div class='line' id='LC712'><span class="cm">     * @return this.</span></div><div class='line' id='LC713'><span class="cm">     * @throws JSONException</span></div><div class='line' id='LC714'><span class="cm">     *             If the index is negative or if the value is not finite.</span></div><div class='line' id='LC715'><span class="cm">     */</span></div><div class='line' id='LC716'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="n">JSONArray</span> <span class="nf">put</span><span class="o">(</span><span class="kt">int</span> <span class="n">index</span><span class="o">,</span> <span class="kt">double</span> <span class="n">value</span><span class="o">)</span> <span class="kd">throws</span> <span class="n">JSONException</span> <span class="o">{</span></div><div class='line' id='LC717'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">this</span><span class="o">.</span><span class="na">put</span><span class="o">(</span><span class="n">index</span><span class="o">,</span> <span class="k">new</span> <span class="n">Double</span><span class="o">(</span><span class="n">value</span><span class="o">));</span></div><div class='line' id='LC718'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="k">this</span><span class="o">;</span></div><div class='line' id='LC719'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC720'><br/></div><div class='line' id='LC721'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC722'><span class="cm">     * Put or replace an int value. If the index is greater than the length of</span></div><div class='line' id='LC723'><span class="cm">     * the JSONArray, then null elements will be added as necessary to pad it</span></div><div class='line' id='LC724'><span class="cm">     * out.</span></div><div class='line' id='LC725'><span class="cm">     *</span></div><div class='line' id='LC726'><span class="cm">     * @param index</span></div><div class='line' id='LC727'><span class="cm">     *            The subscript.</span></div><div class='line' id='LC728'><span class="cm">     * @param value</span></div><div class='line' id='LC729'><span class="cm">     *            An int value.</span></div><div class='line' id='LC730'><span class="cm">     * @return this.</span></div><div class='line' id='LC731'><span class="cm">     * @throws JSONException</span></div><div class='line' id='LC732'><span class="cm">     *             If the index is negative.</span></div><div class='line' id='LC733'><span class="cm">     */</span></div><div class='line' id='LC734'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="n">JSONArray</span> <span class="nf">put</span><span class="o">(</span><span class="kt">int</span> <span class="n">index</span><span class="o">,</span> <span class="kt">int</span> <span class="n">value</span><span class="o">)</span> <span class="kd">throws</span> <span class="n">JSONException</span> <span class="o">{</span></div><div class='line' id='LC735'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">this</span><span class="o">.</span><span class="na">put</span><span class="o">(</span><span class="n">index</span><span class="o">,</span> <span class="k">new</span> <span class="n">Integer</span><span class="o">(</span><span class="n">value</span><span class="o">));</span></div><div class='line' id='LC736'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="k">this</span><span class="o">;</span></div><div class='line' id='LC737'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC738'><br/></div><div class='line' id='LC739'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC740'><span class="cm">     * Put or replace a long value. If the index is greater than the length of</span></div><div class='line' id='LC741'><span class="cm">     * the JSONArray, then null elements will be added as necessary to pad it</span></div><div class='line' id='LC742'><span class="cm">     * out.</span></div><div class='line' id='LC743'><span class="cm">     *</span></div><div class='line' id='LC744'><span class="cm">     * @param index</span></div><div class='line' id='LC745'><span class="cm">     *            The subscript.</span></div><div class='line' id='LC746'><span class="cm">     * @param value</span></div><div class='line' id='LC747'><span class="cm">     *            A long value.</span></div><div class='line' id='LC748'><span class="cm">     * @return this.</span></div><div class='line' id='LC749'><span class="cm">     * @throws JSONException</span></div><div class='line' id='LC750'><span class="cm">     *             If the index is negative.</span></div><div class='line' id='LC751'><span class="cm">     */</span></div><div class='line' id='LC752'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="n">JSONArray</span> <span class="nf">put</span><span class="o">(</span><span class="kt">int</span> <span class="n">index</span><span class="o">,</span> <span class="kt">long</span> <span class="n">value</span><span class="o">)</span> <span class="kd">throws</span> <span class="n">JSONException</span> <span class="o">{</span></div><div class='line' id='LC753'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">this</span><span class="o">.</span><span class="na">put</span><span class="o">(</span><span class="n">index</span><span class="o">,</span> <span class="k">new</span> <span class="n">Long</span><span class="o">(</span><span class="n">value</span><span class="o">));</span></div><div class='line' id='LC754'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="k">this</span><span class="o">;</span></div><div class='line' id='LC755'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC756'><br/></div><div class='line' id='LC757'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC758'><span class="cm">     * Put a value in the JSONArray, where the value will be a JSONObject that</span></div><div class='line' id='LC759'><span class="cm">     * is produced from a Map.</span></div><div class='line' id='LC760'><span class="cm">     *</span></div><div class='line' id='LC761'><span class="cm">     * @param index</span></div><div class='line' id='LC762'><span class="cm">     *            The subscript.</span></div><div class='line' id='LC763'><span class="cm">     * @param value</span></div><div class='line' id='LC764'><span class="cm">     *            The Map value.</span></div><div class='line' id='LC765'><span class="cm">     * @return this.</span></div><div class='line' id='LC766'><span class="cm">     * @throws JSONException</span></div><div class='line' id='LC767'><span class="cm">     *             If the index is negative or if the the value is an invalid</span></div><div class='line' id='LC768'><span class="cm">     *             number.</span></div><div class='line' id='LC769'><span class="cm">     */</span></div><div class='line' id='LC770'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="n">JSONArray</span> <span class="nf">put</span><span class="o">(</span><span class="kt">int</span> <span class="n">index</span><span class="o">,</span> <span class="n">Map</span><span class="o">&lt;</span><span class="n">String</span><span class="o">,</span> <span class="n">Object</span><span class="o">&gt;</span> <span class="n">value</span><span class="o">)</span> <span class="kd">throws</span> <span class="n">JSONException</span> <span class="o">{</span></div><div class='line' id='LC771'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">this</span><span class="o">.</span><span class="na">put</span><span class="o">(</span><span class="n">index</span><span class="o">,</span> <span class="k">new</span> <span class="n">JSONObject</span><span class="o">(</span><span class="n">value</span><span class="o">));</span></div><div class='line' id='LC772'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="k">this</span><span class="o">;</span></div><div class='line' id='LC773'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC774'><br/></div><div class='line' id='LC775'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC776'><span class="cm">     * Put or replace an object value in the JSONArray. If the index is greater</span></div><div class='line' id='LC777'><span class="cm">     * than the length of the JSONArray, then null elements will be added as</span></div><div class='line' id='LC778'><span class="cm">     * necessary to pad it out.</span></div><div class='line' id='LC779'><span class="cm">     *</span></div><div class='line' id='LC780'><span class="cm">     * @param index</span></div><div class='line' id='LC781'><span class="cm">     *            The subscript.</span></div><div class='line' id='LC782'><span class="cm">     * @param value</span></div><div class='line' id='LC783'><span class="cm">     *            The value to put into the array. The value should be a</span></div><div class='line' id='LC784'><span class="cm">     *            Boolean, Double, Integer, JSONArray, JSONObject, Long, or</span></div><div class='line' id='LC785'><span class="cm">     *            String, or the JSONObject.NULL object.</span></div><div class='line' id='LC786'><span class="cm">     * @return this.</span></div><div class='line' id='LC787'><span class="cm">     * @throws JSONException</span></div><div class='line' id='LC788'><span class="cm">     *             If the index is negative or if the the value is an invalid</span></div><div class='line' id='LC789'><span class="cm">     *             number.</span></div><div class='line' id='LC790'><span class="cm">     */</span></div><div class='line' id='LC791'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="n">JSONArray</span> <span class="nf">put</span><span class="o">(</span><span class="kt">int</span> <span class="n">index</span><span class="o">,</span> <span class="n">Object</span> <span class="n">value</span><span class="o">)</span> <span class="kd">throws</span> <span class="n">JSONException</span> <span class="o">{</span></div><div class='line' id='LC792'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">JSONObject</span><span class="o">.</span><span class="na">testValidity</span><span class="o">(</span><span class="n">value</span><span class="o">);</span></div><div class='line' id='LC793'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(</span><span class="n">index</span> <span class="o">&lt;</span> <span class="mi">0</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC794'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">throw</span> <span class="k">new</span> <span class="nf">JSONException</span><span class="o">(</span><span class="s">&quot;JSONArray[&quot;</span> <span class="o">+</span> <span class="n">index</span> <span class="o">+</span> <span class="s">&quot;] not found.&quot;</span><span class="o">);</span></div><div class='line' id='LC795'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC796'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(</span><span class="n">index</span> <span class="o">&lt;</span> <span class="k">this</span><span class="o">.</span><span class="na">length</span><span class="o">())</span> <span class="o">{</span></div><div class='line' id='LC797'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">this</span><span class="o">.</span><span class="na">myArrayList</span><span class="o">.</span><span class="na">set</span><span class="o">(</span><span class="n">index</span><span class="o">,</span> <span class="n">value</span><span class="o">);</span></div><div class='line' id='LC798'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span> <span class="k">else</span> <span class="o">{</span></div><div class='line' id='LC799'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">while</span> <span class="o">(</span><span class="n">index</span> <span class="o">!=</span> <span class="k">this</span><span class="o">.</span><span class="na">length</span><span class="o">())</span> <span class="o">{</span></div><div class='line' id='LC800'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">this</span><span class="o">.</span><span class="na">put</span><span class="o">(</span><span class="n">JSONObject</span><span class="o">.</span><span class="na">NULL</span><span class="o">);</span></div><div class='line' id='LC801'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC802'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">this</span><span class="o">.</span><span class="na">put</span><span class="o">(</span><span class="n">value</span><span class="o">);</span></div><div class='line' id='LC803'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC804'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="k">this</span><span class="o">;</span></div><div class='line' id='LC805'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC806'><br/></div><div class='line' id='LC807'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC808'><span class="cm">     * Remove an index and close the hole.</span></div><div class='line' id='LC809'><span class="cm">     *</span></div><div class='line' id='LC810'><span class="cm">     * @param index</span></div><div class='line' id='LC811'><span class="cm">     *            The index of the element to be removed.</span></div><div class='line' id='LC812'><span class="cm">     * @return The value that was associated with the index, or null if there</span></div><div class='line' id='LC813'><span class="cm">     *         was no value.</span></div><div class='line' id='LC814'><span class="cm">     */</span></div><div class='line' id='LC815'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="n">Object</span> <span class="nf">remove</span><span class="o">(</span><span class="kt">int</span> <span class="n">index</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC816'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="n">index</span> <span class="o">&gt;=</span> <span class="mi">0</span> <span class="o">&amp;&amp;</span> <span class="n">index</span> <span class="o">&lt;</span> <span class="k">this</span><span class="o">.</span><span class="na">length</span><span class="o">()</span></div><div class='line' id='LC817'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">?</span> <span class="k">this</span><span class="o">.</span><span class="na">myArrayList</span><span class="o">.</span><span class="na">remove</span><span class="o">(</span><span class="n">index</span><span class="o">)</span></div><div class='line' id='LC818'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">:</span> <span class="kc">null</span><span class="o">;</span></div><div class='line' id='LC819'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC820'><br/></div><div class='line' id='LC821'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC822'><span class="cm">     * Determine if two JSONArrays are similar.</span></div><div class='line' id='LC823'><span class="cm">     * They must contain similar sequences.</span></div><div class='line' id='LC824'><span class="cm">     *</span></div><div class='line' id='LC825'><span class="cm">     * @param other The other JSONArray</span></div><div class='line' id='LC826'><span class="cm">     * @return true if they are equal</span></div><div class='line' id='LC827'><span class="cm">     */</span></div><div class='line' id='LC828'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="kt">boolean</span> <span class="nf">similar</span><span class="o">(</span><span class="n">Object</span> <span class="n">other</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC829'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(!(</span><span class="n">other</span> <span class="k">instanceof</span> <span class="n">JSONArray</span><span class="o">))</span> <span class="o">{</span></div><div class='line' id='LC830'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="kc">false</span><span class="o">;</span></div><div class='line' id='LC831'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC832'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kt">int</span> <span class="n">len</span> <span class="o">=</span> <span class="k">this</span><span class="o">.</span><span class="na">length</span><span class="o">();</span></div><div class='line' id='LC833'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(</span><span class="n">len</span> <span class="o">!=</span> <span class="o">((</span><span class="n">JSONArray</span><span class="o">)</span><span class="n">other</span><span class="o">).</span><span class="na">length</span><span class="o">())</span> <span class="o">{</span></div><div class='line' id='LC834'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="kc">false</span><span class="o">;</span></div><div class='line' id='LC835'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC836'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">for</span> <span class="o">(</span><span class="kt">int</span> <span class="n">i</span> <span class="o">=</span> <span class="mi">0</span><span class="o">;</span> <span class="n">i</span> <span class="o">&lt;</span> <span class="n">len</span><span class="o">;</span> <span class="n">i</span> <span class="o">+=</span> <span class="mi">1</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC837'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">Object</span> <span class="n">valueThis</span> <span class="o">=</span> <span class="k">this</span><span class="o">.</span><span class="na">get</span><span class="o">(</span><span class="n">i</span><span class="o">);</span></div><div class='line' id='LC838'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">Object</span> <span class="n">valueOther</span> <span class="o">=</span> <span class="o">((</span><span class="n">JSONArray</span><span class="o">)</span><span class="n">other</span><span class="o">).</span><span class="na">get</span><span class="o">(</span><span class="n">i</span><span class="o">);</span></div><div class='line' id='LC839'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(</span><span class="n">valueThis</span> <span class="k">instanceof</span> <span class="n">JSONObject</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC840'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(!((</span><span class="n">JSONObject</span><span class="o">)</span><span class="n">valueThis</span><span class="o">).</span><span class="na">similar</span><span class="o">(</span><span class="n">valueOther</span><span class="o">))</span> <span class="o">{</span></div><div class='line' id='LC841'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="kc">false</span><span class="o">;</span></div><div class='line' id='LC842'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC843'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span> <span class="k">else</span> <span class="k">if</span> <span class="o">(</span><span class="n">valueThis</span> <span class="k">instanceof</span> <span class="n">JSONArray</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC844'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(!((</span><span class="n">JSONArray</span><span class="o">)</span><span class="n">valueThis</span><span class="o">).</span><span class="na">similar</span><span class="o">(</span><span class="n">valueOther</span><span class="o">))</span> <span class="o">{</span></div><div class='line' id='LC845'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="kc">false</span><span class="o">;</span></div><div class='line' id='LC846'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC847'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span> <span class="k">else</span> <span class="k">if</span> <span class="o">(!</span><span class="n">valueThis</span><span class="o">.</span><span class="na">equals</span><span class="o">(</span><span class="n">valueOther</span><span class="o">))</span> <span class="o">{</span></div><div class='line' id='LC848'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="kc">false</span><span class="o">;</span></div><div class='line' id='LC849'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC850'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC851'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="kc">true</span><span class="o">;</span></div><div class='line' id='LC852'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC853'><br/></div><div class='line' id='LC854'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC855'><span class="cm">     * Produce a JSONObject by combining a JSONArray of names with the values of</span></div><div class='line' id='LC856'><span class="cm">     * this JSONArray.</span></div><div class='line' id='LC857'><span class="cm">     *</span></div><div class='line' id='LC858'><span class="cm">     * @param names</span></div><div class='line' id='LC859'><span class="cm">     *            A JSONArray containing a list of key strings. These will be</span></div><div class='line' id='LC860'><span class="cm">     *            paired with the values.</span></div><div class='line' id='LC861'><span class="cm">     * @return A JSONObject, or null if there are no names or if this JSONArray</span></div><div class='line' id='LC862'><span class="cm">     *         has no values.</span></div><div class='line' id='LC863'><span class="cm">     * @throws JSONException</span></div><div class='line' id='LC864'><span class="cm">     *             If any of the names are null.</span></div><div class='line' id='LC865'><span class="cm">     */</span></div><div class='line' id='LC866'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="n">JSONObject</span> <span class="nf">toJSONObject</span><span class="o">(</span><span class="n">JSONArray</span> <span class="n">names</span><span class="o">)</span> <span class="kd">throws</span> <span class="n">JSONException</span> <span class="o">{</span></div><div class='line' id='LC867'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(</span><span class="n">names</span> <span class="o">==</span> <span class="kc">null</span> <span class="o">||</span> <span class="n">names</span><span class="o">.</span><span class="na">length</span><span class="o">()</span> <span class="o">==</span> <span class="mi">0</span> <span class="o">||</span> <span class="k">this</span><span class="o">.</span><span class="na">length</span><span class="o">()</span> <span class="o">==</span> <span class="mi">0</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC868'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="kc">null</span><span class="o">;</span></div><div class='line' id='LC869'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC870'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">JSONObject</span> <span class="n">jo</span> <span class="o">=</span> <span class="k">new</span> <span class="n">JSONObject</span><span class="o">();</span></div><div class='line' id='LC871'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">for</span> <span class="o">(</span><span class="kt">int</span> <span class="n">i</span> <span class="o">=</span> <span class="mi">0</span><span class="o">;</span> <span class="n">i</span> <span class="o">&lt;</span> <span class="n">names</span><span class="o">.</span><span class="na">length</span><span class="o">();</span> <span class="n">i</span> <span class="o">+=</span> <span class="mi">1</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC872'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">jo</span><span class="o">.</span><span class="na">put</span><span class="o">(</span><span class="n">names</span><span class="o">.</span><span class="na">getString</span><span class="o">(</span><span class="n">i</span><span class="o">),</span> <span class="k">this</span><span class="o">.</span><span class="na">opt</span><span class="o">(</span><span class="n">i</span><span class="o">));</span></div><div class='line' id='LC873'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC874'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="n">jo</span><span class="o">;</span></div><div class='line' id='LC875'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC876'><br/></div><div class='line' id='LC877'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC878'><span class="cm">     * Make a JSON text of this JSONArray. For compactness, no unnecessary</span></div><div class='line' id='LC879'><span class="cm">     * whitespace is added. If it is not possible to produce a syntactically</span></div><div class='line' id='LC880'><span class="cm">     * correct JSON text then null will be returned instead. This could occur if</span></div><div class='line' id='LC881'><span class="cm">     * the array contains an invalid number.</span></div><div class='line' id='LC882'><span class="cm">     * &lt;p&gt;</span></div><div class='line' id='LC883'><span class="cm">     * Warning: This method assumes that the data structure is acyclical.</span></div><div class='line' id='LC884'><span class="cm">     *</span></div><div class='line' id='LC885'><span class="cm">     * @return a printable, displayable, transmittable representation of the</span></div><div class='line' id='LC886'><span class="cm">     *         array.</span></div><div class='line' id='LC887'><span class="cm">     */</span></div><div class='line' id='LC888'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="n">String</span> <span class="nf">toString</span><span class="o">()</span> <span class="o">{</span></div><div class='line' id='LC889'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">try</span> <span class="o">{</span></div><div class='line' id='LC890'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="k">this</span><span class="o">.</span><span class="na">toString</span><span class="o">(</span><span class="mi">0</span><span class="o">);</span></div><div class='line' id='LC891'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span> <span class="k">catch</span> <span class="o">(</span><span class="n">Exception</span> <span class="n">e</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC892'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="kc">null</span><span class="o">;</span></div><div class='line' id='LC893'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC894'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC895'><br/></div><div class='line' id='LC896'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC897'><span class="cm">     * Make a prettyprinted JSON text of this JSONArray. Warning: This method</span></div><div class='line' id='LC898'><span class="cm">     * assumes that the data structure is acyclical.</span></div><div class='line' id='LC899'><span class="cm">     *</span></div><div class='line' id='LC900'><span class="cm">     * @param indentFactor</span></div><div class='line' id='LC901'><span class="cm">     *            The number of spaces to add to each level of indentation.</span></div><div class='line' id='LC902'><span class="cm">     * @return a printable, displayable, transmittable representation of the</span></div><div class='line' id='LC903'><span class="cm">     *         object, beginning with &lt;code&gt;[&lt;/code&gt;&amp;nbsp;&lt;small&gt;(left</span></div><div class='line' id='LC904'><span class="cm">     *         bracket)&lt;/small&gt; and ending with &lt;code&gt;]&lt;/code&gt;</span></div><div class='line' id='LC905'><span class="cm">     *         &amp;nbsp;&lt;small&gt;(right bracket)&lt;/small&gt;.</span></div><div class='line' id='LC906'><span class="cm">     * @throws JSONException</span></div><div class='line' id='LC907'><span class="cm">     */</span></div><div class='line' id='LC908'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="n">String</span> <span class="nf">toString</span><span class="o">(</span><span class="kt">int</span> <span class="n">indentFactor</span><span class="o">)</span> <span class="kd">throws</span> <span class="n">JSONException</span> <span class="o">{</span></div><div class='line' id='LC909'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">StringWriter</span> <span class="n">sw</span> <span class="o">=</span> <span class="k">new</span> <span class="n">StringWriter</span><span class="o">();</span></div><div class='line' id='LC910'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">synchronized</span> <span class="o">(</span><span class="n">sw</span><span class="o">.</span><span class="na">getBuffer</span><span class="o">())</span> <span class="o">{</span></div><div class='line' id='LC911'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="k">this</span><span class="o">.</span><span class="na">write</span><span class="o">(</span><span class="n">sw</span><span class="o">,</span> <span class="n">indentFactor</span><span class="o">,</span> <span class="mi">0</span><span class="o">).</span><span class="na">toString</span><span class="o">();</span></div><div class='line' id='LC912'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC913'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC914'><br/></div><div class='line' id='LC915'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC916'><span class="cm">     * Write the contents of the JSONArray as JSON text to a writer. For</span></div><div class='line' id='LC917'><span class="cm">     * compactness, no whitespace is added.</span></div><div class='line' id='LC918'><span class="cm">     * &lt;p&gt;</span></div><div class='line' id='LC919'><span class="cm">     * Warning: This method assumes that the data structure is acyclical.</span></div><div class='line' id='LC920'><span class="cm">     *</span></div><div class='line' id='LC921'><span class="cm">     * @return The writer.</span></div><div class='line' id='LC922'><span class="cm">     * @throws JSONException</span></div><div class='line' id='LC923'><span class="cm">     */</span></div><div class='line' id='LC924'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="n">Writer</span> <span class="nf">write</span><span class="o">(</span><span class="n">Writer</span> <span class="n">writer</span><span class="o">)</span> <span class="kd">throws</span> <span class="n">JSONException</span> <span class="o">{</span></div><div class='line' id='LC925'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="k">this</span><span class="o">.</span><span class="na">write</span><span class="o">(</span><span class="n">writer</span><span class="o">,</span> <span class="mi">0</span><span class="o">,</span> <span class="mi">0</span><span class="o">);</span></div><div class='line' id='LC926'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC927'><br/></div><div class='line' id='LC928'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC929'><span class="cm">     * Write the contents of the JSONArray as JSON text to a writer. For</span></div><div class='line' id='LC930'><span class="cm">     * compactness, no whitespace is added.</span></div><div class='line' id='LC931'><span class="cm">     * &lt;p&gt;</span></div><div class='line' id='LC932'><span class="cm">     * Warning: This method assumes that the data structure is acyclical.</span></div><div class='line' id='LC933'><span class="cm">     *</span></div><div class='line' id='LC934'><span class="cm">     * @param indentFactor</span></div><div class='line' id='LC935'><span class="cm">     *            The number of spaces to add to each level of indentation.</span></div><div class='line' id='LC936'><span class="cm">     * @param indent</span></div><div class='line' id='LC937'><span class="cm">     *            The indention of the top level.</span></div><div class='line' id='LC938'><span class="cm">     * @return The writer.</span></div><div class='line' id='LC939'><span class="cm">     * @throws JSONException</span></div><div class='line' id='LC940'><span class="cm">     */</span></div><div class='line' id='LC941'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">Writer</span> <span class="nf">write</span><span class="o">(</span><span class="n">Writer</span> <span class="n">writer</span><span class="o">,</span> <span class="kt">int</span> <span class="n">indentFactor</span><span class="o">,</span> <span class="kt">int</span> <span class="n">indent</span><span class="o">)</span></div><div class='line' id='LC942'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">throws</span> <span class="n">JSONException</span> <span class="o">{</span></div><div class='line' id='LC943'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">try</span> <span class="o">{</span></div><div class='line' id='LC944'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kt">boolean</span> <span class="n">commanate</span> <span class="o">=</span> <span class="kc">false</span><span class="o">;</span></div><div class='line' id='LC945'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kt">int</span> <span class="n">length</span> <span class="o">=</span> <span class="k">this</span><span class="o">.</span><span class="na">length</span><span class="o">();</span></div><div class='line' id='LC946'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">writer</span><span class="o">.</span><span class="na">write</span><span class="o">(</span><span class="sc">&#39;[&#39;</span><span class="o">);</span></div><div class='line' id='LC947'><br/></div><div class='line' id='LC948'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(</span><span class="n">length</span> <span class="o">==</span> <span class="mi">1</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC949'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">JSONObject</span><span class="o">.</span><span class="na">writeValue</span><span class="o">(</span><span class="n">writer</span><span class="o">,</span> <span class="k">this</span><span class="o">.</span><span class="na">myArrayList</span><span class="o">.</span><span class="na">get</span><span class="o">(</span><span class="mi">0</span><span class="o">),</span></div><div class='line' id='LC950'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">indentFactor</span><span class="o">,</span> <span class="n">indent</span><span class="o">);</span></div><div class='line' id='LC951'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span> <span class="k">else</span> <span class="k">if</span> <span class="o">(</span><span class="n">length</span> <span class="o">!=</span> <span class="mi">0</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC952'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">final</span> <span class="kt">int</span> <span class="n">newindent</span> <span class="o">=</span> <span class="n">indent</span> <span class="o">+</span> <span class="n">indentFactor</span><span class="o">;</span></div><div class='line' id='LC953'><br/></div><div class='line' id='LC954'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">for</span> <span class="o">(</span><span class="kt">int</span> <span class="n">i</span> <span class="o">=</span> <span class="mi">0</span><span class="o">;</span> <span class="n">i</span> <span class="o">&lt;</span> <span class="n">length</span><span class="o">;</span> <span class="n">i</span> <span class="o">+=</span> <span class="mi">1</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC955'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(</span><span class="n">commanate</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC956'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">writer</span><span class="o">.</span><span class="na">write</span><span class="o">(</span><span class="sc">&#39;,&#39;</span><span class="o">);</span></div><div class='line' id='LC957'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC958'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(</span><span class="n">indentFactor</span> <span class="o">&gt;</span> <span class="mi">0</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC959'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">writer</span><span class="o">.</span><span class="na">write</span><span class="o">(</span><span class="sc">&#39;\n&#39;</span><span class="o">);</span></div><div class='line' id='LC960'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC961'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">JSONObject</span><span class="o">.</span><span class="na">indent</span><span class="o">(</span><span class="n">writer</span><span class="o">,</span> <span class="n">newindent</span><span class="o">);</span></div><div class='line' id='LC962'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">JSONObject</span><span class="o">.</span><span class="na">writeValue</span><span class="o">(</span><span class="n">writer</span><span class="o">,</span> <span class="k">this</span><span class="o">.</span><span class="na">myArrayList</span><span class="o">.</span><span class="na">get</span><span class="o">(</span><span class="n">i</span><span class="o">),</span></div><div class='line' id='LC963'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">indentFactor</span><span class="o">,</span> <span class="n">newindent</span><span class="o">);</span></div><div class='line' id='LC964'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">commanate</span> <span class="o">=</span> <span class="kc">true</span><span class="o">;</span></div><div class='line' id='LC965'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC966'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(</span><span class="n">indentFactor</span> <span class="o">&gt;</span> <span class="mi">0</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC967'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">writer</span><span class="o">.</span><span class="na">write</span><span class="o">(</span><span class="sc">&#39;\n&#39;</span><span class="o">);</span></div><div class='line' id='LC968'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC969'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">JSONObject</span><span class="o">.</span><span class="na">indent</span><span class="o">(</span><span class="n">writer</span><span class="o">,</span> <span class="n">indent</span><span class="o">);</span></div><div class='line' id='LC970'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC971'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">writer</span><span class="o">.</span><span class="na">write</span><span class="o">(</span><span class="sc">&#39;]&#39;</span><span class="o">);</span></div><div class='line' id='LC972'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="n">writer</span><span class="o">;</span></div><div class='line' id='LC973'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span> <span class="k">catch</span> <span class="o">(</span><span class="n">IOException</span> <span class="n">e</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC974'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">throw</span> <span class="k">new</span> <span class="nf">JSONException</span><span class="o">(</span><span class="n">e</span><span class="o">);</span></div><div class='line' id='LC975'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC976'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC977'><span class="o">}</span></div></pre></div></td>
         </tr>
       </table>
  </div>

  </div>
</div>

<a href="#jump-to-line" rel="facebox[.linejump]" data-hotkey="l" class="js-jump-to-line" style="display:none">Jump to Line</a>
<div id="jump-to-line" style="display:none">
  <form accept-charset="UTF-8" class="js-jump-to-line-form">
    <input class="linejump-input js-jump-to-line-field" type="text" placeholder="Jump to line&hellip;" autofocus>
    <button type="submit" class="button">Go</button>
  </form>
</div>

        </div>

      </div><!-- /.repo-container -->
      <div class="modal-backdrop"></div>
    </div><!-- /.container -->
  </div><!-- /.site -->


    </div><!-- /.wrapper -->

      <div class="container">
  <div class="site-footer">
    <ul class="site-footer-links right">
      <li><a href="https://status.github.com/">Status</a></li>
      <li><a href="http://developer.github.com">API</a></li>
      <li><a href="http://training.github.com">Training</a></li>
      <li><a href="http://shop.github.com">Shop</a></li>
      <li><a href="/blog">Blog</a></li>
      <li><a href="/about">About</a></li>

    </ul>

    <a href="/">
      <span class="mega-octicon octicon-mark-github" title="GitHub"></span>
    </a>

    <ul class="site-footer-links">
      <li>&copy; 2014 <span title="0.04989s from github-fe132-cp1-prd.iad.github.net">GitHub</span>, Inc.</li>
        <li><a href="/site/terms">Terms</a></li>
        <li><a href="/site/privacy">Privacy</a></li>
        <li><a href="/security">Security</a></li>
        <li><a href="/contact">Contact</a></li>
    </ul>
  </div><!-- /.site-footer -->
</div><!-- /.container -->


    <div class="fullscreen-overlay js-fullscreen-overlay" id="fullscreen_overlay">
  <div class="fullscreen-container js-fullscreen-container">
    <div class="textarea-wrap">
      <textarea name="fullscreen-contents" id="fullscreen-contents" class="fullscreen-contents js-fullscreen-contents" placeholder="" data-suggester="fullscreen_suggester"></textarea>
    </div>
  </div>
  <div class="fullscreen-sidebar">
    <a href="#" class="exit-fullscreen js-exit-fullscreen tooltipped tooltipped-w" aria-label="Exit Zen Mode">
      <span class="mega-octicon octicon-screen-normal"></span>
    </a>
    <a href="#" class="theme-switcher js-theme-switcher tooltipped tooltipped-w"
      aria-label="Switch themes">
      <span class="octicon octicon-color-mode"></span>
    </a>
  </div>
</div>



    <div id="ajax-error-message" class="flash flash-error">
      <span class="octicon octicon-alert"></span>
      <a href="#" class="octicon octicon-x close js-ajax-error-dismiss" aria-label="Dismiss error"></a>
      Something went wrong with that request. Please try again.
    </div>


      <script crossorigin="anonymous" src="https://assets-cdn.github.com/assets/frameworks-51e3b077e56f2f3244290e430b8d05253607065b.js" type="text/javascript"></script>
      <script async="async" crossorigin="anonymous" src="https://assets-cdn.github.com/assets/github-f92d49cb0619e2060af322349fe2acfbc9e011fc.js" type="text/javascript"></script>
      
      
        <script async src="https://www.google-analytics.com/analytics.js"></script>
  </body>
</html>

