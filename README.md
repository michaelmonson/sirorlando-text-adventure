# sirorlando-text-adventure
My first attempt at creating a nostalgic Text Adventure game to hail back to the golden age of Adventure, Colossal Cave, Zork!, and many other Infocom classics.  
For those of you who grew up in the modern age of Windows and beyond, you may not have an appreciation for the text-driven adventures of 30 years ago.
The stories were compelling, engaging, and made use of clever language parsor's.  Infocom truly redefined the genre of the early adventure games by creating 
a language parsor intelligent enough to handle much more than simple noun-verb commands.  It could break apart more complex sentances and understand an impressive number of verbs.  

My goal with this project will be to build an intelligent language parsor and capability reminisicent of the Infocom Text Adventures.

As I work towards Java 1.8 certification, I felt this would be a fun way to practice a variety of Java skills.

### March 2024 Update

Wow!  It's been a LONG time since I started this project.  About 4½ years ago.  At the time, I was working hard on my Java 8 certification, but I became
increasingly busy at work as I prepared to roll off my project as an Enterprise Services Engineer.  Also, family life was keeping me very busy.  So I never
did continue with this project. Less than 3 months later, I accepted a position at Ancestry, and that kept me busy, but learning C# and .NET
If you look in my other repositories, you will find a second Text Adventure project, written in C#.  That I did to learn more about development on the Microsoft side.

I have a lot of great ideas on how I can do this in Java, and I think I can at least match the sophistication of an Infocom Text adventure.
My goal is to provide a language parser that is more sophisticated than simple Noun / Verb commands.

1. I wish to build in a lexicon-based language parser that is more sophisticated than simple Noun / Verb commands.  It will understand similar words, such as a rudimentary thesaurus.  The richer the language support, the more flexible the game experience will be for the player.
2. Support actions and commands.
3. Support rooms, with directions out of each.  Standard N, S, E, W, but also support Up and Down, and In and Out, and possibly other unique directions
   * Traditionally (in BASIC many years ago), I have assigned a number to each room, such as in a double array, and in this way, each "room" can link to other rooms by their number.
   * Perhaps there are more sophisticated ways of doing it with lists, linked lists, etc.
4. Support objects.  The ability to pick up and use them, such as with tools, food for health, etc.
   * Support other characters as well.  Creatures and people that you can interact with.  All of these creatures and people are NPC's (non player characters)
   * Support room and object descriptions (verbose and detailed), room titles, and changes in description as the game progresses, or events occur.
   * An awareness of where objects are when manipulated by the player or other characters within the game, such as items that are picked up in one room and dropped off in another.
5. Score points when achieving goals and solving puzzles.
6. Possibly an awareness of time, where events are affected by the passage of minutes, hours, and days.
7. Plenty of puzzles and conundrums that must be considered and solved.

Really, the goal is to at least equal the sophistication of an Infocom text adventure from the 1980's.  And especially flexibility with advanced language comprehension.
