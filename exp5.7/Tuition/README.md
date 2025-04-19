## Pseudocode
START

  // Initialize variables
  SET current_tuition = 10000
  SET annual_increase_rate = 0.05

  // Calculate tuition in ten years
  SET tuition_in_ten_years = current_tuition
  FOR year FROM 1 TO 10
    SET tuition_in_ten_years = tuition_in_ten_years * (1 + annual_increase_rate)
  END FOR

  // Display tuition in ten years
  DISPLAY "Tuition in ten years: $", tuition_in_ten_years (formatted to 2 decimal places)

  // Calculate the total cost of four years' tuition after the tenth year
  SET total_cost_after_ten_years = 0
  SET tuition_after_ten_years = tuition_in_ten_years

  FOR year FROM 1 TO 4
    SET total_cost_after_ten_years = total_cost_after_ten_years + tuition_after_ten_years
    SET tuition_after_ten_years = tuition_after_ten_years * (1 + annual_increase_rate)
  END FOR

  // Display the total cost
  DISPLAY "Total cost of four years' tuition after the tenth year: $", total_cost_after_ten_years (formatted to 2 decimal places)

END