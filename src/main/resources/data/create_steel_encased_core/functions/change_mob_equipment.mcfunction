execute as @e[type=piglin] if data entity @s {ArmorItems:[{},{},{},{id:"minecraft:golden_helmet",Count:1b}]} run item replace entity @s armor.head with minecraft:iron_helmet
execute as @e[type=piglin] if data entity @s {ArmorItems:[{},{},{id:"minecraft:golden_chestplate",Count:1b},{}]} run item replace entity @s armor.chest with minecraft:iron_chestplate
execute as @e[type=piglin] if data entity @s {ArmorItems:[{},{},{id:"minecraft:golden_leggings",Count:1b},{}]} run item replace entity @s armor.leggings with minecraft:iron_leggings



tag @s add processed
