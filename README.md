MudPlus (a.k.a. Mud++)
=======
<p> An open-source Groovy/Grails project under the GNU-Public license, with some slight alterations intended to help the community grow: </p>
<ul>
  <li> Use/redistribution/code-alteration are all encouraged, provided you leave any original header-comments in the files and follow the rest of the GNU-Public license </li>
  <li> Please keep any additions to the driver portion of this project open-source. Make it your own github project if you wish, but please mention MUD++ and the URL of this github project as the original code-base </li>
  <li>Your changes to the basic lib should probably remain private so that no one can just steal your mud at will; building areas takes a lot of writing from various contributors and I perfectly understand the need for closed-source here. Building a sophisticated lib even more so. All lib-only classes will be clearly placed within a package named "lib" and its subfolders </li>
  <li> If you wish to contribute code to the basic Mud++ Lib (which will always be open-source), see the section below on becoming a contributor. </li>
</ul>

Project Goal:
======
<p> To modernize the experience of MUDing, that is, to provide a simple, maintainable, open-source, and FREE way of creating text-based games commonly known as MUDs (also as MUSHes and MOOs). </p>

<p> Have you ever wanted to make your own web-based game but thought it too difficult to design all the necessary infrastructure? Mud++ provides you with all of the tools you need to quickly leap into creating your own virtual world: </p>

<ul>
  <li> <b>MUD++ Driver</b>
    <ul>
      <li> Modern Security: prevents common attacks against web sites, handles the tracking of User (a.k.a Soul) credentails, and provides fine-grained security policies at the class and class-member-level for what SecurityRole authorizations a Soul needs to run any particular code.</li>
      <li> Atomic Support Classes: designed with the idea in mind that each MUD is unique and your MudLib should be able to be largely unrestricted by driver concerns.</li>
      <li> Runtime, Community-Friendly, Sandboxed Development: with MUD++, we keep with the LPMUD tradition of allowing code to be created at runtime so that the server has no need to reboot with every change to the lib.</li>
      <li> Easy to use language parsing and run-time modifiable language rules/addition of verbs </li>
      <li> Tracking/State Storing (in JSON format) of game objects from dummies to carryables to weapons to npcs to souls.</li>
      <li> Support for your custom daemons (background processes) that allow your world to change with conditions you define, such as weather, time, seasons, area-specific events, etc.
      <li> Driver Functions that help you keep your main efforts geared toward world-building rather than code, without limiting the possibilities of your code </li>
      <li> Through-browser User Interface for runtime submission of code for creators </li>
      <li> Through-browser UI for common admin functions such as altering permissions, banning, logging, and analytics </li>
      <li> Use of modern scripting/OO language Groovy: easy to learn for those new to code, a certified Java language that those familiar with Java will love, succinct, intuitive, yet no compromising as far as functionality, and with several IDEs available ranging from Sublime Text Editor 2 (recommended for area-creators) to IntelliJ Ultimate Edition (recommended for power users) </li>
      <li> New Modern Browser Feature Support: html links, static and dynamically-drawn images, mapping, sounds, etc. </li>
      <li> Cross-platform support and Ease of Deployment: any web-server capable of hosting a .WAR file is ready for MUD++ </li>
    </ul>
  </li>
  <li> <b>Includes the Basic Mud++ Lib</b>
    <ul>
      <li> Provides a basis you can tailor for your own world </li>
      <li> Respects LPMud tradition while adding improvements. Harks back to the DeadSouls LPMudLib that was used to produce Nightmare LPMud and then countless others </li>
      <li> Substitutes Groovy for the antiquated LPC programming language. This allows creators to have modern coding tools and a much more intuitive syntax that's better for both beginners and code-gurus </li>
    </ul>
  </li>
</ul>

About the Primary Developer
======
<p> Toaster (a.k.a. MerelyPixels) is a veteran creator and admin from various MUDs, but primarily known to frequent Nightmare LPMud and then the continuation of Nightmare called Rise Of Praxis LPMud, once Nightmare sadly died due to hardware failure and a lack of proper backup systems in place </p>

<p> Toaster is a professional (Web or Desktop) Application Developer with more than six years of professional experience and more than 16 years of personal experience in a wide variety of languages/frameworks/APIs/IDEs/etc. He has been Admin in charge of Lib development of Rise of Praxis for roughly four years, a creator at Nightmare for 2 years before that, and a player of Nightmare since roughly 1996 </p>

Why Text-Based Gaming in 201X?
======
<p> Toaster always felt lucky to have grown up in an age where the internet was in its youth. Chat rooms had recently evolved into the first attempt at MMORPGs: MUDs, MUSHes, and MOOs (the distinctions between these are slight at best). These were necessary text-based games because graphical support for any game was limited at the time. Because browsers and computer/internet-connection speeds hadn't evolved far enough to handle the necessary code to integrate such a game into the browser, client programs like telnet/putty were used to communicate with the driver and then, later, more sophisticated clients like Zmud evolved. </p>

<p> As of the current date, computers and browsers have evolved a long ways, antiquating the old tools for text-based game development. Toaster found that, in trying to update the lib of the DeadSouls LPMud, the main frustrations were being unable to use a modern IDE for refactoring and simple checking of code, not being able to easily submit code to the server, and having to use LPC, which he has a love-hate relationship with to this day. In contrast to LPC, Groovy looks almost like plain-text, and LPC isn't the most daunting language out there as far as looking like mathematical scribbles about the nature of the universe. </p>

<p> But why text? An easy answer would be that even 2D graphics take time to create and 3D graphics even more so. But the true answers lie deeper. Toaster would perhaps never have come to love coding if he had not been immersed in a world capable of <i>being created by multiple people while it runs.</i> As a gift to the internet community, he now wishes to return the favor and some of the debt he owes to people like Descartes, and pave the way for a new generation of "simple" games that a smart teenager could create without having to worry about time-sinks like graphics unless they wish to. Of course power-users familiar with how MUD drivers/libs work will note that the "simplicity" of these games is really a clever illusion created by a good driver/lib combo that abstracts the complexities of the code from the common user. </p>

<p> No discussion of text-based gaming is complete without mentioning the true power of text itself. Our society has created so many ways of displaying life-like images that in some meaningful ways it detracts rather than adds to the freedom of the individual in imagining what something would look, feel, sound, taste like given a good description in pure text. But even if you don't care about that particular freedom, muds have evolved from the first choose-your-own-adventure books to also provide great freedom for the reader/player/creator in choosing their own path through the story. And as if that wasn't enough, text-based games are not <i>limited by concerns about images</i> like other MMOs. Consider that if a MUD is essentially an exchange of text between users and a common server, anything that can be put into words is possible. This is the true power of text-based gaming: the only limits are the boundaries of your own imagination. </p>

<p> While MUD++ and its derivatives will not be the first MUDs that have been browser-based, they will be the only completely open-source muds to Toaster's knowledge, with the exception of the lib code. Toaster fully understands and expects that you will keep your lib and realms private so that it's harder for people to steal all of your hard work in making your lib distinct. While Toaster will provide a basic lib to start from, he does not propose to keep developments to the lib public. Still, in Toaster's opinion, this is a much-needed project that simultaneously solves critical, nagging issues with the current open-source telnet-style mud drivers/libs while bringing modern tools and browser abilities within easy reach of developers and thereby to players. </p>

Want to Become a Contributor?
======
<p> Mud++ is currently in the initial development stage and, to keep things simpler for now, Toaster (a.k.a. MerelyPixels) reserves the right to exclusive code-contribution. However, Toaster would welcome any ideas or code-review that anyone wishes to contribute. Toaster will set up Contributor accounts to by default be able to comment on any wikis or whatever provided by github once he gets the chance, but community <i>code</i> contributions are not appropriate as of this time. Toaster will update you here once the project is fleshed out more. </p>
