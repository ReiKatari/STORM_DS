package na;

import android.graphics.Path;
import android.text.TextUtils;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import j0.w1;
import java.time.Instant;
import java.util.List;
import me.magnum.melonds.R;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class f implements a6.z, w6.b, androidx.preference.r, f0.b, f6.f, h7.d, wc.a {
    public static f A;

    public /* synthetic */ f(Object obj) {
    }

    public static final String b(fj.h hVar, fj.h[] hVarArr, int i2) {
        int i10;
        boolean z10;
        int i11;
        int i12;
        fj.h hVar2 = cj.a.f2898b;
        int d4 = hVar.d();
        int i13 = 0;
        while (i13 < d4) {
            int i14 = (i13 + d4) / 2;
            while (i14 > -1 && hVar.i(i14) != 10) {
                i14--;
            }
            int i15 = i14 + 1;
            int i16 = 1;
            while (true) {
                i10 = i15 + i16;
                if (hVar.i(i10) == 10) {
                    break;
                }
                i16++;
            }
            int i17 = i10 - i15;
            int i18 = i2;
            boolean z11 = false;
            int i19 = 0;
            int i20 = 0;
            while (true) {
                if (z11) {
                    i11 = 46;
                    z10 = false;
                } else {
                    byte i21 = hVarArr[i18].i(i19);
                    byte[] bArr = qi.e.f12548a;
                    int i22 = i21 & 255;
                    z10 = z11;
                    i11 = i22;
                }
                byte i23 = hVar.i(i15 + i20);
                byte[] bArr2 = qi.e.f12548a;
                i12 = i11 - (i23 & 255);
                if (i12 != 0) {
                    break;
                }
                i20++;
                i19++;
                if (i20 == i17) {
                    break;
                } else if (hVarArr[i18].d() == i19) {
                    if (i18 == hVarArr.length - 1) {
                        break;
                    }
                    i18++;
                    i19 = -1;
                    z11 = true;
                } else {
                    z11 = z10;
                }
            }
            if (i12 >= 0) {
                if (i12 <= 0) {
                    int i24 = i17 - i20;
                    int d10 = hVarArr[i18].d() - i19;
                    int length = hVarArr.length;
                    for (int i25 = i18 + 1; i25 < length; i25++) {
                        d10 += hVarArr[i25].d();
                    }
                    if (d10 >= i24) {
                        if (d10 <= i24) {
                            return hVar.o(i15, i17 + i15).n(vc.a.f13781a);
                        }
                    }
                }
                i13 = i10 + 1;
            }
            d4 = i14;
        }
        return null;
    }

    public static final boolean e(fj.x xVar) {
        fj.x xVar2 = gj.h.X;
        fj.h hVar = xVar.A;
        int k10 = fj.h.k(hVar, gj.c.f5684a);
        if (k10 == -1) {
            k10 = fj.h.k(xVar.A, gj.c.f5685b);
        }
        if (k10 != -1) {
            hVar = fj.h.p(hVar, k10 + 1, 0, 2);
        } else if (xVar.e() != null && hVar.d() == 2) {
            hVar = fj.h.R;
        }
        return !vc.o.O(hVar.r(), ".class", true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x007a, code lost:
        r6 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static fj.h f(java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: na.f.f(java.lang.String):fj.h");
    }

    public static fj.h g(String str) {
        if (str.length() % 2 == 0) {
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i2 = 0; i2 < length; i2++) {
                int i10 = i2 * 2;
                bArr[i2] = (byte) (gj.b.a(str.charAt(i10 + 1)) + (gj.b.a(str.charAt(i10)) << 4));
            }
            return new fj.h(bArr);
        }
        a0.j.e("Unexpected hex string: ".concat(str));
        return null;
    }

    public static fj.h h(String str) {
        str.getClass();
        byte[] bytes = str.getBytes(vc.a.f13781a);
        bytes.getClass();
        fj.h hVar = new fj.h(bytes);
        hVar.L = str;
        return hVar;
    }

    public static Path i(float f8, float f10, float f11, float f12) {
        Path path = new Path();
        path.moveTo(f8, f10);
        path.lineTo(f11, f12);
        return path;
    }

    public static fj.h j(byte[] bArr) {
        fj.h hVar = fj.h.R;
        int length = bArr.length;
        d0.d.K(bArr.length, 0, length);
        return new fj.h(zb.k.m(bArr, 0, length));
    }

    public static i3.d0 l(List list, float f8, float f10, int i2) {
        float f11;
        float f12;
        if ((i2 & 2) != 0) {
            f11 = 0.0f;
        } else {
            f11 = f8;
        }
        if ((i2 & 4) != 0) {
            f12 = Float.POSITIVE_INFINITY;
        } else {
            f12 = f10;
        }
        return new i3.d0(list, (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(f11) & 4294967295L), (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(f12) & 4294967295L));
    }

    @Override // f0.b
    public boolean a(w1 w1Var) {
        return false;
    }

    @Override // androidx.preference.r
    public CharSequence c(Preference preference) {
        CharSequence charSequence;
        ListPreference listPreference = (ListPreference) preference;
        CharSequence[] charSequenceArr = listPreference.Z;
        int e6 = listPreference.e(listPreference.f1518c0);
        if (e6 >= 0 && charSequenceArr != null) {
            charSequence = charSequenceArr[e6];
        } else {
            charSequence = null;
        }
        if (TextUtils.isEmpty(charSequence)) {
            return listPreference.getContext().getString(R.string.not_set);
        }
        int e10 = listPreference.e(listPreference.f1518c0);
        if (e10 < 0 || charSequenceArr == null) {
            return null;
        }
        return charSequenceArr[e10];
    }

    @Override // wc.a
    public wc.g d() {
        Instant now;
        long epochSecond;
        int nano;
        now = Instant.now();
        now.getClass();
        wc.g gVar = wc.g.L;
        epochSecond = now.getEpochSecond();
        nano = now.getNano();
        return wc.j.f(nano, epochSecond);
    }

    @Override // h7.d
    public void k() {
    }

    @Override // h7.d
    public void m(int i2, Object obj) {
    }

    @Override // a6.z
    public void onScrollLimit(int i2, int i10, int i11, boolean z10) {
    }

    @Override // a6.z
    public void onScrollProgress(int i2, int i10, int i11, int i12) {
    }
}
