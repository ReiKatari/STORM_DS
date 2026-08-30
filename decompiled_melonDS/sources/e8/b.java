package e8;

import a1.e;
import a1.w0;
import android.os.Parcel;
import android.util.SparseIntArray;
import w.d;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b extends a {

    /* renamed from: d  reason: collision with root package name */
    public final SparseIntArray f4406d;

    /* renamed from: e  reason: collision with root package name */
    public final Parcel f4407e;

    /* renamed from: f  reason: collision with root package name */
    public final int f4408f;

    /* renamed from: g  reason: collision with root package name */
    public final int f4409g;

    /* renamed from: h  reason: collision with root package name */
    public final String f4410h;

    /* renamed from: i  reason: collision with root package name */
    public int f4411i;

    /* renamed from: j  reason: collision with root package name */
    public int f4412j;

    /* renamed from: k  reason: collision with root package name */
    public int f4413k;

    /* JADX WARN: Type inference failed for: r5v0, types: [a1.w0, a1.e] */
    /* JADX WARN: Type inference failed for: r6v0, types: [a1.w0, a1.e] */
    /* JADX WARN: Type inference failed for: r7v0, types: [a1.w0, a1.e] */
    public b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new w0(0), new w0(0), new w0(0));
    }

    @Override // e8.a
    public final b a() {
        Parcel parcel = this.f4407e;
        int dataPosition = parcel.dataPosition();
        int i2 = this.f4412j;
        if (i2 == this.f4408f) {
            i2 = this.f4409g;
        }
        return new b(parcel, dataPosition, i2, d.s(new StringBuilder(), this.f4410h, "  "), this.f4403a, this.f4404b, this.f4405c);
    }

    @Override // e8.a
    public final boolean e(int i2) {
        while (true) {
            int i10 = this.f4412j;
            int i11 = this.f4413k;
            if (i10 < this.f4409g) {
                if (i11 != i2) {
                    if (String.valueOf(i11).compareTo(String.valueOf(i2)) <= 0) {
                        int i12 = this.f4412j;
                        Parcel parcel = this.f4407e;
                        parcel.setDataPosition(i12);
                        int readInt = parcel.readInt();
                        this.f4413k = parcel.readInt();
                        this.f4412j += readInt;
                    } else {
                        return false;
                    }
                } else {
                    return true;
                }
            } else if (i11 == i2) {
                return true;
            } else {
                return false;
            }
        }
    }

    @Override // e8.a
    public final void h(int i2) {
        int i10 = this.f4411i;
        SparseIntArray sparseIntArray = this.f4406d;
        Parcel parcel = this.f4407e;
        if (i10 >= 0) {
            int i11 = sparseIntArray.get(i10);
            int dataPosition = parcel.dataPosition();
            parcel.setDataPosition(i11);
            parcel.writeInt(dataPosition - i11);
            parcel.setDataPosition(dataPosition);
        }
        this.f4411i = i2;
        sparseIntArray.put(i2, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i2);
    }

    public b(Parcel parcel, int i2, int i10, String str, e eVar, e eVar2, e eVar3) {
        super(eVar, eVar2, eVar3);
        this.f4406d = new SparseIntArray();
        this.f4411i = -1;
        this.f4413k = -1;
        this.f4407e = parcel;
        this.f4408f = i2;
        this.f4409g = i10;
        this.f4412j = i2;
        this.f4410h = str;
    }
}
