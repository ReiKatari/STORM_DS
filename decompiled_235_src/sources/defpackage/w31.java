package defpackage;

import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.util.Size;
import androidx.preference.EditTextPreference;
import androidx.preference.Preference;
import com.stormds.emulator.R;
import java.io.File;
import java.util.LinkedHashMap;
import org.slf4j.ILoggerFactory;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: w31  reason: default package */
/* loaded from: classes.dex */
public class w31 implements z31, a15, ye4, ou6, i71, vr0, ILoggerFactory, x93, jy4, t35, eh6, k61 {
    public static w31 B;
    public final /* synthetic */ int A;

    public w31(pj pjVar) {
        this.A = 28;
    }

    public static final String l(da0 da0Var, da0[] da0VarArr, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        da0 da0Var2 = f65.b;
        int d = da0Var.d();
        int i5 = 0;
        while (i5 < d) {
            int i6 = (i5 + d) / 2;
            while (i6 > -1 && da0Var.i(i6) != 10) {
                i6--;
            }
            int i7 = i6 + 1;
            int i8 = 1;
            while (true) {
                i2 = i7 + i8;
                if (da0Var.i(i2) == 10) {
                    break;
                }
                i8++;
            }
            int i9 = i2 - i7;
            int i10 = i;
            boolean z2 = false;
            int i11 = 0;
            int i12 = 0;
            while (true) {
                if (z2) {
                    i3 = 46;
                    z = false;
                } else {
                    byte i13 = da0VarArr[i10].i(i11);
                    byte[] bArr = yy7.a;
                    int i14 = i13 & 255;
                    z = z2;
                    i3 = i14;
                }
                byte i15 = da0Var.i(i7 + i12);
                byte[] bArr2 = yy7.a;
                i4 = i3 - (i15 & 255);
                if (i4 != 0) {
                    break;
                }
                i12++;
                i11++;
                if (i12 == i9) {
                    break;
                } else if (da0VarArr[i10].d() == i11) {
                    if (i10 == da0VarArr.length - 1) {
                        break;
                    }
                    i10++;
                    i11 = -1;
                    z2 = true;
                } else {
                    z2 = z;
                }
            }
            if (i4 >= 0) {
                if (i4 <= 0) {
                    int i16 = i9 - i12;
                    int d2 = da0VarArr[i10].d() - i11;
                    int length = da0VarArr.length;
                    for (int i17 = i10 + 1; i17 < length; i17++) {
                        d2 += da0VarArr[i17].d();
                    }
                    if (d2 >= i16) {
                        if (d2 <= i16) {
                            return da0Var.o(i7, i9 + i7).n(qm0.a);
                        }
                    }
                }
                i5 = i2 + 1;
            }
            d = i6;
        }
        return null;
    }

    public static jv6 m(hv6 hv6Var, fv6 fv6Var, tr6 tr6Var) {
        hv6Var.getClass();
        fv6Var.getClass();
        tr6Var.getClass();
        return new jv6(hv6Var, fv6Var, tr6Var);
    }

    public static Typeface o(String str, oj2 oj2Var, int i) {
        Typeface create;
        Typeface create2;
        if (i == 0 && nb3.k(oj2Var, oj2.Y) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        boolean z = false;
        if (str == null) {
            create = Typeface.DEFAULT;
        } else {
            create = Typeface.create(str, 0);
        }
        int i2 = oj2Var.A;
        if (i == 1) {
            z = true;
        }
        create2 = Typeface.create(create, i2, z);
        return create2;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [k80, java.lang.Object] */
    public static lt4 p(String str) {
        str.getClass();
        da0 da0Var = f.a;
        ?? obj = new Object();
        obj.t0(str);
        return f.d(obj, false);
    }

    public static lt4 q(File file) {
        String str = lt4.B;
        String file2 = file.toString();
        file2.getClass();
        return p(file2);
    }

    public static boolean s(int i, boolean z) {
        int i2;
        if (z && 29 <= (i2 = Build.VERSION.SDK_INT) && i2 < 33) {
            if (i == 1 || i == 2 || i == 6) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001e, code lost:
        if (defpackage.sq1.a(10000000000L, r10) == (-1)) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0021, code lost:
        r2 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0031, code lost:
        if (defpackage.sq1.a(1800000000000L, r10) == (-1)) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:61:0x007a A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean t(int i, int i2, long j, boolean z, boolean z2, sq1 sq1Var) {
        long j2;
        long j3;
        boolean s = s(i, z2);
        if (s) {
            Log.d("CXCP", "shouldRetry: Active resume mode is activated");
        }
        if (!s) {
            j2 = 10000000000L;
            if (sq1Var != null) {
                j3 = sq1Var.a;
            }
        } else {
            j2 = 1800000000000L;
            if (sq1Var != null) {
                j3 = sq1Var.a;
            }
        }
        if (sq1.a(j, j2) <= 0) {
            if (i == 0) {
                if (i2 <= 1) {
                    return true;
                }
            } else if (i == 1) {
                if (Build.VERSION.SDK_INT >= 29 || i2 <= 1) {
                }
            } else {
                if (i != 2) {
                    if (i == 3) {
                        if (!z || i2 <= 1) {
                        }
                    } else if (i != 4 && i != 5 && i != 6 && i != 7) {
                        if (i == 8) {
                            if (i2 <= 1) {
                            }
                        } else if (i != 10) {
                            if (i == 11) {
                                if (i2 <= 1) {
                                }
                            } else {
                                Log.e("CXCP", "Unexpected CameraError: " + mp5.i);
                                return false;
                            }
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00d5, code lost:
        if (r4 <= (r6.getHeight() * r6.getWidth())) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static jv6 u(int i, Size size, dz dzVar, int i2, gv6 gv6Var, tr6 tr6Var) {
        LinkedHashMap linkedHashMap = dzVar.f;
        size.getClass();
        gv6Var.getClass();
        tr6Var.getClass();
        hv6 hv6Var = (hv6) jv6.h.get(Integer.valueOf(i));
        if (hv6Var == null) {
            hv6Var = hv6.PRIV;
        }
        fv6 fv6Var = fv6.NOT_SUPPORT;
        Size size2 = mj6.a;
        int height = size.getHeight() * size.getWidth();
        if (i2 == 1) {
            if (height <= mj6.a((Size) dzVar.b.get(Integer.valueOf(i)))) {
                fv6Var = fv6.S720P_16_9;
            } else if (height <= mj6.a((Size) dzVar.d.get(Integer.valueOf(i)))) {
                fv6Var = fv6.S1440P_4_3;
            }
        } else if (gv6Var == gv6.FEATURE_COMBINATION_TABLE) {
            Size size3 = (Size) linkedHashMap.get(Integer.valueOf(i));
            fv6[] fv6VarArr = jv6.f;
            int length = fv6VarArr.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    break;
                }
                fv6 fv6Var2 = fv6VarArr[i3];
                if (size.equals(fv6Var2.getRelatedFixedSize())) {
                    fv6Var = fv6Var2;
                    break;
                }
                i3++;
            }
            if (fv6Var == fv6.NOT_SUPPORT && size.equals(size3)) {
                fv6Var = fv6.MAXIMUM;
            }
        } else if (height <= mj6.a(dzVar.a)) {
            fv6Var = fv6.VGA;
        } else {
            Size size4 = dzVar.c;
            if (height <= size4.getHeight() * size4.getWidth()) {
                fv6Var = fv6.PREVIEW;
            } else {
                Size size5 = dzVar.e;
                if (height <= size5.getHeight() * size5.getWidth()) {
                    fv6Var = fv6.RECORD;
                } else {
                    Size size6 = (Size) linkedHashMap.get(Integer.valueOf(i));
                    Size size7 = (Size) dzVar.i.get(Integer.valueOf(i));
                    if (size6 != null) {
                    }
                    if (i2 != 2) {
                        fv6Var = fv6.MAXIMUM;
                    }
                    if (size7 != null) {
                        if (height <= size7.getHeight() * size7.getWidth()) {
                            fv6Var = fv6.ULTRA_MAXIMUM;
                        }
                    }
                }
            }
        }
        return m(hv6Var, fv6Var, tr6Var);
    }

    @Override // defpackage.ye4
    public boolean a() {
        return true;
    }

    @Override // defpackage.vr0
    public s83 b() {
        s83 s83Var = s83.L;
        return bl2.z(System.currentTimeMillis());
    }

    @Override // defpackage.z31
    public long c(long j, long j2) {
        float d = u24.d(j, j2);
        long floatToRawIntBits = (Float.floatToRawIntBits(d) << 32) | (Float.floatToRawIntBits(d) & 4294967295L);
        int i = a66.a;
        return floatToRawIntBits;
    }

    @Override // defpackage.eh6
    public le2 d(yt6 yt6Var) {
        return new g21(ch6.START, 4);
    }

    @Override // defpackage.jy4
    public Typeface e(int i, oj2 oj2Var) {
        return o(null, oj2Var, i);
    }

    @Override // defpackage.ou6
    public pu6 f(nu6 nu6Var) {
        return new bn2(nu6Var.a, nu6Var.b, nu6Var.c, nu6Var.d, nu6Var.e);
    }

    @Override // org.slf4j.ILoggerFactory
    public ry3 g(String str) {
        return mb4.A;
    }

    @Override // defpackage.a15
    public CharSequence i(Preference preference) {
        EditTextPreference editTextPreference = (EditTextPreference) preference;
        if (TextUtils.isEmpty(editTextPreference.Z)) {
            return editTextPreference.getContext().getString(R.string.not_set);
        }
        return editTextPreference.Z;
    }

    @Override // defpackage.jy4
    public Typeface k(sr2 sr2Var, oj2 oj2Var, int i) {
        return o(sr2Var.R, oj2Var, i);
    }

    public Signature[] r(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    public String toString() {
        switch (this.A) {
            case 25:
                return "SharingStarted.Eagerly";
            default:
                return super.toString();
        }
    }

    public /* synthetic */ w31(int i) {
        this.A = i;
    }

    @Override // defpackage.t35
    public void h() {
    }

    @Override // defpackage.ye4
    public void shutdown() {
    }

    @Override // defpackage.t35
    public void j(int i, Object obj) {
    }
}
