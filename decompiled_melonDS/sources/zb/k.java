package zb;

import android.content.Context;
import android.database.SQLException;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import androidx.lifecycle.y0;
import java.io.File;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import l4.q0;
import pi.c0;
import pi.d0;
import pi.g0;
import q4.x;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a */
    public static final /* synthetic */ int f15006a = 0;

    /* renamed from: b */
    public static final /* synthetic */ int f15007b = 0;

    /* renamed from: c */
    public static final /* synthetic */ int f15008c = 0;

    /* renamed from: d */
    public static final /* synthetic */ int f15009d = 0;

    public static int A(Object[] objArr, Object obj) {
        objArr.getClass();
        int i2 = 0;
        if (obj == null) {
            int length = objArr.length;
            while (i2 < length) {
                if (objArr[i2] == null) {
                    return i2;
                }
                i2++;
            }
            return -1;
        }
        int length2 = objArr.length;
        while (i2 < length2) {
            if (obj.equals(objArr[i2])) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public static final boolean B(String str) {
        str.getClass();
        if (!str.equals("POST") && !str.equals("PATCH") && !str.equals("PUT") && !str.equals("DELETE") && !str.equals("MOVE")) {
            return false;
        }
        return true;
    }

    public static boolean C(String str) {
        if (!"Connection".equalsIgnoreCase(str) && !"Keep-Alive".equalsIgnoreCase(str) && !"Proxy-Authenticate".equalsIgnoreCase(str) && !"Proxy-Authorization".equalsIgnoreCase(str) && !"TE".equalsIgnoreCase(str) && !"Trailers".equalsIgnoreCase(str) && !"Transfer-Encoding".equalsIgnoreCase(str) && !"Upgrade".equalsIgnoreCase(str)) {
            return true;
        }
        return false;
    }

    public static final void D(Context context) {
        Map map;
        String str;
        context.getClass();
        File databasePath = context.getDatabasePath("androidx.work.workdb");
        databasePath.getClass();
        if (databasePath.exists()) {
            p8.v.e().a(q8.n.f12367a, "Migrating WorkDatabase to the no-backup directory");
            File databasePath2 = context.getDatabasePath("androidx.work.workdb");
            databasePath2.getClass();
            File noBackupFilesDir = context.getNoBackupFilesDir();
            noBackupFilesDir.getClass();
            String[] strArr = q8.n.f12368b;
            int E = v.E(strArr.length);
            if (E < 16) {
                E = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(E);
            for (String str2 : strArr) {
                linkedHashMap.put(new File(databasePath2.getPath() + str2), new File(noBackupFilesDir.getPath() + str2));
            }
            if (linkedHashMap.isEmpty()) {
                map = Collections.singletonMap(databasePath2, noBackupFilesDir);
                map.getClass();
            } else {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
                linkedHashMap2.put(databasePath2, noBackupFilesDir);
                map = linkedHashMap2;
            }
            for (Map.Entry entry : map.entrySet()) {
                File file = (File) entry.getKey();
                File file2 = (File) entry.getValue();
                if (file.exists()) {
                    if (file2.exists()) {
                        p8.v.e().h(q8.n.f12367a, "Over-writing contents of " + file2);
                    }
                    if (file.renameTo(file2)) {
                        str = "Migrated " + file + "to " + file2;
                    } else {
                        str = "Renaming " + file + " to " + file2 + " failed";
                    }
                    p8.v.e().a(q8.n.f12367a, str);
                }
            }
        }
    }

    public static void E(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        if (inputConnection != null && editorInfo.hintText == null) {
            for (ViewParent parent = textView.getParent(); parent instanceof View; parent = parent.getParent()) {
            }
        }
    }

    public static final boolean F(String str) {
        str.getClass();
        if (!str.equals("GET") && !str.equals("HEAD")) {
            return true;
        }
        return false;
    }

    public static final void G(float[] fArr, float[] fArr2, int i2, float[] fArr3) {
        float q10;
        if (i2 == 0) {
            x3.a.a("At least one point must be provided");
        }
        int i10 = 2 >= i2 ? i2 - 1 : 2;
        int i11 = i10 + 1;
        float[][] fArr4 = new float[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            fArr4[i12] = new float[i2];
        }
        for (int i13 = 0; i13 < i2; i13++) {
            fArr4[0][i13] = 1.0f;
            for (int i14 = 1; i14 < i11; i14++) {
                fArr4[i14][i13] = fArr4[i14 - 1][i13] * fArr[i13];
            }
        }
        float[][] fArr5 = new float[i11];
        for (int i15 = 0; i15 < i11; i15++) {
            fArr5[i15] = new float[i2];
        }
        float[][] fArr6 = new float[i11];
        for (int i16 = 0; i16 < i11; i16++) {
            fArr6[i16] = new float[i11];
        }
        for (int i17 = 0; i17 < i11; i17++) {
            float[] fArr7 = fArr5[i17];
            float[] fArr8 = fArr4[i17];
            fArr8.getClass();
            fArr7.getClass();
            System.arraycopy(fArr8, 0, fArr7, 0, i2);
            for (int i18 = 0; i18 < i17; i18++) {
                float[] fArr9 = fArr5[i18];
                float q11 = q(fArr7, fArr9);
                for (int i19 = 0; i19 < i2; i19++) {
                    fArr7[i19] = fArr7[i19] - (fArr9[i19] * q11);
                }
            }
            float sqrt = (float) Math.sqrt(q(fArr7, fArr7));
            if (sqrt < 1.0E-6f) {
                sqrt = 1.0E-6f;
            }
            float f8 = 1.0f / sqrt;
            for (int i20 = 0; i20 < i2; i20++) {
                fArr7[i20] = fArr7[i20] * f8;
            }
            float[] fArr10 = fArr6[i17];
            for (int i21 = 0; i21 < i11; i21++) {
                if (i21 < i17) {
                    q10 = 0.0f;
                } else {
                    q10 = q(fArr7, fArr4[i21]);
                }
                fArr10[i21] = q10;
            }
        }
        for (int i22 = i10; -1 < i22; i22--) {
            float q12 = q(fArr5[i22], fArr2);
            float[] fArr11 = fArr6[i22];
            int i23 = i22 + 1;
            if (i23 <= i10) {
                int i24 = i10;
                while (true) {
                    q12 -= fArr11[i24] * fArr3[i24];
                    if (i24 != i23) {
                        i24--;
                    }
                }
            }
            fArr3[i22] = q12 / fArr11[i22];
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:181:0x01e0, code lost:
        r0 = p7.j.d(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x01e4, code lost:
        q8.r.q(r2, null);
        r10 = r0;
     */
    /* JADX WARN: Finally extract failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static p7.s H(t7.a r31, java.lang.String r32) {
        /*
            Method dump skipped, instructions count: 522
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zb.k.H(t7.a, java.lang.String):p7.s");
    }

    public static final long I(long j2) {
        int round = Math.round(Float.intBitsToFloat((int) (j2 >> 32)));
        return (Math.round(Float.intBitsToFloat((int) (j2 & 4294967295L))) & 4294967295L) | (round << 32);
    }

    public static char J(char[] cArr) {
        int length = cArr.length;
        if (length != 0) {
            if (length == 1) {
                return cArr[0];
            }
            a0.j.h("Array has more than one element.");
            return (char) 0;
        }
        m9.o.x("Array is empty.");
        return (char) 0;
    }

    public static final d0 K(d0 d0Var) {
        d0Var.getClass();
        c0 i2 = d0Var.i();
        g0 g0Var = d0Var.Z;
        i2.f11681g = new qi.c(g0Var.i(), g0Var.d());
        return i2.a();
    }

    public static final void L(int i2, String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Error code: " + i2);
        sb2.append(", message: ".concat(str));
        throw new SQLException(sb2.toString());
    }

    public static final ExtractedText M(x xVar) {
        ExtractedText extractedText = new ExtractedText();
        String str = xVar.f12276a.B;
        extractedText.text = str;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = str.length();
        extractedText.partialStartOffset = -1;
        long j2 = xVar.f12277b;
        extractedText.selectionStart = q0.f(j2);
        extractedText.selectionEnd = q0.e(j2);
        extractedText.flags = !vc.h.Z(xVar.f12276a.B, '\n') ? 1 : 0;
        return extractedText;
    }

    public static List N(double[] dArr) {
        dArr.getClass();
        int length = dArr.length;
        if (length != 0) {
            if (length != 1) {
                ArrayList arrayList = new ArrayList(dArr.length);
                for (double d4 : dArr) {
                    arrayList.add(Double.valueOf(d4));
                }
                return arrayList;
            }
            return p7.t.x(Double.valueOf(dArr[0]));
        }
        return q.A;
    }

    public static List O(float[] fArr) {
        fArr.getClass();
        int length = fArr.length;
        if (length != 0) {
            if (length != 1) {
                ArrayList arrayList = new ArrayList(fArr.length);
                for (float f8 : fArr) {
                    arrayList.add(Float.valueOf(f8));
                }
                return arrayList;
            }
            return p7.t.x(Float.valueOf(fArr[0]));
        }
        return q.A;
    }

    public static List P(long[] jArr) {
        jArr.getClass();
        int length = jArr.length;
        if (length != 0) {
            if (length != 1) {
                ArrayList arrayList = new ArrayList(jArr.length);
                for (long j2 : jArr) {
                    arrayList.add(Long.valueOf(j2));
                }
                return arrayList;
            }
            return p7.t.x(Long.valueOf(jArr[0]));
        }
        return q.A;
    }

    public static List Q(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        if (length != 0) {
            if (length != 1) {
                return new ArrayList(new i(objArr, false));
            }
            return p7.t.x(objArr[0]);
        }
        return q.A;
    }

    public static List R(boolean[] zArr) {
        zArr.getClass();
        int length = zArr.length;
        if (length != 0) {
            if (length != 1) {
                ArrayList arrayList = new ArrayList(zArr.length);
                for (boolean z10 : zArr) {
                    arrayList.add(Boolean.valueOf(z10));
                }
                return arrayList;
            }
            return p7.t.x(Boolean.valueOf(zArr[0]));
        }
        return q.A;
    }

    public static Set S(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        if (length != 0) {
            if (length != 1) {
                LinkedHashSet linkedHashSet = new LinkedHashSet(v.E(objArr.length));
                for (Object obj : objArr) {
                    linkedHashSet.add(obj);
                }
                return linkedHashSet;
            }
            return p7.j.E(objArr[0]);
        }
        return s.A;
    }

    public static final long T(long j2) {
        return (Float.floatToRawIntBits((int) (j2 & 4294967295L)) & 4294967295L) | (Float.floatToRawIntBits((int) (j2 >> 32)) << 32);
    }

    public static final void a(rd.k kVar, v3.t tVar, long j2) {
        v0.h hVar = (v0.h) kVar.B;
        hVar.getClass();
        w3.d dVar = (w3.d) hVar.L;
        w3.d dVar2 = (w3.d) hVar.B;
        boolean b10 = v3.s.b(tVar);
        long j10 = tVar.f13692b;
        if (b10) {
            u(dVar2.f14120d, null);
            dVar2.f14121e = 0;
            u(dVar.f14120d, null);
            dVar.f14121e = 0;
            hVar.A = 0L;
        }
        if (!v3.s.d(tVar)) {
            List list = tVar.f13701k;
            if (list == null) {
                list = q.A;
            }
            int i2 = 0;
            for (int size = list.size(); i2 < size; size = size) {
                v3.c cVar = (v3.c) list.get(i2);
                hVar.d(cVar.f13634a, h3.b.e(cVar.f13636c, j2));
                i2++;
            }
            hVar.d(j10, h3.b.e(tVar.f13702l, j2));
        }
        if (v3.s.d(tVar) && j10 - hVar.A > 40) {
            u(dVar2.f14120d, null);
            dVar2.f14121e = 0;
            u(dVar.f14120d, null);
            dVar.f14121e = 0;
            hVar.A = 0L;
        }
        hVar.A = j10;
    }

    public static final Bundle b(yb.j... jVarArr) {
        Bundle bundle = new Bundle(jVarArr.length);
        for (yb.j jVar : jVarArr) {
            String str = (String) jVar.A;
            Object obj = jVar.B;
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Byte) {
                bundle.putByte(str, ((Number) obj).byteValue());
            } else if (obj instanceof Character) {
                bundle.putChar(str, ((Character) obj).charValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Number) obj).doubleValue());
            } else if (obj instanceof Float) {
                bundle.putFloat(str, ((Number) obj).floatValue());
            } else if (obj instanceof Integer) {
                bundle.putInt(str, ((Number) obj).intValue());
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Number) obj).longValue());
            } else if (obj instanceof Short) {
                bundle.putShort(str, ((Number) obj).shortValue());
            } else if (obj instanceof Bundle) {
                bundle.putBundle(str, (Bundle) obj);
            } else if (obj instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) obj);
            } else if (obj instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) obj);
            } else if (obj instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) obj);
            } else if (obj instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) obj);
            } else if (obj instanceof char[]) {
                bundle.putCharArray(str, (char[]) obj);
            } else if (obj instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) obj);
            } else if (obj instanceof float[]) {
                bundle.putFloatArray(str, (float[]) obj);
            } else if (obj instanceof int[]) {
                bundle.putIntArray(str, (int[]) obj);
            } else if (obj instanceof long[]) {
                bundle.putLongArray(str, (long[]) obj);
            } else if (obj instanceof short[]) {
                bundle.putShortArray(str, (short[]) obj);
            } else if (obj instanceof Object[]) {
                Class<?> componentType = obj.getClass().getComponentType();
                componentType.getClass();
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    bundle.putParcelableArray(str, (Parcelable[]) obj);
                } else if (String.class.isAssignableFrom(componentType)) {
                    bundle.putStringArray(str, (String[]) obj);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    bundle.putCharSequenceArray(str, (CharSequence[]) obj);
                } else if (Serializable.class.isAssignableFrom(componentType)) {
                    bundle.putSerializable(str, (Serializable) obj);
                } else {
                    m9.o.t("Illegal value array type ", componentType.getCanonicalName(), " for key \"", str, 34);
                    return null;
                }
            } else if (obj instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) obj);
            } else if (obj instanceof IBinder) {
                bundle.putBinder(str, (IBinder) obj);
            } else if (obj instanceof Size) {
                bundle.putSize(str, (Size) obj);
            } else if (obj instanceof SizeF) {
                bundle.putSizeF(str, (SizeF) obj);
            } else {
                m9.o.t("Illegal value type ", obj.getClass().getCanonicalName(), " for key \"", str, 34);
                return null;
            }
        }
        return bundle;
    }

    public static boolean c(int[] iArr, int i2) {
        int length = iArr.length;
        int i10 = 0;
        while (true) {
            if (i10 < length) {
                if (i2 == iArr[i10]) {
                    break;
                }
                i10++;
            } else {
                i10 = -1;
                break;
            }
        }
        if (i10 < 0) {
            return false;
        }
        return true;
    }

    public static boolean d(Object[] objArr, Object obj) {
        objArr.getClass();
        if (A(objArr, obj) >= 0) {
            return true;
        }
        return false;
    }

    public static boolean e(Object[] objArr, Object[] objArr2) {
        if (objArr != objArr2) {
            if (objArr != null && objArr2 != null && objArr.length == objArr2.length) {
                int length = objArr.length;
                for (int i2 = 0; i2 < length; i2++) {
                    Object obj = objArr[i2];
                    Object obj2 = objArr2[i2];
                    if (obj != obj2) {
                        if (obj != null && obj2 != null) {
                            if ((obj instanceof Object[]) && (obj2 instanceof Object[])) {
                                if (!e((Object[]) obj, (Object[]) obj2)) {
                                }
                            } else if ((obj instanceof byte[]) && (obj2 instanceof byte[])) {
                                if (!Arrays.equals((byte[]) obj, (byte[]) obj2)) {
                                }
                            } else if ((obj instanceof short[]) && (obj2 instanceof short[])) {
                                if (!Arrays.equals((short[]) obj, (short[]) obj2)) {
                                }
                            } else if ((obj instanceof int[]) && (obj2 instanceof int[])) {
                                if (!Arrays.equals((int[]) obj, (int[]) obj2)) {
                                }
                            } else if ((obj instanceof long[]) && (obj2 instanceof long[])) {
                                if (!Arrays.equals((long[]) obj, (long[]) obj2)) {
                                }
                            } else if ((obj instanceof float[]) && (obj2 instanceof float[])) {
                                if (!Arrays.equals((float[]) obj, (float[]) obj2)) {
                                }
                            } else if ((obj instanceof double[]) && (obj2 instanceof double[])) {
                                if (!Arrays.equals((double[]) obj, (double[]) obj2)) {
                                }
                            } else if ((obj instanceof char[]) && (obj2 instanceof char[])) {
                                if (!Arrays.equals((char[]) obj, (char[]) obj2)) {
                                }
                            } else if ((obj instanceof boolean[]) && (obj2 instanceof boolean[])) {
                                if (!Arrays.equals((boolean[]) obj, (boolean[]) obj2)) {
                                }
                            } else if ((obj instanceof yb.q) && (obj2 instanceof yb.q)) {
                                if (!Arrays.equals(((yb.q) obj).A, ((yb.q) obj2).A)) {
                                }
                            } else if ((obj instanceof yb.x) && (obj2 instanceof yb.x)) {
                                if (!Arrays.equals(((yb.x) obj).A, ((yb.x) obj2).A)) {
                                }
                            } else if ((obj instanceof yb.s) && (obj2 instanceof yb.s)) {
                                if (!Arrays.equals(((yb.s) obj).A, ((yb.s) obj2).A)) {
                                }
                            } else if ((obj instanceof yb.u) && (obj2 instanceof yb.u)) {
                                if (!Arrays.equals(((yb.u) obj).A, ((yb.u) obj2).A)) {
                                }
                            } else if (!obj.equals(obj2)) {
                            }
                        }
                    }
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public static void f(int i2, int i10, int i11, byte[] bArr, byte[] bArr2) {
        bArr.getClass();
        bArr2.getClass();
        System.arraycopy(bArr, i10, bArr2, i2, i11 - i10);
    }

    public static void g(int i2, int i10, int i11, int[] iArr, int[] iArr2) {
        iArr.getClass();
        iArr2.getClass();
        System.arraycopy(iArr, i10, iArr2, i2, i11 - i10);
    }

    public static void h(long[] jArr, long[] jArr2, int i2, int i10, int i11) {
        jArr.getClass();
        jArr2.getClass();
        System.arraycopy(jArr, i10, jArr2, i2, i11 - i10);
    }

    public static void i(Object[] objArr, Object[] objArr2, int i2, int i10, int i11) {
        objArr.getClass();
        objArr2.getClass();
        System.arraycopy(objArr, i10, objArr2, i2, i11 - i10);
    }

    public static /* synthetic */ void j(int i2, int i10, int i11, int[] iArr, int[] iArr2) {
        if ((i11 & 2) != 0) {
            i2 = 0;
        }
        if ((i11 & 8) != 0) {
            i10 = iArr.length;
        }
        g(i2, 0, i10, iArr, iArr2);
    }

    public static /* synthetic */ void k(byte[] bArr, byte[] bArr2, int i2, int i10, int i11, int i12) {
        if ((i12 & 2) != 0) {
            i2 = 0;
        }
        if ((i12 & 4) != 0) {
            i10 = 0;
        }
        if ((i12 & 8) != 0) {
            i11 = bArr.length;
        }
        f(i2, i10, i11, bArr, bArr2);
    }

    public static /* synthetic */ void l(Object[] objArr, Object[] objArr2, int i2, int i10, int i11) {
        if ((i11 & 4) != 0) {
            i2 = 0;
        }
        if ((i11 & 8) != 0) {
            i10 = objArr.length;
        }
        i(objArr, objArr2, 0, i2, i10);
    }

    public static byte[] m(byte[] bArr, int i2, int i10) {
        bArr.getClass();
        o(i10, bArr.length);
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i2, i10);
        copyOfRange.getClass();
        return copyOfRange;
    }

    public static Object[] n(Object[] objArr, int i2, int i10) {
        objArr.getClass();
        o(i10, objArr.length);
        Object[] copyOfRange = Arrays.copyOfRange(objArr, i2, i10);
        copyOfRange.getClass();
        return copyOfRange;
    }

    public static final void o(int i2, int i10) {
        if (i2 <= i10) {
            return;
        }
        m9.o.c(i2, i10, ") is greater than size (", "toIndex (");
    }

    public static y0 p(Class cls) {
        try {
            Constructor declaredConstructor = cls.getDeclaredConstructor(null);
            if (Modifier.isPublic(declaredConstructor.getModifiers())) {
                try {
                    Object newInstance = declaredConstructor.newInstance(null);
                    newInstance.getClass();
                    return (y0) newInstance;
                } catch (IllegalAccessException e6) {
                    m9.o.l("Cannot create an instance of ", cls, e6);
                    return null;
                } catch (InstantiationException e10) {
                    m9.o.l("Cannot create an instance of ", cls, e10);
                    return null;
                }
            }
            throw new RuntimeException("Cannot create an instance of " + cls);
        } catch (NoSuchMethodException e11) {
            m9.o.l("Cannot create an instance of ", cls, e11);
            return null;
        }
    }

    public static final float q(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        float f8 = 0.0f;
        for (int i2 = 0; i2 < length; i2++) {
            f8 += fArr[i2] * fArr2[i2];
        }
        return f8;
    }

    public static final void r(t7.a aVar, String str) {
        aVar.getClass();
        t7.c T = aVar.T(str);
        try {
            T.N();
            q8.r.q(T, null);
        } finally {
        }
    }

    public static void s(int i2, int i10, Object obj, Object[] objArr) {
        objArr.getClass();
        Arrays.fill(objArr, i2, i10, obj);
    }

    public static void t(long[] jArr, long j2) {
        int length = jArr.length;
        jArr.getClass();
        Arrays.fill(jArr, 0, length, j2);
    }

    public static /* synthetic */ void u(Object[] objArr, a0.c cVar) {
        s(0, objArr.length, cVar, objArr);
    }

    public static ArrayList v(Object[] objArr) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static Object w(Object[] objArr) {
        objArr.getClass();
        if (objArr.length != 0) {
            return objArr[0];
        }
        m9.o.x("Array is empty.");
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [sc.b, sc.d] */
    public static sc.d x(int[] iArr) {
        return new sc.b(0, iArr.length - 1, 1);
    }

    public static int y(long[] jArr) {
        jArr.getClass();
        return jArr.length - 1;
    }

    public static Object z(int i2, Object[] objArr) {
        objArr.getClass();
        if (i2 >= 0 && i2 < objArr.length) {
            return objArr[i2];
        }
        return null;
    }
}
