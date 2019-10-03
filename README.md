The java RMI implemenetation for Bank System, Calculator and Chat are stored in the respective directories:<br>
<ul>
  <li>Bank</li>
  <li>Calculator</li>
  <li>Chat</li>
</ul>
In the Calculator RMI application, you need to do the following: <br>
<ol>
  <li><b>cd Server</b> Change directory to the <em>Server</em> </li> 
  <li><em><b>javac Server.java</b></em> compile the <em>server.java</em> code</li>
  <li><em><b>java Server</b></em>   to run the server</li>
  you will see the message <em> server is running</em>.
</ol>
<br>
Now do the following to invoke the server from a remote Client:
<ul>
  <li><b>cd Client</b> change directory to Client</li>
  <li><b>java Client.java</b> compile the <em> Client.java</em> code</li> 
  <li><b>java Client</b> run the client</li>
</ul>

<b>Note:</b>This Server - Client code for the calculator was implemented assuming that both the client and the server lay on the same machine. <br>
<b>Future work:</b> The code will be modified in such a way that the server and the client are working on different machines.




