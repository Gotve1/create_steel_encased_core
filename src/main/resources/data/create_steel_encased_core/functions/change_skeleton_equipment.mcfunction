
execute as @e[type=skeleton] if data entity @s {ArmorItems:[{},{},{},{id:"minecraft:chainmail_helmet",Count:1b}]} run item replace entity @s armor.head with overgeared:copper_helmet
execute as @e[type=skeleton] if data entity @s {ArmorItems:[{},{},{id:"minecraft:chainmail_chestplate",Count:1b},{}]} run item replace entity @s armor.chest with overgeared:copper_chestplate
execute as @e[type=skeleton] if data entity @s {ArmorItems:[{},{},{id:"minecraft:chainmail_leggings",Count:1b},{}]} run item replace entity @s armor.legs with overgeared:copper_leggings
execute as @e[type=skeleton] if data entity @s {ArmorItems:[{},{},{},{id:"minecraft:chainmail_boots",Count:1b}]} run item replace entity @s armor.feet with overgeared:copper_boots



execute as @e[type=skeleton] if data entity @s {ArmorItems:[{},{},{},{id:"minecraft:iron_helmet",Count:1b}]} run item replace entity @s armor.head with overgeared:copper_helmet
execute as @e[type=skeleton] if data entity @s {ArmorItems:[{},{},{id:"minecraft:iron_chestplate",Count:1b},{}]} run item replace entity @s armor.chest with overgeared:copper_chestplate
execute as @e[type=skeleton] if data entity @s {ArmorItems:[{},{},{id:"minecraft:iron_leggings",Count:1b},{}]} run item replace entity @s armor.legs with overgeared:copper_leggings
execute as @e[type=skeleton] if data entity @s {ArmorItems:[{},{},{},{id:"minecraft:iron_boots",Count:1b}]} run item replace entity @s armor.feet with overgeared:copper_boots

execute as @e[type=skeleton] if data entity @s {HandItems:[{id:"minecraft:iron_sword",Count:1b}]} run item replace entity @s weapon.mainhand with overgeared:copper_sword
execute as @e[type=skeleton] if data entity @s {HandItems:[{id:"minecraft:iron_axe",Count:1b}]} run item replace entity @s weapon.mainhand with overgeared:copper_axe
execute as @e[type=skeleton] if data entity @s {HandItems:[{id:"minecraft:iron_pickaxe",Count:1b}]} run item replace entity @s weapon.mainhand with overgeared:copper_pickaxe
execute as @e[type=skeleton] if data entity @s {HandItems:[{id:"minecraft:iron_hoe",Count:1b}]} run item replace entity @s weapon.mainhand with overgeared:copper_hoe
execute as @e[type=skeleton] if data entity @s {HandItems:[{id:"minecraft:iron_shovel",Count:1b}]} run item replace entity @s weapon.mainhand with overgeared:copper_shovel



execute as @e[type=skeleton] if data entity @s {ArmorItems:[{},{},{},{id:"minecraft:golden_helmet",Count:1b}]} run item replace entity @s armor.head with create_steel_encased_core:brass_helmet
execute as @e[type=skeleton] if data entity @s {ArmorItems:[{},{},{id:"minecraft:golden_chestplate",Count:1b},{}]} run item replace entity @s armor.chest with create_steel_encased_core:brass_chestplate
execute as @e[type=skeleton] if data entity @s {ArmorItems:[{},{},{id:"minecraft:golden_leggings",Count:1b},{}]} run item replace entity @s armor.legs with create_steel_encased_core:brass_leggings
execute as @e[type=skeleton] if data entity @s {ArmorItems:[{},{},{},{id:"minecraft:golden_boots",Count:1b}]} run item replace entity @s armor.feet with create_steel_encased_core:brass_boots

execute as @e[type=skeleton] if data entity @s {HandItems:[{id:"minecraft:golden_sword",Count:1b}]} run item replace entity @s weapon.mainhand with create_steel_encased_core:brass_sword
execute as @e[type=skeleton] if data entity @s {HandItems:[{id:"minecraft:golden_axe",Count:1b}]} run item replace entity @s weapon.mainhand with create_steel_encased_core:brass_axe
execute as @e[type=skeleton] if data entity @s {HandItems:[{id:"minecraft:golden_pickaxe",Count:1b}]} run item replace entity @s weapon.mainhand with create_steel_encased_core:brass_pickaxe
execute as @e[type=skeleton] if data entity @s {HandItems:[{id:"minecraft:golden_hoe",Count:1b}]} run item replace entity @s weapon.mainhand with create_steel_encased_core:brass_hoe
execute as @e[type=skeleton] if data entity @s {HandItems:[{id:"minecraft:golden_shovel",Count:1b}]} run item replace entity @s weapon.mainhand with create_steel_encased_core:brass_shovel



execute as @e[type=skeleton] if data entity @s {ArmorItems:[{},{},{},{id:"minecraft:diamond_helmet",Count:1b}]} run item replace entity @s armor.head with tfmg:steel_helmet
execute as @e[type=skeleton] if data entity @s {ArmorItems:[{},{},{id:"minecraft:diamond_chestplate",Count:1b},{}]} run item replace entity @s armor.chest with tfmg:steel_chestplate
execute as @e[type=skeleton] if data entity @s {ArmorItems:[{},{},{id:"minecraft:diamond_leggings",Count:1b},{}]} run item replace entity @s armor.legs with tfmg:steel_leggings
execute as @e[type=skeleton] if data entity @s {ArmorItems:[{},{},{},{id:"minecraft:diamond_boots",Count:1b}]} run item replace entity @s armor.feet with tfmg:steel_boots

execute as @e[type=skeleton] if data entity @s {HandItems:[{id:"minecraft:diamond_sword",Count:1b}]} run item replace entity @s weapon.mainhand with tfmg:steel_sword
execute as @e[type=skeleton] if data entity @s {HandItems:[{id:"minecraft:diamond_axe",Count:1b}]} run item replace entity @s weapon.mainhand with tfmg:steel_axe
execute as @e[type=skeleton] if data entity @s {HandItems:[{id:"minecraft:diamond_pickaxe",Count:1b}]} run item replace entity @s weapon.mainhand with tfmg:steel_pickaxe
execute as @e[type=skeleton] if data entity @s {HandItems:[{id:"minecraft:diamond_hoe",Count:1b}]} run item replace entity @s weapon.mainhand with tfmg:steel_hoe
execute as @e[type=skeleton] if data entity @s {HandItems:[{id:"minecraft:diamond_shovel",Count:1b}]} run item replace entity @s weapon.mainhand with tfmg:steel_shovel


tag @s add processed