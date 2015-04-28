package com.falsetrue.titecs.activities.db;

import android.os.Parcel;
import android.os.Parcelable;

public class Statistics implements Parcelable{
	
	public static final Creator<Statistics> CREATOR = new StatisticsCreator();

	private int id;
	
	private float l1Percents;
	private float l2Percents;
	private float l3Percents;
	private float l4Percents;
	private float l5Percents;
	
	private int l1Done;
	private int l2Done;
	private int l3Done;
	private int l4Done;
	private int l5Done;
	
	public Statistics(int id, float l1Percents, float l2Percents,
			float l3Percents, float l4Percents, float l5Percents, int l1Done,
			int l2Done, int l3Done, int l4Done, int l5Done) {
		super();
		this.id = id;
		this.l1Percents = l1Percents;
		this.l2Percents = l2Percents;
		this.l3Percents = l3Percents;
		this.l4Percents = l4Percents;
		this.l5Percents = l5Percents;
		this.l1Done = l1Done;
		this.l2Done = l2Done;
		this.l3Done = l3Done;
		this.l4Done = l4Done;
		this.l5Done = l5Done;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public float getL1Percents() {
		return l1Percents;
	}

	public void setL1Percents(float l1Percents) {
		this.l1Percents = l1Percents;
	}

	public float getL2Percents() {
		return l2Percents;
	}

	public void setL2Percents(float l2Percents) {
		this.l2Percents = l2Percents;
	}

	public float getL3Percents() {
		return l3Percents;
	}

	public void setL3Percents(float l3Percents) {
		this.l3Percents = l3Percents;
	}

	public float getL4Percents() {
		return l4Percents;
	}

	public void setL4Percents(float l4Percents) {
		this.l4Percents = l4Percents;
	}

	public float getL5Percents() {
		return l5Percents;
	}

	public void setL5Percents(float l5Percents) {
		this.l5Percents = l5Percents;
	}

	public int getL1Done() {
		return l1Done;
	}

	public void setL1Done(int l1Done) {
		this.l1Done = l1Done;
	}

	public int getL2Done() {
		return l2Done;
	}

	public void setL2Done(int l2Done) {
		this.l2Done = l2Done;
	}

	public int getL3Done() {
		return l3Done;
	}

	public void setL3Done(int l3Done) {
		this.l3Done = l3Done;
	}

	public int getL4Done() {
		return l4Done;
	}

	public void setL4Done(int l4Done) {
		this.l4Done = l4Done;
	}

	public int getL5Done() {
		return l5Done;
	}

	public void setL5Done(int l5Done) {
		this.l5Done = l5Done;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + l1Done;
		result = prime * result + Float.floatToIntBits(l1Percents);
		result = prime * result + l2Done;
		result = prime * result + Float.floatToIntBits(l2Percents);
		result = prime * result + l3Done;
		result = prime * result + Float.floatToIntBits(l3Percents);
		result = prime * result + l4Done;
		result = prime * result + Float.floatToIntBits(l4Percents);
		result = prime * result + l5Done;
		result = prime * result + Float.floatToIntBits(l5Percents);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Statistics other = (Statistics) obj;
		if (id != other.id)
			return false;
		if (l1Done != other.l1Done)
			return false;
		if (Float.floatToIntBits(l1Percents) != Float
				.floatToIntBits(other.l1Percents))
			return false;
		if (l2Done != other.l2Done)
			return false;
		if (Float.floatToIntBits(l2Percents) != Float
				.floatToIntBits(other.l2Percents))
			return false;
		if (l3Done != other.l3Done)
			return false;
		if (Float.floatToIntBits(l3Percents) != Float
				.floatToIntBits(other.l3Percents))
			return false;
		if (l4Done != other.l4Done)
			return false;
		if (Float.floatToIntBits(l4Percents) != Float
				.floatToIntBits(other.l4Percents))
			return false;
		if (l5Done != other.l5Done)
			return false;
		if (Float.floatToIntBits(l5Percents) != Float
				.floatToIntBits(other.l5Percents))
			return false;
		return true;
	}

	@Override
	public int describeContents() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void writeToParcel(Parcel dest, int flags) {
		// TODO Auto-generated method stub
		dest.writeInt(id);
		dest.writeFloat(l1Percents);
		dest.writeFloat(l2Percents);
		dest.writeFloat(l3Percents);
		dest.writeFloat(l4Percents);
		dest.writeFloat(l5Percents);
		dest.writeInt(l1Done);
		dest.writeInt(l2Done);
		dest.writeInt(l3Done);
		dest.writeInt(l4Done);
		dest.writeInt(l5Done);
	}
	
	private static class StatisticsCreator implements Creator<Statistics>{

		@Override
		public Statistics createFromParcel(Parcel source) {
			// TODO Auto-generated method stub
			int id = source.readInt();
			float l1Percents = source.readFloat();
			float l2Percents = source.readFloat();
			float l3Percents = source.readFloat();
			float l4Percents = source.readFloat();
			float l5Percents = source.readFloat();
			int l1Done = source.readInt();
			int l2Done = source.readInt();
			int l3Done = source.readInt();
			int l4Done = source.readInt();
			int l5Done = source.readInt();
			
			return new Statistics(id, l1Percents, l2Percents, l3Percents, l4Percents, l5Percents, l1Done, l2Done, l3Done, l4Done, l5Done);
		}

		@Override
		public Statistics[] newArray(int size) {
			// TODO Auto-generated method stub
			return new Statistics[size];
		}
		
	}
	
}
