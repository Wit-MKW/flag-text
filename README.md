# flag-text
A Java programme that converts between Discord regional indicator characters and text.

Discord has emoji whose symbols are:
`:regional_indicator_x:`
`:flag_xx:`
`:united_nations:`

`:regional_indicator_x::regional_indicator_y:` becomes `:flag_xy:`, unless `:flag_xy:` does not exist, in which case
  it becomes two boxed letters.
One notable exception is `:regional_indicator_u::regional_indicator_n:`, which becomes `:united_nations:`.

My flag-text programme converts between standard letters and regional indicator emoji.
