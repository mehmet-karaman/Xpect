/*******************************************************************************
 * Copyright (c) 2012-2017 TypeFox GmbH and itemis AG.
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *   Moritz Eysholdt - Initial contribution and API
 *******************************************************************************/

package org.eclipse.xpect.parameter;

import org.eclipse.xpect.setup.XpectSetupFactory;
import org.eclipse.xpect.state.Creates;
import org.eclipse.xpect.text.IRegion;

import com.google.common.base.Preconditions;

@XpectSetupFactory
public class OffsetProvider {
	private final OffsetRegion region;

	public OffsetProvider(OffsetRegion region) {
		Preconditions.checkNotNull(region);
		this.region = region;
	}

	@Creates
	public int getMatchedOffset() {
		return region.getMatchedOffset();
	}

	@Creates
	public IRegion getMatchedRegion() {
		return region.getMatchedRegion();
	}
}
