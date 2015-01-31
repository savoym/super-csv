/*
 * Copyright 2007 Kasper B. Graversen
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.supercsv.cellprocessor.joda;

import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.DateTimeFormatterBuilder;
import org.joda.time.format.ISODateTimeFormat;
import org.supercsv.cellprocessor.ift.CellProcessor;

/**
 * Converts a String to a Joda LocalDate.
 * 
 * <p>
 * For constructors using DateTimeFormatter, refer to the following Joda
 * classes:
 * <ul>
 * <li>{@link DateTimeFormat} - formats by pattern and style</li>
 * <li>{@link ISODateTimeFormat} - ISO8601 formats</li>
 * <li>{@link DateTimeFormatterBuilder} - complex formats created via method
 * calls</li>
 * </ul>
 * <p>
 * For constructors using date format Strings, refer to {@link DateTimeFormat}
 * for example formats.
 * 
 * @since 2.3.0
 * @author James Bassett
 */
public class ParseLocalDate extends AbstractJodaParsingProcessor<LocalDate> {

	/**
	 * Constructs a new <tt>ParseLocalDate</tt> processor, which parses a String
	 * as a Joda LocalDate.
	 */
	public ParseLocalDate() {
	}

	/**
	 * Constructs a new <tt>ParseLocalDate</tt> processor, which parses a String
	 * as a Joda LocalDate, then calls the next processor in the chain.
	 * 
	 * @param next
	 *            the next processor in the chain
	 * @throws NullPointerException
	 *             if next is null
	 */
	public ParseLocalDate(final CellProcessor next) {
		super(next);
	}

	/**
	 * Constructs a new <tt>ParseLocalDate</tt> processor, which parses a String
	 * as a Joda LocalDate using the supplied formatter.
	 * 
	 * @param formatter
	 *            the formatter used for parsing
	 * @throws NullPointerException
	 *             if formatter is null
	 */
	public ParseLocalDate(final DateTimeFormatter formatter) {
		super(formatter);
	}

	/**
	 * Constructs a new <tt>ParseLocalDate</tt> processor, which parses a String
	 * as a Joda LocalDate using the supplied formatter, then calls the next
	 * processor in the chain.
	 * 
	 * @param formatter
	 *            the formatter used for parsing
	 * @param next
	 *            the next processor in the chain
	 * @throws NullPointerException
	 *             if formatter or next is null
	 */
	public ParseLocalDate(final DateTimeFormatter formatter,
			final CellProcessor next) {
		super(formatter, next);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected LocalDate parse(final String string) {
		return LocalDate.parse(string);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected LocalDate parse(final String string,
			final DateTimeFormatter formatter) {
		return LocalDate.parse(string, formatter);
	}
}
