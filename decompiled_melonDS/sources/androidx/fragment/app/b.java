package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a8.l(1);
    public final int[] A;
    public final ArrayList B;
    public final int[] L;
    public final int[] R;
    public final int X;
    public final String Y;
    public final int Z;

    /* renamed from: b0  reason: collision with root package name */
    public final int f1249b0;

    /* renamed from: c0  reason: collision with root package name */
    public final CharSequence f1250c0;

    /* renamed from: d0  reason: collision with root package name */
    public final int f1251d0;

    /* renamed from: e0  reason: collision with root package name */
    public final CharSequence f1252e0;

    /* renamed from: f0  reason: collision with root package name */
    public final ArrayList f1253f0;

    /* renamed from: g0  reason: collision with root package name */
    public final ArrayList f1254g0;

    /* renamed from: h0  reason: collision with root package name */
    public final boolean f1255h0;

    public b(a aVar) {
        String str;
        int size = aVar.f1229c.size();
        this.A = new int[size * 6];
        if (aVar.f1235i) {
            this.B = new ArrayList(size);
            this.L = new int[size];
            this.R = new int[size];
            int i2 = 0;
            for (int i10 = 0; i10 < size; i10++) {
                r1 r1Var = (r1) aVar.f1229c.get(i10);
                int i11 = i2 + 1;
                this.A[i2] = r1Var.f1405a;
                ArrayList arrayList = this.B;
                j0 j0Var = r1Var.f1406b;
                if (j0Var != null) {
                    str = j0Var.mWho;
                } else {
                    str = null;
                }
                arrayList.add(str);
                int[] iArr = this.A;
                iArr[i11] = r1Var.f1407c ? 1 : 0;
                iArr[i2 + 2] = r1Var.f1408d;
                iArr[i2 + 3] = r1Var.f1409e;
                int i12 = i2 + 5;
                iArr[i2 + 4] = r1Var.f1410f;
                i2 += 6;
                iArr[i12] = r1Var.f1411g;
                this.L[i10] = r1Var.f1412h.ordinal();
                this.R[i10] = r1Var.f1413i.ordinal();
            }
            this.X = aVar.f1234h;
            this.Y = aVar.f1237k;
            this.Z = aVar.f1247v;
            this.f1249b0 = aVar.f1238l;
            this.f1250c0 = aVar.m;
            this.f1251d0 = aVar.f1239n;
            this.f1252e0 = aVar.f1240o;
            this.f1253f0 = aVar.f1241p;
            this.f1254g0 = aVar.f1242q;
            this.f1255h0 = aVar.f1243r;
            return;
        }
        a0.j.p("Not on back stack");
        throw null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeIntArray(this.A);
        parcel.writeStringList(this.B);
        parcel.writeIntArray(this.L);
        parcel.writeIntArray(this.R);
        parcel.writeInt(this.X);
        parcel.writeString(this.Y);
        parcel.writeInt(this.Z);
        parcel.writeInt(this.f1249b0);
        TextUtils.writeToParcel(this.f1250c0, parcel, 0);
        parcel.writeInt(this.f1251d0);
        TextUtils.writeToParcel(this.f1252e0, parcel, 0);
        parcel.writeStringList(this.f1253f0);
        parcel.writeStringList(this.f1254g0);
        parcel.writeInt(this.f1255h0 ? 1 : 0);
    }

    public b(Parcel parcel) {
        this.A = parcel.createIntArray();
        this.B = parcel.createStringArrayList();
        this.L = parcel.createIntArray();
        this.R = parcel.createIntArray();
        this.X = parcel.readInt();
        this.Y = parcel.readString();
        this.Z = parcel.readInt();
        this.f1249b0 = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.f1250c0 = (CharSequence) creator.createFromParcel(parcel);
        this.f1251d0 = parcel.readInt();
        this.f1252e0 = (CharSequence) creator.createFromParcel(parcel);
        this.f1253f0 = parcel.createStringArrayList();
        this.f1254g0 = parcel.createStringArrayList();
        this.f1255h0 = parcel.readInt() != 0;
    }
}
