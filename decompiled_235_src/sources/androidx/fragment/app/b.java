package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new y8(2);
    public final int[] A;
    public final ArrayList B;
    public final int[] L;
    public final int[] R;
    public final int X;
    public final String Y;
    public final int Z;
    public final int d0;
    public final CharSequence e0;
    public final int f0;
    public final CharSequence g0;
    public final ArrayList h0;
    public final ArrayList i0;
    public final boolean j0;

    public b(a aVar) {
        String str;
        int size = aVar.c.size();
        this.A = new int[size * 6];
        if (aVar.i) {
            this.B = new ArrayList(size);
            this.L = new int[size];
            this.R = new int[size];
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                ul2 ul2Var = (ul2) aVar.c.get(i2);
                int i3 = i + 1;
                this.A[i] = ul2Var.a;
                ArrayList arrayList = this.B;
                o oVar = ul2Var.b;
                if (oVar != null) {
                    str = oVar.mWho;
                } else {
                    str = null;
                }
                arrayList.add(str);
                int[] iArr = this.A;
                iArr[i3] = ul2Var.c ? 1 : 0;
                iArr[i + 2] = ul2Var.d;
                iArr[i + 3] = ul2Var.e;
                int i4 = i + 5;
                iArr[i + 4] = ul2Var.f;
                i += 6;
                iArr[i4] = ul2Var.g;
                this.L[i2] = ul2Var.h.ordinal();
                this.R[i2] = ul2Var.i.ordinal();
            }
            this.X = aVar.h;
            this.Y = aVar.k;
            this.Z = aVar.v;
            this.d0 = aVar.l;
            this.e0 = aVar.m;
            this.f0 = aVar.n;
            this.g0 = aVar.o;
            this.h0 = aVar.p;
            this.i0 = aVar.q;
            this.j0 = aVar.r;
            return;
        }
        defpackage.i.m("Not on back stack");
        throw null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.A);
        parcel.writeStringList(this.B);
        parcel.writeIntArray(this.L);
        parcel.writeIntArray(this.R);
        parcel.writeInt(this.X);
        parcel.writeString(this.Y);
        parcel.writeInt(this.Z);
        parcel.writeInt(this.d0);
        TextUtils.writeToParcel(this.e0, parcel, 0);
        parcel.writeInt(this.f0);
        TextUtils.writeToParcel(this.g0, parcel, 0);
        parcel.writeStringList(this.h0);
        parcel.writeStringList(this.i0);
        parcel.writeInt(this.j0 ? 1 : 0);
    }

    public b(Parcel parcel) {
        this.A = parcel.createIntArray();
        this.B = parcel.createStringArrayList();
        this.L = parcel.createIntArray();
        this.R = parcel.createIntArray();
        this.X = parcel.readInt();
        this.Y = parcel.readString();
        this.Z = parcel.readInt();
        this.d0 = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.e0 = (CharSequence) creator.createFromParcel(parcel);
        this.f0 = parcel.readInt();
        this.g0 = (CharSequence) creator.createFromParcel(parcel);
        this.h0 = parcel.createStringArrayList();
        this.i0 = parcel.createStringArrayList();
        this.j0 = parcel.readInt() != 0;
    }
}
