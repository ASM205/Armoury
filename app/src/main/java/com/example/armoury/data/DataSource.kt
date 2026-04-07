package com.example.armoury.data

import com.example.armoury.model.Enchantment

object EnchantmentData {
    val allEnchantments = listOf(
        // --- SWORD ---
        Enchantment("Ironwood Cleave", "Sword", "Midgard", "Forged from Ironwood timber hardened over centuries. Deals bonus damage to beasts and wildlife.", "Uncommon", listOf("+28 DMG vs beasts"), "#E1F5EE"),
        Enchantment("Odin's Decree", "Sword", "Asgard", "Branded with the Allfather's seal. Cursed enemies take 30% more damage from all sources for 5 seconds.", "Legendary", listOf("+30% DMG taken", "5s"), "#FAEEDA"),
        Enchantment("Freya's Thorn", "Sword", "Vanaheim", "Infused with Vanir magic. Strikes have a chance to root enemies in enchanted vines for 2 seconds.", "Rare", listOf("20% Root chance", "2s"), "#EAF3DE"),
        Enchantment("Light Elf Blade", "Sword", "Alfheim", "Shimmers with Alfheim light energy. Critical hits blind nearby enemies for 1.5 seconds.", "Epic", listOf("Blind on crit", "1.5s AoE"), "#FBEAF0"),
        Enchantment("Brok's Masterwork", "Sword", "Svartalfheim", "Brok's finest blade. Each kill charges a runic burst that releases on the fifth consecutive strike.", "Legendary", listOf("Burst on 5th hit", "+20 Runic"), "#F1EFE8"),
        Enchantment("Leviathan's Bite", "Sword", "Niflheim", "Channels the cold of Niflheim into each strike. Enemies struck are slowed and take frost damage over time.", "Rare", listOf("+42 Frost DMG", "25% Slow"), "#E6F1FB"),
        Enchantment("Surtr's Wrath", "Sword", "Muspelheim", "Infused with Muspelheim's eternal flame. Critical hits leave a burning mark that explodes on the next strike.", "Epic", listOf("+38 Fire DMG", "Burn on crit"), "#FFDDAA"),
        Enchantment("Hel's Whisper", "Sword", "Helheim", "Forged in Helheim's cold void. Strikes have a chance to summon a spectral echo that repeats the last attack.", "Epic", listOf("15% Echo chance"), "#DDEEFF"),
        Enchantment("Giant's Fury", "Sword", "Jotunheim", "Carved from a frost giant's femur. Heavy attacks send a ground tremor that knocks nearby enemies off balance.", "Rare", listOf("Tremor on heavy", "3m radius"), "#E8E4D0"),

        // --- BREASTPLATE ---
        Enchantment("Stoneback Hide", "Breastplate", "Midgard", "Tanned from a mountain troll's hide. Reduces stagger from heavy enemy attacks by 40%.", "Uncommon", listOf("-40% Stagger"), "#E1F5EE"),
        Enchantment("Einherjar's Plate", "Breastplate", "Asgard", "Worn by Odin's chosen warriors. Grants a brief damage shield after executing a finisher move.", "Epic", listOf("Shield on finisher", "2s"), "#FAEEDA"),
        Enchantment("Yggdrasil's Bark", "Breastplate", "Vanaheim", "Bark of the World Tree woven into the armour. Slowly regenerates health when standing still for 2 seconds.", "Rare", listOf("+8 HP/sec", "On stillness"), "#EAF3DE"),
        Enchantment("Lightweave Cuirass", "Breastplate", "Alfheim", "Woven from crystallised Alfheim light. Reduces cooldown of all light runic attacks by 10 seconds.", "Rare", listOf("-10s Light Runic CD"), "#FBEAF0"),
        Enchantment("Sindri's Finest", "Breastplate", "Svartalfheim", "Sindri's most obsessively crafted piece. Increases all crafted enchantment effects by 15%.", "Legendary", listOf("+15% Enchant power"), "#F1EFE8"),
        Enchantment("Hrimthur's Shell", "Breastplate", "Niflheim", "Forged from ice giant remains. Incoming damage has a chance to encase the attacker's hands in frost.", "Epic", listOf("20% Frost reflect", "+15 Defence"), "#E6F1FB"),
        Enchantment("Ashes of Olympus", "Breastplate", "Muspelheim", "Remnants of slain gods compressed into plating. Grants brief invulnerability after a perfect parry.", "Legendary", listOf("1.5s Invuln on parry"), "#FFDDAA"),
        Enchantment("Deadweight Shroud", "Breastplate", "Helheim", "Stitched from Helheim wraith cloth. Enemies that strike you are briefly slowed by death's chill.", "Rare", listOf("20% Slow on hit", "1s"), "#DDEEFF"),
        Enchantment("Skoll's Mantle", "Breastplate", "Jotunheim", "Hide from the wolf that chases the sun. Taking lethal damage once per fight triggers a last-stand buff.", "Legendary", listOf("Last stand: +50 HP", "1x per fight"), "#E8E4D0"),

        // --- BOW & ARROW ---
        Enchantment("Ranger's Instinct", "Bow & Arrow", "Midgard", "Fletched with raven feathers blessed by a Midgard seer. Increases aimed shot damage by 20%.", "Uncommon", listOf("+20% Aimed DMG"), "#E1F5EE"),
        Enchantment("Gungnir's Echo", "Bow & Arrow", "Asgard", "Resonates with Odin's spear. Charged shots pierce through enemies and hit all targets in a line.", "Epic", listOf("Pierce on charged"), "#FAEEDA"),
        Enchantment("Nornir's Volley", "Bow & Arrow", "Vanaheim", "Enchanted by the three Norns. Every third arrow splits into three, each seeking a different target.", "Epic", listOf("Triple split", "Every 3rd arrow"), "#EAF3DE"),
        Enchantment("Bifrost Tip", "Bow & Arrow", "Alfheim", "Arrows tipped with Bifrost crystal. Enemies struck shimmer with unstable energy and shatter on the next hit.", "Legendary", listOf("+50 Bifrost DMG", "Shatter effect"), "#FBEAF0"),
        Enchantment("Dwarf-forged Bolt", "Bow & Arrow", "Svartalfheim", "Mechanically engineered by Dwarven smiths. Arrows ricochet to a second target dealing 60% of initial damage.", "Rare", listOf("Ricochet 60% DMG"), "#F1EFE8"),
        Enchantment("Mist Arrow", "Bow & Arrow", "Niflheim", "Tipped with Niflheim mist. Arrows leave a fog trail that obscures enemy vision for 3 seconds.", "Rare", listOf("3s Blind cloud"), "#E6F1FB"),
        Enchantment("Ember Shot", "Bow & Arrow", "Muspelheim", "Arrowhead forged in Surtr's forge. Ignites on release and deals fire splash damage on impact.", "Epic", listOf("+35 Fire splash", "2m radius"), "#FFDDAA"),
        Enchantment("Plague of Helheim", "Bow & Arrow", "Helheim", "Dipped in the mists of Helheim. Arrows leave a toxic spectral cloud on impact that lingers for 3 seconds.", "Rare", listOf("+30 Poison DMG", "3s cloud"), "#DDEEFF"),
        Enchantment("Skystrike Rune", "Bow & Arrow", "Jotunheim", "Carved with storm giant runes. Arrows called down from max arc deal double damage and stun on landing.", "Legendary", listOf("2x DMG on arc", "Stun on land"), "#E8E4D0"),

        // --- AXE ---
        Enchantment("Woodcutter's Curse", "Axe", "Midgard", "Blessed by a Midgard völva. Thrown axes leave a glowing mark — recalling through the mark detonates it.", "Rare", listOf("Detonate on recall"), "#E1F5EE"),
        Enchantment("Odin's Brand", "Axe", "Asgard", "Marked with the Allfather's rune. Cursed enemies take 30% more damage from all sources for 5 seconds.", "Legendary", listOf("+30% DMG taken", "5s"), "#FAEEDA"),
        Enchantment("Verdant Splitter", "Axe", "Vanaheim", "Grows living vines on impact. Enemies hit by the thrown axe are briefly entangled on landing.", "Epic", listOf("Entangle on throw", "1.5s"), "#EAF3DE"),
        Enchantment("Prism Edge", "Axe", "Alfheim", "Refracts light into blinding shards on impact. Nearby enemies are dazzled when the axe lands.", "Rare", listOf("Blind AoE on land", "2m"), "#FBEAF0"),
        Enchantment("Ironclad Return", "Axe", "Svartalfheim", "Dwarven engineering at its finest. Recall speed is doubled and deals damage equal to a full throw on return.", "Legendary", listOf("2x Recall speed", "Full DMG return"), "#F1EFE8"),
        Enchantment("Permafrost Core", "Axe", "Niflheim", "The axe head crystallises on recall, dealing frost damage to anything in its return path.", "Epic", listOf("+45 Frost on recall", "AoE path"), "#E6F1FB"),
        Enchantment("Stonecutter's Fury", "Axe", "Muspelheim", "Infused with Jotunheim storm fury. Heavy axe throws generate a fire shockwave on landing.", "Rare", listOf("+25 Fire DMG", "Shockwave on land"), "#FFDDAA"),
        Enchantment("Death's Lodestone", "Axe", "Helheim", "Magnetised with Helheim energy. Enemies near the embedded axe are slowly pulled toward it.", "Epic", listOf("Pull aura 3m"), "#DDEEFF"),
        Enchantment("Thamur's Splinter", "Axe", "Jotunheim", "Chipped from the frost giant Thamur's chisel. Throws crack the ground on landing, creating ice fault lines.", "Legendary", listOf("Ice fault on throw", "5m line"), "#E8E4D0"),

        // --- BLADES OF CHAOS ---
        Enchantment("Serpent's Lash", "Blades of Chaos", "Midgard", "Blessed by Jörmungandr. Chain whip attacks have a chance to poison enemies on each wrap.", "Rare", listOf("25% Poison on wrap"), "#E1F5EE"),
        Enchantment("Valkyrie's Torment", "Blades of Chaos", "Asgard", "Cursed by a fallen Valkyrie. Enemies killed while burning have a chance to explode, damaging nearby foes.", "Epic", listOf("30% Explosion on kill"), "#FAEEDA"),
        Enchantment("Wisp Coil", "Blades of Chaos", "Vanaheim", "Infused with Vanaheim's spirit wisps. Killing blows release a healing wisp that restores 15 HP.", "Rare", listOf("+15 HP on kill"), "#EAF3DE"),
        Enchantment("Radiant Chain", "Blades of Chaos", "Alfheim", "Shimmering with Alfheim light. Each full combo sequence ends in a light burst that stuns nearby enemies.", "Epic", listOf("Stun on full combo", "2m burst"), "#FBEAF0"),
        Enchantment("Spartan Rage Coil", "Blades of Chaos", "Svartalfheim", "Dwarven-forged coil absorbs Spartan Rage energy, converting it into raw chain damage outside rage mode.", "Legendary", listOf("+20% Rage DMG", "Passive"), "#F1EFE8"),
        Enchantment("Frost Chain", "Blades of Chaos", "Niflheim", "Dipped in Niflheim mist. Whip attacks leave a trail of frost that slows enemies crossing it for 2 seconds.", "Rare", listOf("Frost trail 2s"), "#E6F1FB"),
        Enchantment("Tartarus Chain", "Blades of Chaos", "Muspelheim", "The chains burn hotter with each consecutive hit. After 6 hits the blades erupt in a massive fire explosion.", "Legendary", listOf("+60 Fire eruption", "On 6-hit combo"), "#FFDDAA"),
        Enchantment("Wraith Tether", "Blades of Chaos", "Helheim", "Channels Helheim wraith energy. Grab attacks drain 10 HP from enemies and restore it to the wielder.", "Epic", listOf("Drain 10 HP on grab"), "#DDEEFF"),
        Enchantment("Prometheus Ember", "Blades of Chaos", "Jotunheim", "Born from the fire Prometheus stole. Grab attacks set the enemy ablaze, dealing fire damage for 4 seconds.", "Rare", listOf("+35 Fire DOT", "4s on grab"), "#E8E4D0"),

        // --- SHOULDER GUARD ---
        Enchantment("Raven's Watch", "Shoulder Guard", "Midgard", "Carved with Odin's ravens. Reveals enemy weak points as glowing marks visible through obstacles.", "Uncommon", listOf("Reveal weak points"), "#E1F5EE"),
        Enchantment("Valkyrie's Mantle", "Shoulder Guard", "Asgard", "Crafted from a fallen Valkyrie's wing. Dodge rolls leave a wind burst that knocks back nearby enemies.", "Epic", listOf("Knockback on dodge", "2m radius"), "#FAEEDA"),
        Enchantment("Thornpad", "Shoulder Guard", "Vanaheim", "Grown from Vanaheim thornwood. Melee attackers targeting the shoulder take reflected thorn damage.", "Rare", listOf("+18 Thorn reflect"), "#EAF3DE"),
        Enchantment("Lightward Pauldron", "Shoulder Guard", "Alfheim", "Absorbs Alfheim light on hit. After 5 hits absorbed, releases a blinding pulse around the wearer.", "Epic", listOf("Blind pulse on 5 hits"), "#FBEAF0"),
        Enchantment("Sindri's Weave", "Shoulder Guard", "Svartalfheim", "Sindri's finest runic stitching. Reduces all runic attack cooldowns by a flat 15 seconds.", "Rare", listOf("-15s Runic CD"), "#F1EFE8"),
        Enchantment("Frostmantle", "Shoulder Guard", "Niflheim", "Crystallised Niflheim fog woven into the guard. Reduces all frost damage taken by 35%.", "Rare", listOf("-35% Frost DMG taken"), "#E6F1FB"),
        Enchantment("Cinder Plate", "Shoulder Guard", "Muspelheim", "Hardened Muspelheim volcanic rock. Absorbs fire damage and converts 20% of it into bonus attack power.", "Epic", listOf("Convert 20% Fire DMG"), "#FFDDAA"),
        Enchantment("Wraith Bone Guard", "Shoulder Guard", "Helheim", "Carved from Helheim bone. Reduces duration of all debuffs applied to the wearer by half.", "Legendary", listOf("-50% Debuff duration"), "#DDEEFF"),
        Enchantment("Fafnir's Scale", "Shoulder Guard", "Jotunheim", "A scale from the dragon Fafnir's hide. Melee attackers are poisoned on contact with the shoulder plate.", "Rare", listOf("Poison on contact", "+10 Defence"), "#E8E4D0"),

        // --- GAUNTLETS ---
        Enchantment("Ironwood Grip", "Gauntlets", "Midgard", "Woven from Ironwood roots. Increases carry weight allowing heavier armour with no movement penalty.", "Rare", listOf("+25 Carry weight", "No speed loss"), "#E1F5EE"),
        Enchantment("Thor's Knuckle", "Gauntlets", "Asgard", "Imbued with a fragment of Mjolnir's thunder. Punch combos ending in a heavy strike release a lightning burst.", "Legendary", listOf("Lightning burst on heavy"), "#FAEEDA"),
        Enchantment("Druid's Fist", "Gauntlets", "Vanaheim", "Wrapped in Vanaheim moss that heals on contact. Each bare-handed kill restores 8 HP to the wielder.", "Rare", listOf("+8 HP on kill"), "#EAF3DE"),
        Enchantment("Lightfist", "Gauntlets", "Alfheim", "Crystallised light compressed into gauntlet knuckles. Bare-handed strikes have a chance to temporarily blind.", "Epic", listOf("20% Blind on punch"), "#FBEAF0"),
        Enchantment("Brok's Bruiser", "Gauntlets", "Svartalfheim", "Brok made these just for the satisfaction of punching things. Increases bare-handed stagger damage by 40%.", "Epic", listOf("+40% Stagger DMG"), "#F1EFE8"),
        Enchantment("Crusher's Rime", "Gauntlets", "Niflheim", "Heavy gauntlets lined with Niflheim ore. Bare-handed strikes have a chance to freeze enemies solid for 1 second.", "Epic", listOf("15% Freeze chance", "1s stun"), "#E6F1FB"),
        Enchantment("Berserker's Brand", "Gauntlets", "Muspelheim", "Knuckles glowing with berserker flame. Each kill increases punch damage by 5%, stacking up to 6 times.", "Legendary", listOf("+5% DMG per kill", "Max 6 stacks"), "#FFDDAA"),
        Enchantment("Corpse Grip", "Gauntlets", "Helheim", "Forged from the hands of Helheim sentinels. Grab attacks deal 50% more damage and last 1 second longer.", "Rare", listOf("+50% Grab DMG", "+1s duration"), "#DDEEFF"),
        Enchantment("Hrungnir's Weight", "Gauntlets", "Jotunheim", "Stone fists of the giant Hrungnir. Ground slam attacks create a shockwave that trips all nearby enemies.", "Legendary", listOf("Shockwave on slam", "4m radius"), "#E8E4D0")
    )
}