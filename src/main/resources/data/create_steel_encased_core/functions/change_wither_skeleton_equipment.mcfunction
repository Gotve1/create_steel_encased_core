
execute as @e[type=wither_skeleton] if data entity @s {HandItems:[{id:"minecraft:stone_sword",Count:1b}]} run item replace entity @s weapon.mainhand with overgeared:copper_sword

tag @s add processed
