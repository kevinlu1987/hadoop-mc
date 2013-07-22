package org.apache.hadoop.mapreduce.lib.input;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.InputSplit;
import org.apache.hadoop.mapreduce.RecordReader;
import org.apache.hadoop.mapreduce.TaskAttemptContext;

public class MCachedInputFormat extends TextInputFormat{

	  @Override
	  public RecordReader<LongWritable, Text> 
	    createRecordReader(InputSplit split,
	                       TaskAttemptContext context) {
	    return new MCachedRecordReader();
	  }
	
}
