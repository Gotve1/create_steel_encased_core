

execute as @e[type=piglin] if data entity @s {ArmorItems:[{},{},{},{id:"minecraft:golden_helmet",Count:1b}]} run item replace entity @s armor.head with create_steel_encased_core:brass_helmet
execute as @e[type=piglin] if data entity @s {ArmorItems:[{},{},{id:"minecraft:golden_chestplate",Count:1b},{}]} run item replace entity @s armor.chest with create_steel_encased_core:brass_chestplate
execute as @e[type=piglin] if data entity @s {ArmorItems:[{},{},{id:"minecraft:golden_leggings",Count:1b},{}]} run item replace entity @s armor.legs with create_steel_encased_core:brass_leggings
execute as @e[type=piglin] if data entity @s {ArmorItems:[{},{},{},{id:"minecraft:golden_boots",Count:1b}]} run item replace entity @s armor.feet with create_steel_encased_core:brass_boots

execute as @e[type=piglin] if data entity @s {HandItems:[{id:"minecraft:golden_sword",Count:1b}]} run item replace entity @s weapon.mainhand with create_steel_encased_core:brass_sword

tag @s add processed
