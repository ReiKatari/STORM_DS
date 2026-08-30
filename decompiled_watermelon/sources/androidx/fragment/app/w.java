package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public final class w implements Parcelable {
    public static final Parcelable.Creator<w> CREATOR = new x8(13);
    public final String A;
    public final String B;
    public final boolean L;
    public final boolean R;
    public final int X;
    public final int Y;
    public final String Z;
    public final boolean c0;
    public final boolean d0;
    public final boolean e0;
    public final boolean f0;
    public final int g0;
    public final String h0;
    public final int i0;
    public final boolean j0;

    public w(Parcel parcel) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        this.A = parcel.readString();
        this.B = parcel.readString();
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.L = z;
        if (parcel.readInt() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.R = z2;
        this.X = parcel.readInt();
        this.Y = parcel.readInt();
        this.Z = parcel.readString();
        if (parcel.readInt() != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.c0 = z3;
        if (parcel.readInt() != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.d0 = z4;
        if (parcel.readInt() != 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        this.e0 = z5;
        if (parcel.readInt() != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        this.f0 = z6;
        this.g0 = parcel.readInt();
        this.h0 = parcel.readString();
        this.i0 = parcel.readInt();
        this.j0 = parcel.readInt() != 0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.A);
        sb.append(" (");
        sb.append(this.B);
        sb.append(")}:");
        if (this.L) {
            sb.append(" fromLayout");
        }
        if (this.R) {
            sb.append(" dynamicContainer");
        }
        int i = this.Y;
        if (i != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(i));
        }
        String str = this.Z;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(str);
        }
        if (this.c0) {
            sb.append(" retainInstance");
        }
        if (this.d0) {
            sb.append(" removing");
        }
        if (this.e0) {
            sb.append(" detached");
        }
        if (this.f0) {
            sb.append(" hidden");
        }
        String str2 = this.h0;
        if (str2 != null) {
            sb.append(" targetWho=");
            sb.append(str2);
            sb.append(" targetRequestCode=");
            sb.append(this.i0);
        }
        if (this.j0) {
            sb.append(" userVisibleHint");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A);
        parcel.writeString(this.B);
        parcel.writeInt(this.L ? 1 : 0);
        parcel.writeInt(this.R ? 1 : 0);
        parcel.writeInt(this.X);
        parcel.writeInt(this.Y);
        parcel.writeString(this.Z);
        parcel.writeInt(this.c0 ? 1 : 0);
        parcel.writeInt(this.d0 ? 1 : 0);
        parcel.writeInt(this.e0 ? 1 : 0);
        parcel.writeInt(this.f0 ? 1 : 0);
        parcel.writeInt(this.g0);
        parcel.writeString(this.h0);
        parcel.writeInt(this.i0);
        parcel.writeInt(this.j0 ? 1 : 0);
    }

    public w(o oVar) {
        this.A = oVar.getClass().getName();
        this.B = oVar.mWho;
        this.L = oVar.mFromLayout;
        this.R = oVar.mInDynamicContainer;
        this.X = oVar.mFragmentId;
        this.Y = oVar.mContainerId;
        this.Z = oVar.mTag;
        this.c0 = oVar.mRetainInstance;
        this.d0 = oVar.mRemoving;
        this.e0 = oVar.mDetached;
        this.f0 = oVar.mHidden;
        this.g0 = oVar.mMaxState.ordinal();
        this.h0 = oVar.mTargetWho;
        this.i0 = oVar.mTargetRequestCode;
        this.j0 = oVar.mUserVisibleHint;
    }
}
