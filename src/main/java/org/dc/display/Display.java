package org.dc.display;

/*
 * #%L
 * GenericDisplay
 * %%
 * Copyright (C) 2015 - 2016 DivineCooperation
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/gpl-3.0.html>.
 * #L%
 */

import java.util.concurrent.Future;
import org.dc.jul.exception.CouldNotPerformException;

/**
 *
 * @author * @author <a href="mailto:DivineThreepwood@gmail.com">Divine Threepwood</a>
 */
public interface Display {

    /**
     * Shows the given URL on the generic display.
     *
     * @param url the URL to display
     * @return
     * @throws CouldNotPerformException
     */
    public Future<Void> showURL(final String url) throws CouldNotPerformException;

    /**
     * Shows the given html content on the generic display.
     *
     * @param content
     * @return
     * @throws CouldNotPerformException
     */
    public Future<Void> showHTMLContent(String content) throws CouldNotPerformException;

    /**
     * Shows the given info text on the generic display.
     *
     * @param text the text to display
     * @return
     * @throws CouldNotPerformException
     */
    public Future<Void> showInfoText(final String text) throws CouldNotPerformException;

    /**
     * Shows the given warn text on the generic display.
     *
     * @param text the text to display
     * @return
     * @throws CouldNotPerformException
     */
    public Future<Void> showWarnText(final String text) throws CouldNotPerformException;

    /**
     * Shows the given error text on the generic display.
     *
     * @param text the text to display
     * @return
     * @throws CouldNotPerformException
     */
    public Future<Void> showErrorText(final String text) throws CouldNotPerformException;

    /**
     * Shows the given text on the generic display.
     *
     * @param text the text to display
     * @return
     * @throws CouldNotPerformException
     */
    public Future<Void> showText(final String text) throws CouldNotPerformException;

    /**
     * Shows the given image centralized on the generic display.
     *
     * @param image the image to display
     * @return
     * @throws CouldNotPerformException
     */
    public Future<Void> showImage(final String image) throws CouldNotPerformException;

    /**
     * Displays the server in foreground fullscreen mode or hides the overall window.
     *
     * @param visible
     * @return
     * @throws CouldNotPerformException
     */
    public Future<Void> setVisible(final Boolean visible) throws CouldNotPerformException;
}
