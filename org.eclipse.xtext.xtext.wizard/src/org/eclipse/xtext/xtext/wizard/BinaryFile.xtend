package org.eclipse.xtext.xtext.wizard

import java.net.URL
import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor

@FinalFieldsConstructor
class BinaryFile extends AbstractFile {

	@Accessors val URL content

	def URL getContent() {
		return content
	}
}