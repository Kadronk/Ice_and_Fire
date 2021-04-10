Dragons, Hypogriffs, Pixies, Oh my!

This fork contains a modified version of Ice and Fire for MC 1.16.3, that disables friendly fire between tamed dragons and any tamed mobs (including other tamed dragons) no matter who their owners are. (In the base version, dragons cannot hurt their owner's pets, but can hurt others'). This modification was made for the modded server i'm playing with my friends.

Here are the files I modified:
- **DragonUtils.java** : Added *hasOwnerOrIsTamed(Entity entity)*, a function that returns a bool depending on if the given entity is tamed, or has an owner.
- **EntityDragonBase.java** : Modified *shouldAttackEntity*, so that the IA doesn't try to attack tamed/owned mobs. I don't actually know if this makes a big difference.
- **IafDragonDestructionManager.java** : Modified a bit of almost every function, so that tamed/owned mobs don't get hurt when a tamed dragon breathes fire/ice/lightning at them.
- **IafDragonLogic.java** : Modified *updateDragonServer* so that if a tamed/owned mob is targeted by a tamed dragon chomp attack, it won't get hurt.

Since OpenJDK doesn't have JavaFX, and I ran into problems when I tried to import it, I also made the following changes only so that I could compile the code without JavaFX:
- Created **Pair.java** class, which is a copypaste of JavaFX's *Pair* class. Only used in **AbstractPathJob.java**.
- Removed JavaFX's *Tab* class import from **IceAndFireTabulaModelAnimator.java**. Eclipse said it was unused.

Now the mod is running fine so far, with my changes working as intended, except for one issue : **Sometimes, generating Gorgon Temples crashed our server. We had to disable Gorgon Temples generation.** I don't even know if this is due to my modifications, or another mod in our modpack. But yeah, if you want to use this modified version of Ice and Fire, keep that in mind.
