/*
	Copyright 2018 Marceau Dewilde <m@ceau.be>

	Licensed under the Apache License, Version 2.0 (the "License");
	you may not use this file except in compliance with the License.
	You may obtain a copy of the License at

		http://www.apache.org/licenses/LICENSE-2.0

	Unless required by applicable law or agreed to in writing, software
	distributed under the License is distributed on an "AS IS" BASIS,
	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
	See the License for the specific language governing permissions and
	limitations under the License.
*/
package be.ceau.chart.options.scales;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import be.ceau.chart.options.ticks.Ticks;

@JsonInclude(Include.NON_EMPTY)
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class YAxis<T extends Ticks<T>> {

	/**
	 * @see #setTicks(Ticks)
	 */
	private T ticks;

	/**
	 * Default {@code "linear"}
	 * 
	 * @see #setType(String type)
	 */
	private String type;

	/**
	 * Default {@code true}
	 * 
	 * @see #setDisplay(Boolean display)
	 */
	private Boolean display;

	/**
	 * Default {@code "y-axis-0"}
	 * 
	 * @see #setId(String id)
	 */
	private String id;

	/**
	 * Default {@code false}
	 * 
	 * @see #setStacked(Boolean stacked)
	 */
	private Boolean stacked;
	
	
	/**
	 * Default {@code offsetGridLines == true}
	 * 
	 * @see #setGridLines(GridLines gridLines)
	 */
	private GridLines gridLines;

	/**
	 * @see #setTicks(Ticks)
	 */
	public T getTicks() {
		return ticks;
	}

	/**
	 * Defines options for the tick marks that are generated by the axis
	 */
	public YAxis<T> setTicks(T ticks) {
		this.ticks = ticks;
		return this;
	}

	/**
	 * @see #setType(String type)
	 */
	public String getType() {
		return this.type;
	}

	/**
	 * As defined in Scales.
	 */
	public YAxis<T> setType(String type) {
		this.type = type;
		return this;
	}

	/**
	 * @see #setDisplay(Boolean display)
	 */
	public Boolean getDisplay() {
		return this.display;
	}

	/**
	 * If true, show the scale.
	 */
	public YAxis<T> setDisplay(Boolean display) {
		this.display = display;
		return this;
	}

	/**
	 * @see #setId(String id)
	 */
	public String getId() {
		return this.id;
	}

	/**
	 * Id of the axis so that data can bind to it.
	 */
	public YAxis<T> setId(String id) {
		this.id = id;
		return this;
	}

	/**
	 * @see #setStacked(Boolean stacked)
	 */
	public Boolean getStacked() {
		return this.stacked;
	}

	/**
	 * If true, bars are stacked on the y-axis
	 */
	public YAxis<T> setStacked(Boolean stacked) {
		this.stacked = stacked;
		return this;
	}
	
	/**
	 * @see #setGridLines(GridLines gridLines)
	 */
	public GridLines getGridLines() {
		return this.gridLines;
	}

	/**
	 * If true, the bars for a particular data point fall between the grid lines. The grid line will
	 * move to the left by one half of the tick interval. If false, the grid line will go right down the
	 * middle of the bars.
	 */
	public YAxis<T> setGridLines(GridLines gridLines) {
		this.gridLines = gridLines;
		return this;
	}

}
