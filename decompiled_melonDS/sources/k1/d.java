package k1;

import android.content.ClipData;
import android.os.Parcel;
import android.text.Annotation;
import android.text.SpannableString;
import android.util.Base64;
import b4.l1;
import i3.m0;
import i3.s;
import java.util.List;
import l4.f;
import l4.h;
import l4.j0;
import p4.i;
import p4.j;
import w4.l;
import w4.o;
import w4.p;
import zb.q;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a  reason: collision with root package name */
    public static final StackTraceElement[] f7953a = new StackTraceElement[0];

    /* JADX WARN: Type inference failed for: r0v4, types: [k1.a, java.lang.Object] */
    public static final l1 a(h hVar) {
        List list;
        SpannableString spannableString;
        byte b10;
        List list2 = hVar.L;
        List list3 = q.A;
        if (list2 == null) {
            list = list3;
        } else {
            list = list2;
        }
        String str = hVar.B;
        if (!list.isEmpty()) {
            SpannableString spannableString2 = new SpannableString(str);
            ?? obj = new Object();
            obj.f7952a = Parcel.obtain();
            if (list2 == null) {
                list2 = list3;
            }
            int size = list2.size();
            int i2 = 0;
            while (i2 < size) {
                f fVar = (f) list2.get(i2);
                j0 j0Var = (j0) fVar.f8790a;
                int i10 = fVar.f8791b;
                int i11 = fVar.f8792c;
                obj.f7952a.recycle();
                obj.f7952a = Parcel.obtain();
                o oVar = j0Var.f8827a;
                long j2 = j0Var.f8838l;
                long j10 = j0Var.f8834h;
                int i12 = i2;
                long j11 = j0Var.f8828b;
                List list4 = list2;
                int i13 = size;
                long b11 = oVar.b();
                long j12 = s.f6687h;
                if (!s.c(b11, j12)) {
                    obj.c((byte) 1);
                    spannableString = spannableString2;
                    obj.f7952a.writeLong(j0Var.f8827a.b());
                } else {
                    spannableString = spannableString2;
                }
                long j13 = x4.o.f14349c;
                byte b12 = 2;
                if (!x4.o.a(j11, j13)) {
                    obj.c((byte) 2);
                    obj.e(j11);
                }
                j jVar = j0Var.f8829c;
                if (jVar != null) {
                    obj.c((byte) 3);
                    obj.f7952a.writeInt(jVar.A);
                }
                p4.h hVar2 = j0Var.f8830d;
                if (hVar2 != null) {
                    int i14 = hVar2.f11311a;
                    obj.c((byte) 4);
                    if (i14 == 0 || i14 != 1) {
                        b10 = 0;
                    } else {
                        b10 = 1;
                    }
                    obj.c(b10);
                }
                i iVar = j0Var.f8831e;
                if (iVar != null) {
                    int i15 = iVar.f11312a;
                    obj.c((byte) 5);
                    if (i15 != 0) {
                        if (i15 == 65535) {
                            b12 = 1;
                        } else if (i15 != 1) {
                            if (i15 == 2) {
                                b12 = 3;
                            }
                        }
                        obj.c(b12);
                    }
                    b12 = 0;
                    obj.c(b12);
                }
                String str2 = j0Var.f8833g;
                if (str2 != null) {
                    obj.c((byte) 6);
                    obj.f7952a.writeString(str2);
                }
                if (!x4.o.a(j10, j13)) {
                    obj.c((byte) 7);
                    obj.e(j10);
                }
                w4.a aVar = j0Var.f8835i;
                if (aVar != null) {
                    float f8 = aVar.f14125a;
                    obj.c((byte) 8);
                    obj.d(f8);
                }
                p pVar = j0Var.f8836j;
                if (pVar != null) {
                    obj.c((byte) 9);
                    obj.d(pVar.f14150a);
                    obj.d(pVar.f14151b);
                }
                if (!s.c(j2, j12)) {
                    obj.c((byte) 10);
                    obj.f7952a.writeLong(j2);
                }
                l lVar = j0Var.m;
                if (lVar != null) {
                    obj.c((byte) 11);
                    obj.f7952a.writeInt(lVar.f14146a);
                }
                m0 m0Var = j0Var.f8839n;
                if (m0Var != null) {
                    obj.c((byte) 12);
                    obj.f7952a.writeLong(m0Var.f6660a);
                    long j14 = m0Var.f6661b;
                    obj.d(Float.intBitsToFloat((int) (j14 >> 32)));
                    obj.d(Float.intBitsToFloat((int) (j14 & 4294967295L)));
                    obj.d(m0Var.f6662c);
                }
                SpannableString spannableString3 = spannableString;
                spannableString3.setSpan(new Annotation("androidx.compose.text.SpanStyle", Base64.encodeToString(obj.f7952a.marshall(), 0)), i10, i11, 33);
                i2 = i12 + 1;
                spannableString2 = spannableString3;
                list2 = list4;
                size = i13;
            }
            str = spannableString2;
        }
        return new l1(ClipData.newPlainText("plain text", str));
    }
}
