# Run only on piglins that haven't been processed yet
execute as @e[type=piglin,tag=!processed] run function physics_pack:change_mob_equipment
