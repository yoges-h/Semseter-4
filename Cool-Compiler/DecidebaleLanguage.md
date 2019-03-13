
#### A DFA is a decidable language.

      We Need a TM that Accepts a DFA D <D,w>

      w is a string 
       if it Accepts then we will accepts then we will accepts otherwise we will reject 

#### A NFA is a decidable language.

      We present a TM N that decides A NFA. We could design N to operate like M, simulating an NFA instead of a DFA. 
      Instead, we’ll do it differently to illustrate a new idea: Have N use M as a subroutine.
      Because M is designed to work with DFAs, N first converts the NFA it receives as input to a DFA before passing it to M .
 
 
      N = “On input ⟨B, w⟩, where B is an NFA and w is a string:
 
       Convert NFA B into DFA C 
 
      Run TM of Input <C,w>
 
     if M Accepts then  accepts else Reject.
 
#### AREX is a decidable language.

     P = “On input ⟨R, w⟩, where R is a regular expression and w is a string"

    Convert Regular expression into Equvilant into Equal NFA  A 
  
    if NFA <A,w> Accepts then Accepts else Reject./
  
 
 #### EDFA is a decidable language.
 
      A DFA accepts some string iff reaching an accept state from the 
      start state by traveling along the arrows of the DFA is possible.
 
      Construct a TM T 
 
 T = “On input ⟨A⟩, where A is a DFA:
     Mark the start state of A.'
     Repeat until no new states get marked:
     
     Mark any state that has a transition coming into it from any
     state that is already marked.

     If no accept state is marked, accept; otherwise, reject.”

#### ACFG is a decidable language.
        TM S for ACFG follows.
       S = “On input ⟨G, w⟩, where G is a CFG and w is a string:
      
       Convert G to an equivalent grammar in Chomsky normal form.
       
       List all derivations with 2n − 1 steps, where n is the length of w;
       except if n = 0, then instead list all derivations with one step.
       
       If any of these derivations generate w, accept; if not, reject.”
       
 #### Every context-free language is decidable.
     
     Let G be a CFG for A and design a TM MG that decides A. We build a copy of G into MG. It works as follows.
          MG = “On input w:
          Run TM S on input ⟨G, w⟩.
          If this machine accepts, accept; if it rejects, reject.”
          
#### ATM is undecidable.
     U =“On input⟨M,w⟩,where M is a TM and w is a string:
     Simulate M on input w.
     
     If M ever enters its accept state, accept; if M ever enters its
      reject state, reject.”
