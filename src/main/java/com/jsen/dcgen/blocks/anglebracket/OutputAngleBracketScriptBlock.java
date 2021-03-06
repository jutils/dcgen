package com.jsen.dcgen.blocks.anglebracket;

import com.jsen.dcgen.MarkMatchResult;
import com.jsen.dcgen.ScriptBlock;
import com.jsen.dcgen.script.ContentScriptBuilder;

public class OutputAngleBracketScriptBlock extends ScriptBlock {
	private static final String BLOCK_START = "<%";
	private static final String BLOCK_END = "%>";
	
	public OutputAngleBracketScriptBlock(ContentScriptBuilder contentScriptBuilder) {
		super(contentScriptBuilder, new MarkMatchResult(BLOCK_START), new MarkMatchResult(BLOCK_END));
	}
	
	@Override
	public void generate(String script) {
		contentScriptBuilder.outputVariable(script);
	}
}
