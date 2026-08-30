package wi;

import androidx.preference.Preference;
import java.util.ArrayList;
import java.util.Arrays;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final fj.e f14243a;

    /* renamed from: c  reason: collision with root package name */
    public boolean f14245c;

    /* renamed from: g  reason: collision with root package name */
    public int f14249g;

    /* renamed from: h  reason: collision with root package name */
    public int f14250h;

    /* renamed from: b  reason: collision with root package name */
    public int f14244b = Preference.DEFAULT_ORDER;

    /* renamed from: d  reason: collision with root package name */
    public int f14246d = 4096;

    /* renamed from: e  reason: collision with root package name */
    public e[] f14247e = new e[8];

    /* renamed from: f  reason: collision with root package name */
    public int f14248f = 7;

    public g(fj.e eVar) {
        this.f14243a = eVar;
    }

    public final void a(int i2) {
        int i10;
        if (i2 > 0) {
            int length = this.f14247e.length - 1;
            int i11 = 0;
            while (true) {
                i10 = this.f14248f;
                if (length < i10 || i2 <= 0) {
                    break;
                }
                e eVar = this.f14247e[length];
                eVar.getClass();
                i2 -= eVar.f14235c;
                int i12 = this.f14250h;
                e eVar2 = this.f14247e[length];
                eVar2.getClass();
                this.f14250h = i12 - eVar2.f14235c;
                this.f14249g--;
                i11++;
                length--;
            }
            e[] eVarArr = this.f14247e;
            int i13 = i10 + 1;
            System.arraycopy(eVarArr, i13, eVarArr, i13 + i11, this.f14249g);
            e[] eVarArr2 = this.f14247e;
            int i14 = this.f14248f + 1;
            Arrays.fill(eVarArr2, i14, i14 + i11, (Object) null);
            this.f14248f += i11;
        }
    }

    public final void b(e eVar) {
        int i2 = eVar.f14235c;
        int i10 = this.f14246d;
        if (i2 > i10) {
            e[] eVarArr = this.f14247e;
            zb.k.s(0, eVarArr.length, null, eVarArr);
            this.f14248f = this.f14247e.length - 1;
            this.f14249g = 0;
            this.f14250h = 0;
            return;
        }
        a((this.f14250h + i2) - i10);
        int i11 = this.f14249g + 1;
        e[] eVarArr2 = this.f14247e;
        if (i11 > eVarArr2.length) {
            e[] eVarArr3 = new e[eVarArr2.length * 2];
            System.arraycopy(eVarArr2, 0, eVarArr3, eVarArr2.length, eVarArr2.length);
            this.f14248f = this.f14247e.length - 1;
            this.f14247e = eVarArr3;
        }
        int i12 = this.f14248f;
        this.f14248f = i12 - 1;
        this.f14247e[i12] = eVar;
        this.f14249g++;
        this.f14250h += i2;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [fj.e, java.lang.Object] */
    public final void c(fj.h hVar) {
        hVar.getClass();
        int[] iArr = z.f14291a;
        int d4 = hVar.d();
        long j2 = 0;
        int i2 = 0;
        long j10 = 0;
        for (int i10 = 0; i10 < d4; i10++) {
            byte i11 = hVar.i(i10);
            byte[] bArr = qi.e.f12548a;
            j10 += z.f14292b[i11 & 255];
        }
        int i12 = (int) ((j10 + 7) >> 3);
        int d10 = hVar.d();
        fj.e eVar = this.f14243a;
        if (i12 < d10) {
            ?? obj = new Object();
            int[] iArr2 = z.f14291a;
            int d11 = hVar.d();
            byte b10 = 0;
            while (i2 < d11) {
                byte i13 = hVar.i(i2);
                byte[] bArr2 = qi.e.f12548a;
                int i14 = i13 & 255;
                int i15 = z.f14291a[i14];
                byte b11 = z.f14292b[i14];
                j2 = (j2 << b11) | i15;
                int i16 = b10 + b11;
                while (i16 >= 8) {
                    i16 = (i16 == 1 ? 1 : 0) - 8;
                    obj.e0((int) (j2 >> i16));
                }
                i2++;
                b10 = i16;
            }
            if (b10 > 0) {
                obj.e0((int) ((j2 << (8 - b10)) | (255 >>> b10)));
            }
            fj.h o5 = obj.o(obj.B);
            e(o5.d(), 127, 128);
            eVar.c0(o5);
            return;
        }
        e(hVar.d(), 127, 0);
        eVar.c0(hVar);
    }

    public final void d(ArrayList arrayList) {
        int i2;
        int i10;
        if (this.f14245c) {
            int i11 = this.f14244b;
            if (i11 < this.f14246d) {
                e(i11, 31, 32);
            }
            this.f14245c = false;
            this.f14244b = Preference.DEFAULT_ORDER;
            e(this.f14246d, 31, 32);
        }
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            e eVar = (e) arrayList.get(i12);
            fj.h q10 = eVar.f14233a.q();
            fj.h hVar = eVar.f14234b;
            Integer num = (Integer) h.f14252b.get(q10);
            if (num != null) {
                int intValue = num.intValue();
                i10 = intValue + 1;
                if (2 <= i10 && i10 < 8) {
                    e[] eVarArr = h.f14251a;
                    if (nc.k.a(eVarArr[intValue].f14234b, hVar)) {
                        i2 = i10;
                    } else if (nc.k.a(eVarArr[i10].f14234b, hVar)) {
                        i10 = intValue + 2;
                        i2 = i10;
                    }
                }
                i2 = i10;
                i10 = -1;
            } else {
                i2 = -1;
                i10 = -1;
            }
            if (i10 == -1) {
                int i13 = this.f14248f + 1;
                int length = this.f14247e.length;
                while (true) {
                    if (i13 >= length) {
                        break;
                    }
                    e eVar2 = this.f14247e[i13];
                    eVar2.getClass();
                    if (nc.k.a(eVar2.f14233a, q10)) {
                        e eVar3 = this.f14247e[i13];
                        eVar3.getClass();
                        if (nc.k.a(eVar3.f14234b, hVar)) {
                            i10 = h.f14251a.length + (i13 - this.f14248f);
                            break;
                        } else if (i2 == -1) {
                            i2 = (i13 - this.f14248f) + h.f14251a.length;
                        }
                    }
                    i13++;
                }
            }
            if (i10 != -1) {
                e(i10, 127, 128);
            } else if (i2 == -1) {
                this.f14243a.e0(64);
                c(q10);
                c(hVar);
                b(eVar);
            } else {
                fj.h hVar2 = e.f14227d;
                q10.getClass();
                hVar2.getClass();
                if (q10.l(0, hVar2, hVar2.d()) && !nc.k.a(e.f14232i, q10)) {
                    e(i2, 15, 0);
                    c(hVar);
                } else {
                    e(i2, 63, 64);
                    c(hVar);
                    b(eVar);
                }
            }
        }
    }

    public final void e(int i2, int i10, int i11) {
        fj.e eVar = this.f14243a;
        if (i2 < i10) {
            eVar.e0(i2 | i11);
            return;
        }
        eVar.e0(i11 | i10);
        int i12 = i2 - i10;
        while (i12 >= 128) {
            eVar.e0(128 | (i12 & 127));
            i12 >>>= 7;
        }
        eVar.e0(i12);
    }
}
