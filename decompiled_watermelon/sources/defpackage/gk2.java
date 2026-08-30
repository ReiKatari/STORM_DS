package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Shader;
import android.opengl.GLES20;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.lang.annotation.Annotation;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.regex.Matcher;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import me.magnum.melonds.impl.emulator.debug.RendererDebugBridge;
import me.magnum.melondualds.R;
import org.xmlpull.v1.XmlPullParser;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: gk2 */
/* loaded from: classes.dex */
public abstract class gk2 implements jb7 {
    /* JADX WARN: Removed duplicated region for block: B:100:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0096 A[Catch: NumberFormatException -> 0x00aa, LOOP:3: B:108:0x0068->B:127:0x0096, LOOP_END, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:105:0x0054, B:108:0x0068, B:110:0x006e, B:114:0x007a, B:127:0x0096, B:129:0x009c, B:135:0x00b1, B:136:0x00b4), top: B:151:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x009c A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:105:0x0054, B:108:0x0068, B:110:0x006e, B:114:0x007a, B:127:0x0096, B:129:0x009c, B:135:0x00b1, B:136:0x00b4), top: B:151:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x00b1 A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:105:0x0054, B:108:0x0068, B:110:0x006e, B:114:0x007a, B:127:0x0096, B:129:0x009c, B:135:0x00b1, B:136:0x00b4), top: B:151:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x00d6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0095 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.gl4[] A(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gk2.A(java.lang.String):gl4[]");
    }

    public static int B(int i, String str) {
        int glCreateShader = GLES20.glCreateShader(i);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] == 0) {
            Log.e("ShaderFactory", GLES20.glGetShaderInfoLog(glCreateShader));
        }
        return glCreateShader;
    }

    public static k26 C(t26 t26Var) {
        int i;
        t26Var.getClass();
        int B = B(35633, t26Var.b);
        int B2 = B(35632, t26Var.c);
        int glCreateProgram = GLES20.glCreateProgram();
        GLES20.glAttachShader(glCreateProgram, B);
        GLES20.glAttachShader(glCreateProgram, B2);
        GLES20.glLinkProgram(glCreateProgram);
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
        if (iArr[0] == 0) {
            Log.e("ShaderFactory", GLES20.glGetProgramInfoLog(glCreateProgram));
        }
        int i2 = r26.a[t26Var.a.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                i = 9729;
            } else {
                i.c();
                return null;
            }
        } else {
            i = 9728;
        }
        return new k26(B, B2, glCreateProgram, i);
    }

    public static final long D() {
        return Thread.currentThread().getId();
    }

    public static String E(File file) {
        file.getClass();
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            ArrayList arrayList = new ArrayList();
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    arrayList.add(file2);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (File file3 : listFiles) {
                if (file3.isFile()) {
                    arrayList2.add(file3);
                }
            }
            if (arrayList.size() == 1 && arrayList2.isEmpty()) {
                return ((File) tq0.K0(arrayList)).getName();
            }
            return null;
        }
        return null;
    }

    public static final void F(go goVar, long j, float f, yn ynVar, io ioVar, mi2 mi2Var) {
        long j2;
        if (f == RecyclerView.A1) {
            j2 = ynVar.d();
        } else {
            j2 = ((float) (j - goVar.c)) / f;
        }
        goVar.g = j;
        goVar.e.setValue(ynVar.c(j2));
        goVar.f = ynVar.g(j2);
        if (ynVar.i(j2)) {
            goVar.h = goVar.g;
            goVar.i.setValue(Boolean.FALSE);
        }
        g0(goVar, ioVar);
        mi2Var.n(goVar);
    }

    public static void G(File file, File file2, nh3 nh3Var, ef5 ef5Var) {
        q72.H(file2);
        file2.mkdirs();
        File canonicalFile = file2.getCanonicalFile();
        try {
            ZipFile zipFile = new ZipFile(file);
            try {
                int size = zipFile.size();
                Enumeration<? extends ZipEntry> entries = zipFile.entries();
                int i = 0;
                while (entries.hasMoreElements()) {
                    e31 e31Var = ef5Var.B;
                    e31Var.getClass();
                    ln2.B(e31Var);
                    ZipEntry nextElement = entries.nextElement();
                    File canonicalFile2 = new File(canonicalFile, nextElement.getName()).getCanonicalFile();
                    String path = canonicalFile2.getPath();
                    path.getClass();
                    if (gh6.n0(path, canonicalFile.getPath() + File.separator, false)) {
                        if (nextElement.isDirectory()) {
                            canonicalFile2.mkdirs();
                        } else {
                            File parentFile = canonicalFile2.getParentFile();
                            if (parentFile != null) {
                                parentFile.mkdirs();
                            }
                            InputStream inputStream = zipFile.getInputStream(nextElement);
                            FileOutputStream fileOutputStream = new FileOutputStream(canonicalFile2);
                            try {
                                inputStream.getClass();
                                long o = pu.o(inputStream, fileOutputStream);
                                fileOutputStream.close();
                                new Long(o);
                                inputStream.close();
                            } finally {
                            }
                        }
                        i++;
                        nh3Var.j(new Integer(i), new Integer(size));
                    } else {
                        throw new Exception((Throwable) null);
                    }
                }
                zipFile.close();
            } finally {
            }
        } catch (Exception e) {
            throw new Exception(e);
        }
    }

    public static final long H(h06 h06Var, int i) {
        long j;
        h06Var.getClass();
        List i2 = h06Var.i(i);
        int i3 = i + 1;
        jv4 jv4Var = jv4.DEFAULT;
        int size = i2.size();
        int i4 = i3;
        boolean z = false;
        boolean z2 = false;
        for (int i5 = 0; i5 < size; i5++) {
            Annotation annotation = (Annotation) i2.get(i5);
            if (annotation instanceof kv4) {
                i4 = ((kv4) annotation).number();
                x(i4, i5, h06Var);
            } else if (annotation instanceof ov4) {
                jv4Var = ((ov4) annotation).type();
            } else if (annotation instanceof mv4) {
                z2 = true;
            } else if (annotation instanceof lv4) {
                z = true;
            }
        }
        if (!z) {
            i3 = i4;
        }
        long j2 = 0;
        if (z2) {
            j = 4294967296L;
        } else {
            j = 0;
        }
        if (z) {
            j2 = 68719476736L;
        }
        return i3 | j2 | j | jv4Var.getSignature$kotlinx_serialization_protobuf();
    }

    public static final int I(h06 h06Var, int i, boolean z) {
        h06Var.getClass();
        List i2 = h06Var.i(i);
        if (!z) {
            i++;
        }
        int size = i2.size();
        for (int i3 = 0; i3 < size; i3++) {
            Annotation annotation = (Annotation) i2.get(i3);
            if (annotation instanceof lv4) {
                return -2;
            }
            if (annotation instanceof kv4) {
                i = ((kv4) annotation).number();
                if (!z) {
                    x(i, i3, h06Var);
                }
            }
        }
        return i;
    }

    public static final int J(int i, ej3 ej3Var, Object obj) {
        int e;
        if (obj != null && ej3Var.a() != 0 && ((i >= ej3Var.a() || !obj.equals(ej3Var.c(i))) && (e = ej3Var.e(obj)) != -1)) {
            return e;
        }
        return i;
    }

    public static final void K(long j, byte[] bArr, int i, int i2, int i3) {
        int i4 = 7 - i2;
        int i5 = 8 - i3;
        if (i5 > i4) {
            return;
        }
        while (true) {
            int i6 = gr2.a[(int) ((j >> (i4 << 3)) & 255)];
            int i7 = i + 1;
            bArr[i] = (byte) (i6 >> 8);
            i += 2;
            bArr[i7] = (byte) i6;
            if (i4 != i5) {
                i4--;
            } else {
                return;
            }
        }
    }

    public static final List L(h06 h06Var, vn1 vn1Var) {
        List<h06> n1;
        h06Var.getClass();
        vn1Var.getClass();
        ep2 c = h06Var.c();
        if (b53.x(c, zp4.h)) {
            qo0 h0 = ct3.h0(h06Var);
            n1 = pp1.A;
            if (h0 != null) {
                n1 = new ArrayList(uq0.y0(n1, 10));
            }
        } else if (b53.x(c, zp4.i)) {
            h06 j = h06Var.j(1);
            j.getClass();
            n1 = tq0.n1(new lu(4, j));
        } else {
            c44.g(h06Var.b(), " should be abstract or sealed or interface to be used as @ProtoOneOf property.", "Class ");
            return null;
        }
        for (h06 h06Var2 : n1) {
            List<Annotation> i = h06Var2.i(0);
            if (i == null || !i.isEmpty()) {
                for (Annotation annotation : i) {
                    if (annotation instanceof kv4) {
                        break;
                    }
                }
            }
            String b = h06Var2.b();
            String b2 = h06Var.b();
            throw new IllegalArgumentException(b + " implementing oneOf type " + b2 + " should have @ProtoNumber annotation in its single property.");
        }
        return n1;
    }

    public static int M(Context context, int i, int i2) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        if (typedValue.resourceId != 0) {
            return i;
        }
        return i2;
    }

    public static String N(Context context, w76 w76Var, int i) {
        w76 w76Var2;
        ti4 ti4Var;
        w76Var.getClass();
        long j = w76Var.A;
        if (j < 1024) {
            w76Var2 = new w76(j);
        } else {
            double d = j / 1024.0d;
            if (d < 1024.0d) {
                w76Var2 = new w76(1024 * j);
            } else if (d / 1024.0d < 1024.0d) {
                w76Var2 = new w76(1048576 * j);
            } else {
                w76Var2 = new w76(1073741824 * j);
            }
        }
        if (w76Var2 instanceof s76) {
            ti4Var = new ti4(Double.valueOf(j), context.getString(R.string.size_bytes));
        } else if (w76Var2 instanceof u76) {
            ti4Var = new ti4(Double.valueOf(j / 1024.0d), context.getString(R.string.size_kb));
        } else if (w76Var2 instanceof v76) {
            ti4Var = new ti4(Double.valueOf((j / 1024.0d) / 1024.0d), context.getString(R.string.size_mb));
        } else if (w76Var2 instanceof t76) {
            ti4Var = new ti4(Double.valueOf(((j / 1024.0d) / 1024.0d) / 1024.0d), context.getString(R.string.size_gb));
        } else {
            i.c();
            return null;
        }
        BigDecimal scale = new BigDecimal(((Number) ti4Var.A).doubleValue()).setScale(i, RoundingMode.HALF_EVEN);
        return scale + ((String) ti4Var.B);
    }

    public static final float O(e31 e31Var) {
        float f;
        mz3 mz3Var = (mz3) e31Var.I(y60.u0);
        if (mz3Var != null) {
            f = mz3Var.V();
        } else {
            f = 1.0f;
        }
        if (f >= RecyclerView.A1) {
            return f;
        }
        qr4.b("negative scale factor");
        return f;
    }

    public static final jv4 P(long j) {
        long j2 = j & 25769803776L;
        jv4 jv4Var = jv4.DEFAULT;
        if (j2 == jv4Var.getSignature$kotlinx_serialization_protobuf()) {
            return jv4Var;
        }
        jv4 jv4Var2 = jv4.SIGNED;
        if (j2 == jv4Var2.getSignature$kotlinx_serialization_protobuf()) {
            return jv4Var2;
        }
        return jv4.FIXED;
    }

    public static final int Q(KeyEvent keyEvent) {
        int i;
        int i2;
        boolean isAltPressed = keyEvent.isAltPressed();
        boolean isCtrlPressed = keyEvent.isCtrlPressed();
        boolean isMetaPressed = keyEvent.isMetaPressed();
        boolean isShiftPressed = keyEvent.isShiftPressed();
        int i3 = 0;
        if (isCtrlPressed) {
            i = 2;
        } else {
            i = 0;
        }
        int i4 = isAltPressed | i;
        if (isMetaPressed) {
            i2 = 4;
        } else {
            i2 = 0;
        }
        int i5 = i4 | i2;
        if (isShiftPressed) {
            i3 = 8;
        }
        return i5 | i3;
    }

    public static ColorStateList R(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
        if (!U(xmlPullParser, "tint")) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        typedArray.getValue(1, typedValue);
        int i = typedValue.type;
        if (i != 2) {
            if (i >= 28 && i <= 31) {
                return ColorStateList.valueOf(typedValue.data);
            }
            Resources resources = typedArray.getResources();
            int resourceId = typedArray.getResourceId(1, 0);
            ThreadLocal threadLocal = er0.a;
            try {
                return er0.a(resources, resources.getXml(resourceId), theme);
            } catch (Exception e) {
                Log.e("CSLCompat", "Failed to inflate ColorStateList.", e);
                return null;
            }
        }
        throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue);
    }

    public static sh S(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i) {
        sh shVar;
        if (U(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i, typedValue);
            int i2 = typedValue.type;
            if (i2 >= 28 && i2 <= 31) {
                return new sh((Shader) null, (ColorStateList) null, typedValue.data);
            }
            try {
                shVar = sh.c(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
            } catch (Exception e) {
                Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e);
                shVar = null;
            }
            if (shVar != null) {
                return shVar;
            }
        }
        return new sh((Shader) null, (ColorStateList) null, 0);
    }

    public static final oq4 T(View view) {
        oq4 oq4Var = (oq4) view.getTag(R.id.pooling_container_listener_holder_tag);
        if (oq4Var == null) {
            oq4 oq4Var2 = new oq4();
            view.setTag(R.id.pooling_container_listener_holder_tag, oq4Var2);
            return oq4Var2;
        }
        return oq4Var;
    }

    public static boolean U(XmlPullParser xmlPullParser, String str) {
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null) {
            return true;
        }
        return false;
    }

    public static final boolean V(long j) {
        if ((j & 68719476736L) != 0) {
            return true;
        }
        return false;
    }

    public static final boolean W(h06 h06Var) {
        h06Var.getClass();
        if (!h06Var.f() ? !(!(h06Var.c() instanceof tt4) || b53.x(h06Var.c(), tt4.p)) : !(h06Var.d() != 1 || !W(h06Var.j(0)))) {
            return true;
        }
        return false;
    }

    public static final ey4 X(dy4 dy4Var) {
        int i;
        int i2;
        boolean z;
        int i3;
        dy4Var.getClass();
        long j = dy4Var.a;
        long j2 = dy4Var.b;
        long j3 = dy4Var.c;
        Integer num = dy4Var.d;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        Integer num2 = dy4Var.e;
        if (num2 != null) {
            i2 = num2.intValue();
            z = false;
        } else {
            i2 = 0;
            z = false;
        }
        String str = dy4Var.f;
        int i4 = i;
        int i5 = i2;
        String str2 = dy4Var.g;
        int i6 = dy4Var.h;
        int i7 = dy4Var.i;
        String url = dy4Var.j.toString();
        url.getClass();
        String url2 = dy4Var.k.toString();
        url2.getClass();
        String str3 = dy4Var.l;
        int i8 = fy4.a[dy4Var.m.ordinal()];
        if (i8 != 1) {
            if (i8 == 2) {
                i3 = 1;
            } else {
                i.c();
                return null;
            }
        } else {
            i3 = 0;
        }
        return new ey4(j, j2, j3, i4, i5, str, str2, i6, i7, url, url2, str3, i3);
    }

    public static final dy4 Y(ey4 ey4Var) {
        cy4 cy4Var;
        ey4Var.getClass();
        long j = ey4Var.a;
        long j2 = ey4Var.b;
        long j3 = ey4Var.c;
        Integer valueOf = Integer.valueOf(ey4Var.d);
        Integer valueOf2 = Integer.valueOf(ey4Var.e);
        String str = ey4Var.f;
        String str2 = ey4Var.g;
        int i = ey4Var.h;
        int i2 = ey4Var.i;
        URL url = new URL(ey4Var.j);
        URL url2 = new URL(ey4Var.k);
        String str3 = ey4Var.l;
        int i3 = ey4Var.m;
        if (i3 != 0) {
            if (i3 == 1) {
                cy4Var = cy4.UNOFFICIAL;
            } else {
                vd6.i(wh1.g(i3, "Unknown achievement type: "));
                return null;
            }
        } else {
            cy4Var = cy4.CORE;
        }
        return new dy4(j, j2, j3, valueOf, valueOf2, str, str2, i, i2, url, url2, str3, cy4Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:190:0x0166, code lost:
        if (r3 == r9) goto L66;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:119:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x00bd A[Catch: all -> 0x0055, TryCatch #1 {all -> 0x0055, blocks: (B:129:0x0051, B:152:0x00b5, B:154:0x00bd, B:156:0x00c9, B:158:0x00d5, B:149:0x009b), top: B:207:0x002d }] */
    /* JADX WARN: Type inference failed for: r2v8, types: [j75, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object Z(defpackage.sk6 r17, defpackage.qh r18, defpackage.sh r19, defpackage.kp4 r20, defpackage.m00 r21) {
        /*
            Method dump skipped, instructions count: 414
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gk2.Z(sk6, qh, sh, kp4, m00):java.lang.Object");
    }

    public static void a0(oq6 oq6Var, so6 so6Var, lr6 lr6Var, rd3 rd3Var, er6 er6Var, boolean z, pb4 pb4Var) {
        long a;
        y55 y55Var;
        if (z) {
            int r = pb4Var.r(vr6.e(oq6Var.b));
            String str = zo6.a;
            if (r < lr6Var.a.a.B.length()) {
                y55Var = lr6Var.b(r);
            } else if (r == 0) {
                a = zo6.a(so6Var.b, so6Var.g, so6Var.h, zo6.a, 1);
                y55Var = new y55(RecyclerView.A1, RecyclerView.A1, 1.0f, (int) (a & 4294967295L));
            } else {
                y55Var = lr6Var.b(r - 1);
            }
            float f = y55Var.b;
            float f2 = y55Var.a;
            long Q = rd3Var.Q((Float.floatToRawIntBits(f2) << 32) | (Float.floatToRawIntBits(f) & 4294967295L));
            float intBitsToFloat = Float.intBitsToFloat((int) (Q >> 32));
            float intBitsToFloat2 = Float.intBitsToFloat((int) (Q & 4294967295L));
            y55 b = yf2.b((Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32), (Float.floatToRawIntBits(y55Var.c - f2) << 32) | (Float.floatToRawIntBits(y55Var.d - f) & 4294967295L));
            if (b53.x((er6) er6Var.a.b.get(), er6Var)) {
                er6Var.b.h(b);
            }
        }
    }

    public static TypedArray b0(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        if (theme == null) {
            return resources.obtainAttributes(attributeSet, iArr);
        }
        return theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    public static final kt5 c0(tu0 tu0Var) {
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.X(1967007413);
        Object[] objArr = new Object[0];
        Object L = sk2Var.L();
        if (L == su0.a) {
            L = new vq3(27);
            sk2Var.h0(L);
        }
        kt5 kt5Var = (kt5) jk2.N(objArr, kt5.X, (ki2) L, sk2Var, RendererDebugBridge.CAPTURE_HEIGHT);
        kt5Var.L = (lt5) sk2Var.j(nt5.a);
        sk2Var.p(false);
        return kt5Var;
    }

    public static final void d(n24 n24Var, k24 k24Var, fw5 fw5Var, zy3 zy3Var, et0 et0Var, tu0 tu0Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z;
        k24 k24Var2;
        float f;
        bn1 bn1Var;
        xy6 V0;
        boolean z2;
        float f2;
        float f3;
        xy6 V02;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(1077393800);
        if (sk2Var.f(n24Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i6 = i | i2;
        if (sk2Var.f(fw5Var)) {
            i3 = 256;
        } else {
            i3 = 128;
        }
        int i7 = i6 | i3;
        if (sk2Var.f(zy3Var)) {
            i4 = 2048;
        } else {
            i4 = 1024;
        }
        int i8 = i7 | i4;
        if (sk2Var.h(et0Var)) {
            i5 = 16384;
        } else {
            i5 = 8192;
        }
        int i9 = i8 | i5;
        if ((i9 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var.O(i9 & 1, z)) {
            kx6 P = a53.P(n24Var, "DropDownMenu", sk2Var, (i9 & 14) | 48, 0);
            bz6 bz6Var = dt3.g0;
            ku0 ku0Var = P.a;
            tj4 tj4Var = P.d;
            boolean booleanValue = ((Boolean) ku0Var.f()).booleanValue();
            sk2Var.X(-1833869404);
            float f4 = 0.8f;
            if (booleanValue) {
                f = 1.0f;
            } else {
                f = 0.8f;
            }
            sk2Var.p(false);
            Float valueOf = Float.valueOf(f);
            boolean booleanValue2 = ((Boolean) tj4Var.getValue()).booleanValue();
            sk2Var.X(-1833869404);
            if (booleanValue2) {
                f4 = 1.0f;
            }
            sk2Var.p(false);
            Float valueOf2 = Float.valueOf(f4);
            ex6 f5 = P.f();
            sk2Var.X(445475263);
            Boolean bool = Boolean.FALSE;
            Boolean bool2 = Boolean.TRUE;
            if (f5.b(bool, bool2)) {
                V0 = ct3.V0(120, 0, cn1.b, 2);
                z2 = false;
                bn1Var = null;
            } else {
                bn1Var = null;
                V0 = ct3.V0(1, 74, null, 4);
                z2 = false;
            }
            sk2Var.p(z2);
            bn1 bn1Var2 = bn1Var;
            gx6 y = a53.y(P, valueOf, valueOf2, V0, bz6Var, sk2Var, 0);
            boolean booleanValue3 = ((Boolean) P.a.f()).booleanValue();
            sk2Var.X(-1578341192);
            if (booleanValue3) {
                f2 = 1.0f;
            } else {
                f2 = RecyclerView.A1;
            }
            sk2Var.p(false);
            Float valueOf3 = Float.valueOf(f2);
            boolean booleanValue4 = ((Boolean) tj4Var.getValue()).booleanValue();
            sk2Var.X(-1578341192);
            if (booleanValue4) {
                f3 = 1.0f;
            } else {
                f3 = RecyclerView.A1;
            }
            sk2Var.p(false);
            Float valueOf4 = Float.valueOf(f3);
            ex6 f6 = P.f();
            sk2Var.X(701003475);
            if (f6.b(bool, bool2)) {
                V02 = ct3.V0(30, 0, bn1Var2, 6);
            } else {
                V02 = ct3.V0(75, 0, bn1Var2, 6);
            }
            sk2Var.p(false);
            gx6 y2 = a53.y(P, valueOf3, valueOf4, V02, bz6Var, sk2Var, 0);
            boolean f7 = sk2Var.f(y) | sk2Var.f(y2);
            Object L = sk2Var.L();
            if (!f7 && L != su0.a) {
                k24Var2 = k24Var;
            } else {
                k24Var2 = k24Var;
                L = new cz(k24Var2, y, y2, 16);
                sk2Var.h0(L);
            }
            l07.a(tq5.q(wy3.a, (mi2) L), null, 0L, ct3.H0(-707086267, new w3(zy3Var, fw5Var, et0Var, 19), sk2Var), sk2Var, 1769472, 30);
        } else {
            k24Var2 = k24Var;
            sk2Var.R();
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new ei(n24Var, k24Var2, fw5Var, zy3Var, et0Var, i);
        }
    }

    public static final void e(ki2 ki2Var, zy3 zy3Var, ih4 ih4Var, bj2 bj2Var, tu0 tu0Var, int i) {
        int i2;
        boolean z;
        ki2 ki2Var2;
        zy3 zy3Var2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(-674391690);
        if ((i & 6) == 0) {
            if (sk2Var.h(ki2Var)) {
                i8 = 4;
            } else {
                i8 = 2;
            }
            i2 = i8 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (sk2Var.f(zy3Var)) {
                i7 = 32;
            } else {
                i7 = 16;
            }
            i2 |= i7;
        }
        if ((i & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
            if (sk2Var.g(true)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i2 |= i6;
        }
        if ((i & 3072) == 0) {
            if (sk2Var.f(ih4Var)) {
                i5 = 2048;
            } else {
                i5 = 1024;
            }
            i2 |= i5;
        }
        if ((i & 24576) == 0) {
            if (sk2Var.f(null)) {
                i4 = 16384;
            } else {
                i4 = 8192;
            }
            i2 |= i4;
        }
        if ((196608 & i) == 0) {
            if (sk2Var.h(bj2Var)) {
                i3 = 131072;
            } else {
                i3 = 65536;
            }
            i2 |= i3;
        }
        if ((74899 & i2) != 74898) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var.O(i2 & 1, z)) {
            zy3Var2 = zy3Var;
            ki2Var2 = ki2Var;
            zy3 W = b53.W(o76.j(o76.c(a53.r(zy3Var2, null, lg5.a(6, true), true, null, ki2Var, 24), 1.0f), 112.0f, 48.0f, 280.0f, Float.NaN), ih4Var);
            sr5 a = rr5.a(rt.a, y60.h0, sk2Var, 48);
            int j0 = dt3.j0(sk2Var);
            sm4 l = sk2Var.l();
            zy3 e0 = l07.e0(sk2Var, W);
            nu0.i.getClass();
            mv0 mv0Var = mu0.b;
            sk2Var.b0();
            if (sk2Var.S) {
                sk2Var.k(mv0Var);
            } else {
                sk2Var.k0();
            }
            oo2.S(sk2Var, mu0.f, a);
            oo2.S(sk2Var, mu0.e, l);
            dn dnVar = mu0.g;
            if (sk2Var.S || !b53.x(sk2Var.L(), Integer.valueOf(j0))) {
                b31.w(j0, sk2Var, j0, dnVar);
            }
            oo2.S(sk2Var, mu0.d, e0);
            ir6.a(((c17) sk2Var.j(d17.b)).g, ct3.H0(-77738101, new tp(bj2Var, 1), sk2Var), sk2Var, 48);
            sk2Var.p(true);
        } else {
            ki2Var2 = ki2Var;
            zy3Var2 = zy3Var;
            sk2Var.R();
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new rz(ki2Var2, zy3Var2, ih4Var, bj2Var, i);
        }
    }

    public static final e33 e0(y55 y55Var) {
        return new e33(Math.round(y55Var.a), Math.round(y55Var.b), Math.round(y55Var.c), Math.round(y55Var.d));
    }

    public static final void f(zy3 zy3Var, yj2 yj2Var, ki2 ki2Var, tu0 tu0Var, int i) {
        int i2;
        int i3;
        boolean z;
        sk2 sk2Var;
        long j;
        boolean z2;
        sk2 sk2Var2;
        zy3Var.getClass();
        yj2Var.getClass();
        ki2Var.getClass();
        sk2 sk2Var3 = (sk2) tu0Var;
        sk2Var3.Z(-1995127703);
        if (sk2Var3.h(yj2Var)) {
            i2 = 32;
        } else {
            i2 = 16;
        }
        int i4 = i | i2;
        if (sk2Var3.h(ki2Var)) {
            i3 = 256;
        } else {
            i3 = 128;
        }
        int i5 = i4 | i3;
        if ((i5 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var3.O(i5 & 1, z)) {
            jd7 C = mj2.C(sk2Var3);
            Object L = sk2Var3.L();
            sn1 sn1Var = su0.a;
            if (L == sn1Var) {
                L = b31.f(sk2Var3);
            }
            l14 l14Var = (l14) L;
            k24 a = bh7.a(l14Var, sk2Var3, 6);
            fr5 b = gr5.b(13.0f);
            zy3 t = a53.t(zy3Var, b);
            if (((Boolean) a.getValue()).booleanValue()) {
                sk2Var = sk2Var3;
                j = C.e;
            } else {
                sk2Var = sk2Var3;
                j = C.d;
            }
            is2 is2Var = iq2.g;
            zy3 i6 = dk7.i(t, j, is2Var);
            if (((Boolean) a.getValue()).booleanValue()) {
                i6 = b53.z(2.0f, C.j, i6, b);
            }
            zy3 zy3Var2 = i6;
            if ((i5 & 896) == 256) {
                z2 = true;
            } else {
                z2 = false;
            }
            Object L2 = sk2Var.L();
            if (!z2 && L2 != sn1Var) {
                sk2Var2 = sk2Var;
            } else {
                L2 = new w7(9, ki2Var);
                sk2Var2 = sk2Var;
                sk2Var2.h0(L2);
            }
            zy3 Y = b53.Y(a53.r(zy3Var2, l14Var, null, false, null, (ki2) L2, 28), 14.0f, 13.0f);
            sr5 a2 = rr5.a(rt.a, y60.h0, sk2Var2, 48);
            int hashCode = Long.hashCode(sk2Var2.T);
            sm4 l = sk2Var2.l();
            zy3 e0 = l07.e0(sk2Var2, Y);
            nu0.i.getClass();
            mv0 mv0Var = mu0.b;
            sk2Var2.b0();
            if (sk2Var2.S) {
                sk2Var2.k(mv0Var);
            } else {
                sk2Var2.k0();
            }
            dn dnVar = mu0.f;
            oo2.S(sk2Var2, dnVar, a2);
            dn dnVar2 = mu0.e;
            oo2.S(sk2Var2, dnVar2, l);
            Integer valueOf = Integer.valueOf(hashCode);
            dn dnVar3 = mu0.g;
            oo2.S(sk2Var2, dnVar3, valueOf);
            yd ydVar = mu0.h;
            oo2.P(sk2Var2, ydVar);
            dn dnVar4 = mu0.d;
            oo2.S(sk2Var2, dnVar4, e0);
            wy3 wy3Var = wy3.a;
            zy3 i7 = dk7.i(a53.t(o76.h(wy3Var, 34.0f), gr5.b(9.0f)), xq0.b(0.13f, C.j), is2Var);
            tv3 d = d50.d(y60.Z, false);
            int hashCode2 = Long.hashCode(sk2Var2.T);
            sm4 l2 = sk2Var2.l();
            zy3 e02 = l07.e0(sk2Var2, i7);
            sk2Var2.b0();
            if (sk2Var2.S) {
                sk2Var2.k(mv0Var);
            } else {
                sk2Var2.k0();
            }
            oo2.S(sk2Var2, dnVar, d);
            oo2.S(sk2Var2, dnVar2, l2);
            b31.x(hashCode2, sk2Var2, dnVar3, sk2Var2, ydVar);
            oo2.S(sk2Var2, dnVar4, e02);
            ev2.a(oo2.L(), null, o76.h(wy3Var, 19.0f), C.j, sk2Var2, 432, 0);
            sk2Var2.p(true);
            cg2.k(sk2Var2, o76.k(wy3Var, 12.0f));
            sk2 sk2Var4 = sk2Var2;
            ir6.b(yj2Var.b, new xg3(1.0f, true), C.g, hi2.A(13.5d), pe2.c0, null, 0L, null, 0L, 2, false, 1, 0, null, null, sk2Var4, 199680, 3120, 120784);
            sk2Var3 = sk2Var4;
            ev2.a(nk2.E(), null, o76.h(wy3Var, 20.0f), C.i, sk2Var3, 432, 0);
            sk2Var3.p(true);
        } else {
            sk2Var3.R();
        }
        m55 r = sk2Var3.r();
        if (r != null) {
            r.d = new w3(zy3Var, yj2Var, ki2Var, i, 16);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:88:0x009e, code lost:
        if (r15 == r1) goto L42;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0067 A[Catch: CancellationException -> 0x0031, TryCatch #0 {CancellationException -> 0x0031, blocks: (B:67:0x002c, B:90:0x00a1, B:92:0x00a9, B:94:0x00b5, B:96:0x00c1, B:97:0x00c4, B:98:0x00c7, B:99:0x00cb, B:74:0x0040, B:80:0x0063, B:82:0x0067, B:87:0x0086, B:77:0x004a), top: B:104:0x0022 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object f0(defpackage.sk6 r12, defpackage.vo6 r13, defpackage.kp4 r14, defpackage.m00 r15) {
        /*
            Method dump skipped, instructions count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gk2.f0(sk6, vo6, kp4, m00):java.lang.Object");
    }

    public static final void g(final nd3 nd3Var, ki2 ki2Var, cj2 cj2Var, tu0 tu0Var, int i) {
        int i2;
        int i3;
        int i4;
        boolean z;
        ki2Var.getClass();
        cj2Var.getClass();
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(559938776);
        if (sk2Var.h(nd3Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i5 = i | i2;
        if (sk2Var.h(ki2Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i6 = i5 | i3;
        if (sk2Var.h(cj2Var)) {
            i4 = 256;
        } else {
            i4 = 128;
        }
        int i7 = i6 | i4;
        if ((i7 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var.O(i7 & 1, z)) {
            String X = me2.X(sk2Var, R.string.custom_layout_default_name);
            Object[] objArr = {nd3Var.b};
            boolean h = sk2Var.h(nd3Var);
            Object L = sk2Var.L();
            Object obj = su0.a;
            if (h || L == obj) {
                L = new ki2() { // from class: lg3
                    @Override // defpackage.ki2
                    public final Object c() {
                        int i8 = r2;
                        nd3 nd3Var2 = nd3Var;
                        switch (i8) {
                            case 0:
                                return me2.G(nd3Var2.b);
                            case 1:
                                return me2.G(nd3Var2.d);
                            case 2:
                                return me2.G(Boolean.valueOf(nd3Var2.e));
                            default:
                                return new pj4(nd3Var2.f);
                        }
                    }
                };
                sk2Var.h0(L);
            }
            k24 k24Var = (k24) jk2.M(objArr, (ki2) L, sk2Var, 0);
            Object[] objArr2 = {nd3Var.d};
            boolean h2 = sk2Var.h(nd3Var);
            Object L2 = sk2Var.L();
            if (h2 || L2 == obj) {
                L2 = new ki2() { // from class: lg3
                    @Override // defpackage.ki2
                    public final Object c() {
                        int i8 = r2;
                        nd3 nd3Var2 = nd3Var;
                        switch (i8) {
                            case 0:
                                return me2.G(nd3Var2.b);
                            case 1:
                                return me2.G(nd3Var2.d);
                            case 2:
                                return me2.G(Boolean.valueOf(nd3Var2.e));
                            default:
                                return new pj4(nd3Var2.f);
                        }
                    }
                };
                sk2Var.h0(L2);
            }
            k24 k24Var2 = (k24) jk2.M(objArr2, (ki2) L2, sk2Var, 0);
            Object[] objArr3 = {Boolean.valueOf(nd3Var.e)};
            boolean h3 = sk2Var.h(nd3Var);
            Object L3 = sk2Var.L();
            if (h3 || L3 == obj) {
                L3 = new ki2() { // from class: lg3
                    @Override // defpackage.ki2
                    public final Object c() {
                        int i8 = r2;
                        nd3 nd3Var2 = nd3Var;
                        switch (i8) {
                            case 0:
                                return me2.G(nd3Var2.b);
                            case 1:
                                return me2.G(nd3Var2.d);
                            case 2:
                                return me2.G(Boolean.valueOf(nd3Var2.e));
                            default:
                                return new pj4(nd3Var2.f);
                        }
                    }
                };
                sk2Var.h0(L3);
            }
            k24 k24Var3 = (k24) jk2.M(objArr3, (ki2) L3, sk2Var, 0);
            Object[] objArr4 = {Integer.valueOf(nd3Var.f)};
            boolean h4 = sk2Var.h(nd3Var);
            Object L4 = sk2Var.L();
            if (h4 || L4 == obj) {
                L4 = new ki2() { // from class: lg3
                    @Override // defpackage.ki2
                    public final Object c() {
                        int i8 = r2;
                        nd3 nd3Var2 = nd3Var;
                        switch (i8) {
                            case 0:
                                return me2.G(nd3Var2.b);
                            case 1:
                                return me2.G(nd3Var2.d);
                            case 2:
                                return me2.G(Boolean.valueOf(nd3Var2.e));
                            default:
                                return new pj4(nd3Var2.f);
                        }
                    }
                };
                sk2Var.h0(L4);
            }
            pj4 pj4Var = (pj4) jk2.M(objArr4, (ki2) L4, sk2Var, 0);
            uq6 E = ep2.E(sk2Var);
            Object[] objArr5 = new Object[0];
            Object L5 = sk2Var.L();
            if (L5 == obj) {
                L5 = new do1(27);
                sk2Var.h0(L5);
            }
            k24 k24Var4 = (k24) jk2.M(objArr5, (ki2) L5, sk2Var, 48);
            String[] V = me2.V(sk2Var, R.array.layout_orientation_options);
            mh7.a(me2.X(sk2Var, R.string.properties), ki2Var, ct3.H0(1972798883, new zg3(E, k24Var, X, V, k24Var2, k24Var3, pj4Var, 1), sk2Var), ct3.H0(-127883039, new c4(ki2Var, cj2Var, k24Var, k24Var2, k24Var3, pj4Var), sk2Var), false, sk2Var, (i7 & 112) | 3456, 16);
            String X2 = me2.X(sk2Var, R.string.layout_name);
            Object L6 = sk2Var.L();
            if (L6 == obj) {
                L6 = new qu1(26);
                sk2Var.h0(L6);
            }
            ep2.f(X2, E, (mi2) L6, null, sk2Var, RendererDebugBridge.CAPTURE_HEIGHT, 8);
            sk2Var = sk2Var;
            if (((Boolean) k24Var4.getValue()).booleanValue()) {
                sk2Var.X(-513244900);
                String X3 = me2.X(sk2Var, R.string.layout_orientation);
                boolean f = sk2Var.f(k24Var4);
                Object L7 = sk2Var.L();
                if (f || L7 == obj) {
                    L7 = new f4(k24Var4, 21);
                    sk2Var.h0(L7);
                }
                mh7.a(X3, (ki2) L7, ct3.H0(1554765950, new m4(k24Var2, k24Var4, V), sk2Var), ct3.H0(-1094089156, new e4(k24Var4, 4), sk2Var), false, sk2Var, 3456, 16);
                sk2Var.p(false);
            } else {
                sk2Var.X(-511355574);
                sk2Var.p(false);
            }
        } else {
            sk2Var.R();
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new w3(nd3Var, ki2Var, cj2Var, i, 18);
        }
    }

    public static final void g0(go goVar, io ioVar) {
        ioVar.B.setValue(goVar.e.getValue());
        oo ooVar = ioVar.L;
        oo ooVar2 = goVar.f;
        int b = ooVar.b();
        for (int i = 0; i < b; i++) {
            ooVar.e(i, ooVar2.a(i));
        }
        ioVar.X = goVar.h;
        ioVar.R = goVar.g;
        ioVar.Y = ((Boolean) goVar.i.getValue()).booleanValue();
    }

    public static final void h(Boolean bool, Object obj, fn3 fn3Var, mi2 mi2Var, tu0 tu0Var, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        int i5;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(696924721);
        if ((i & 6) == 0) {
            if (sk2Var.h(bool)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (sk2Var.h(obj)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
            i2 |= 128;
        }
        if ((i & 3072) == 0) {
            if (sk2Var.h(mi2Var)) {
                i3 = 2048;
            } else {
                i3 = 1024;
            }
            i2 |= i3;
        }
        if ((i2 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var.O(i2 & 1, z)) {
            sk2Var.T();
            if ((i & 1) != 0 && !sk2Var.y()) {
                sk2Var.R();
            } else {
                fn3Var = (fn3) sk2Var.j(yq3.a);
            }
            int i6 = i2 & (-897);
            sk2Var.q();
            boolean f = sk2Var.f(bool) | sk2Var.f(obj) | sk2Var.f(fn3Var);
            Object L = sk2Var.L();
            if (f || L == su0.a) {
                L = new mn3(fn3Var.getLifecycle());
                sk2Var.h0(L);
            }
            i(fn3Var, (mn3) L, mi2Var, sk2Var, (i6 >> 3) & 896);
        } else {
            sk2Var.R();
        }
        fn3 fn3Var2 = fn3Var;
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new rz(bool, obj, fn3Var2, mi2Var, i, 4);
        }
    }

    public static final void h0(String str, int i, String str2) {
        throw new IllegalArgumentException("Expected " + str2 + " at index " + i + ", but was '" + str.charAt(i) + '\'');
    }

    public static final void i(fn3 fn3Var, mn3 mn3Var, mi2 mi2Var, tu0 tu0Var, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        int i5;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(228371534);
        if ((i & 6) == 0) {
            if (sk2Var.h(fn3Var)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (sk2Var.h(mn3Var)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
            if (sk2Var.h(mi2Var)) {
                i3 = 256;
            } else {
                i3 = 128;
            }
            i2 |= i3;
        }
        boolean z2 = false;
        if ((i2 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var.O(i2 & 1, z)) {
            boolean h = sk2Var.h(mn3Var);
            if ((i2 & 896) == 256) {
                z2 = true;
            }
            boolean h2 = h | z2 | sk2Var.h(fn3Var);
            Object L = sk2Var.L();
            if (h2 || L == su0.a) {
                L = new cz(fn3Var, mn3Var, mi2Var, 15);
                sk2Var.h0(L);
            }
            l.e(fn3Var, mn3Var, (mi2) L, sk2Var);
        } else {
            sk2Var.R();
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new fl(fn3Var, mn3Var, mi2Var, i, 13);
        }
    }

    public static final void j(boolean z, aj2 aj2Var, tu0 tu0Var, int i) {
        int i2;
        int i3;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(1818896922);
        if (sk2Var.g(z)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i2 | i;
        if (sk2Var.h(aj2Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i5 = i4 | i3;
        if ((i5 & 19) == 18 && sk2Var.A()) {
            sk2Var.R();
        } else {
            ln2.j(z, aj2Var, sk2Var, i5 & 126);
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new n21(z, aj2Var, i);
        }
    }

    public static final void k(zy3 zy3Var, ih4 ih4Var, r94 r94Var, ki2 ki2Var, tu0 tu0Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z;
        zy3Var.getClass();
        ih4Var.getClass();
        r94Var.getClass();
        ki2Var.getClass();
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(843875199);
        if (sk2Var.f(zy3Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i6 = i | i2;
        if (sk2Var.f(ih4Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i7 = i6 | i3;
        if (sk2Var.f(r94Var)) {
            i4 = 256;
        } else {
            i4 = 128;
        }
        int i8 = i7 | i4;
        if (sk2Var.h(ki2Var)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i9 = i8 | i5;
        if ((i9 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var.O(i9 & 1, z)) {
            zy3 Z = se.Z(zy3Var, se.R(sk2Var));
            ye6 ye6Var = ov0.n;
            zy3 b0 = b53.b0(Z, b53.B(ih4Var, (sd3) sk2Var.j(ye6Var)), RecyclerView.A1, b53.A(ih4Var, (sd3) sk2Var.j(ye6Var)), RecyclerView.A1, 10);
            lr0 a = jr0.a(rt.c, y60.j0, sk2Var, 0);
            int hashCode = Long.hashCode(sk2Var.T);
            sm4 l = sk2Var.l();
            zy3 e0 = l07.e0(sk2Var, b0);
            nu0.i.getClass();
            mv0 mv0Var = mu0.b;
            sk2Var.b0();
            if (sk2Var.S) {
                sk2Var.k(mv0Var);
            } else {
                sk2Var.k0();
            }
            oo2.S(sk2Var, mu0.f, a);
            oo2.S(sk2Var, mu0.e, l);
            oo2.S(sk2Var, mu0.g, Integer.valueOf(hashCode));
            oo2.P(sk2Var, mu0.h);
            oo2.S(sk2Var, mu0.d, e0);
            wy3 wy3Var = wy3.a;
            int i10 = i9 >> 3;
            l07.i(o76.c(wy3Var, 1.0f), r94Var, ki2Var, sk2Var, (i10 & 896) | (i10 & 112) | 6);
            cg2.k(sk2Var, o76.d(wy3Var, ih4Var.c() + 16.0f));
            sk2Var.p(true);
        } else {
            sk2Var.R();
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new p4(zy3Var, ih4Var, r94Var, ki2Var, i, 9);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x003f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x004b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x003d -> B:45:0x0040). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object l(defpackage.sk6 r7, defpackage.m00 r8) {
        /*
            boolean r0 = r8 instanceof defpackage.sy5
            if (r0 == 0) goto L13
            r0 = r8
            sy5 r0 = (defpackage.sy5) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            sy5 r0 = new sy5
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.X
            p31 r1 = defpackage.p31.COROUTINE_SUSPENDED
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L29
            sk6 r7 = r0.R
            defpackage.me2.a0(r8)
            goto L40
        L29:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r7)
            r7 = 0
            return r7
        L30:
            defpackage.me2.a0(r8)
        L33:
            lp4 r8 = defpackage.lp4.Main
            r0.R = r7
            r0.Y = r3
            java.lang.Object r8 = r7.c(r8, r0)
            if (r8 != r1) goto L40
            return r1
        L40:
            kp4 r8 = (defpackage.kp4) r8
            java.util.List r2 = r8.a
            int r4 = r2.size()
            r5 = 0
        L49:
            if (r5 >= r4) goto L5b
            java.lang.Object r6 = r2.get(r5)
            rp4 r6 = (defpackage.rp4) r6
            boolean r6 = defpackage.ve2.n(r6)
            if (r6 != 0) goto L58
            goto L33
        L58:
            int r5 = r5 + 1
            goto L49
        L5b:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gk2.l(sk6, m00):java.lang.Object");
    }

    public static final ku3 m(Matcher matcher, int i, CharSequence charSequence) {
        if (!matcher.find(i)) {
            return null;
        }
        return new ku3(matcher, charSequence);
    }

    public static final yy3 n(vc1 vc1Var, int i) {
        yy3 yy3Var = ((yy3) vc1Var).A.Y;
        if (yy3Var != null && (yy3Var.R & i) != 0) {
            while (yy3Var != null) {
                int i2 = yy3Var.L;
                if ((i2 & 2) == 0) {
                    if ((i2 & i) != 0) {
                        return yy3Var;
                    }
                    yy3Var = yy3Var.Y;
                } else {
                    return null;
                }
            }
            return null;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:116:0x00c1, code lost:
        if (r15 == r1) goto L51;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0095 A[Catch: CancellationException -> 0x0032, TryCatch #0 {CancellationException -> 0x0032, blocks: (B:82:0x002d, B:118:0x00c4, B:120:0x00cc, B:122:0x00d9, B:124:0x00e5, B:125:0x00e8, B:126:0x00eb, B:128:0x00ef, B:101:0x0091, B:103:0x0095, B:104:0x0097, B:106:0x009b, B:108:0x009f, B:110:0x00a3, B:112:0x00a7, B:114:0x00ab, B:115:0x00b0, B:94:0x0051, B:96:0x005f, B:98:0x0064, B:97:0x0062), top: B:132:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x009b A[Catch: CancellationException -> 0x0032, TryCatch #0 {CancellationException -> 0x0032, blocks: (B:82:0x002d, B:118:0x00c4, B:120:0x00cc, B:122:0x00d9, B:124:0x00e5, B:125:0x00e8, B:126:0x00eb, B:128:0x00ef, B:101:0x0091, B:103:0x0095, B:104:0x0097, B:106:0x009b, B:108:0x009f, B:110:0x00a3, B:112:0x00a7, B:114:0x00ab, B:115:0x00b0, B:94:0x0051, B:96:0x005f, B:98:0x0064, B:97:0x0062), top: B:132:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x009f A[Catch: CancellationException -> 0x0032, TryCatch #0 {CancellationException -> 0x0032, blocks: (B:82:0x002d, B:118:0x00c4, B:120:0x00cc, B:122:0x00d9, B:124:0x00e5, B:125:0x00e8, B:126:0x00eb, B:128:0x00ef, B:101:0x0091, B:103:0x0095, B:104:0x0097, B:106:0x009b, B:108:0x009f, B:110:0x00a3, B:112:0x00a7, B:114:0x00ab, B:115:0x00b0, B:94:0x0051, B:96:0x005f, B:98:0x0064, B:97:0x0062), top: B:132:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x004e  */
    /* JADX WARN: Type inference failed for: r13v6, types: [java.lang.Object, m75] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object o(defpackage.sk6 r11, defpackage.vo6 r12, defpackage.kp4 r13, int r14, defpackage.m00 r15) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gk2.o(sk6, vo6, kp4, int, m00):java.lang.Object");
    }

    public static final Object p(float f, float f2, float f3, ho hoVar, aj2 aj2Var, k11 k11Var) {
        bz6 bz6Var = dt3.g0;
        Float f4 = new Float(f);
        Float f5 = new Float(f2);
        Float f6 = new Float(f3);
        mi2 mi2Var = bz6Var.a;
        oo ooVar = (oo) mi2Var.n(f6);
        if (ooVar == null) {
            ooVar = ((oo) mi2Var.n(f4)).c();
        }
        oo ooVar2 = ooVar;
        Object q = q(new io(bz6Var, f4, ooVar2, 56), new zm6(hoVar, bz6Var, f4, f5, ooVar2), Long.MIN_VALUE, new n95(17, aj2Var), k11Var);
        p31 p31Var = p31.COROUTINE_SUSPENDED;
        o27 o27Var = o27.a;
        if (q != p31Var) {
            q = o27Var;
        }
        if (q == p31Var) {
            return q;
        }
        return o27Var;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:1|(2:3|(8:5|6|7|(3:(1:(1:11)(2:53|54))(1:55)|12|13)(8:56|(11:66|67|68|69|70|71|72|73|(2:75|(1:77)(2:80|81))(1:82)|(1:79)|29)(7:58|59|60|61|15|16|(7:18|19|20|21|22|23|(1:34)(2:25|(1:27)(2:31|32)))(2:47|48))|65|38|(1:40)|41|(1:45)|46)|14|15|16|(0)(0)))|91|6|7|(0)(0)|14|15|16|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0183, code lost:
        if (r1 == r10) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x018c, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x018d, code lost:
        r2 = r1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0121 A[Catch: CancellationException -> 0x018c, TRY_LEAVE, TryCatch #4 {CancellationException -> 0x018c, blocks: (B:146:0x010c, B:148:0x0121), top: B:187:0x010c }] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x01aa  */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, n75] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:160:0x0183 -> B:134:0x00c7). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object q(defpackage.io r25, defpackage.yn r26, long r27, final defpackage.mi2 r29, defpackage.k11 r30) {
        /*
            Method dump skipped, instructions count: 437
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gk2.q(io, yn, long, mi2, k11):java.lang.Object");
    }

    public static /* synthetic */ Object r(float f, float f2, ho hoVar, aj2 aj2Var, k11 k11Var, int i) {
        if ((i & 8) != 0) {
            hoVar = ct3.P0(RecyclerView.A1, RecyclerView.A1, null, 7);
        }
        return p(f, f2, RecyclerView.A1, hoVar, aj2Var, k11Var);
    }

    public static final Object s(io ioVar, x81 x81Var, boolean z, mi2 mi2Var, k11 k11Var) {
        long j;
        la laVar = new la(x81Var, ioVar.A, ioVar.B.getValue(), ioVar.L);
        if (z) {
            j = ioVar.R;
        } else {
            j = Long.MIN_VALUE;
        }
        Object q = q(ioVar, laVar, j, mi2Var, k11Var);
        if (q == p31.COROUTINE_SUSPENDED) {
            return q;
        }
        return o27.a;
    }

    public static final Object t(io ioVar, Float f, ho hoVar, boolean z, mi2 mi2Var, k11 k11Var) {
        long j;
        zm6 zm6Var = new zm6(hoVar, ioVar.A, ioVar.B.getValue(), f, ioVar.L);
        if (z) {
            j = ioVar.R;
        } else {
            j = Long.MIN_VALUE;
        }
        Object q = q(ioVar, zm6Var, j, mi2Var, k11Var);
        if (q == p31.COROUTINE_SUSPENDED) {
            return q;
        }
        return o27.a;
    }

    public static /* synthetic */ Object u(io ioVar, Float f, sc6 sc6Var, boolean z, mi2 mi2Var, k11 k11Var, int i) {
        if ((i & 2) != 0) {
            sc6Var = ct3.P0(RecyclerView.A1, RecyclerView.A1, null, 7);
        }
        sc6 sc6Var2 = sc6Var;
        if ((i & 8) != 0) {
            mi2Var = new d96(4);
        }
        return t(ioVar, f, sc6Var2, z, mi2Var, k11Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [f60, sb6, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v9, types: [f60, sb6, java.lang.Object] */
    public static void v(long j, f60 f60Var, int i, ArrayList arrayList, int i2, int i3, ArrayList arrayList2) {
        int i4;
        int i5;
        ArrayList arrayList3;
        long j2;
        int i6;
        int i7 = i;
        ArrayList arrayList4 = arrayList;
        ArrayList arrayList5 = arrayList2;
        if (i2 < i3) {
            for (int i8 = i2; i8 < i3; i8++) {
                if (((w70) arrayList4.get(i8)).d() < i7) {
                    i.i("Failed requirement.");
                    return;
                }
            }
            w70 w70Var = (w70) arrayList.get(i2);
            w70 w70Var2 = (w70) arrayList4.get(i3 - 1);
            if (i7 == w70Var.d()) {
                int intValue = ((Number) arrayList5.get(i2)).intValue();
                int i9 = i2 + 1;
                w70 w70Var3 = (w70) arrayList4.get(i9);
                i4 = i9;
                i5 = intValue;
                w70Var = w70Var3;
            } else {
                i4 = i2;
                i5 = -1;
            }
            if (w70Var.i(i7) != w70Var2.i(i7)) {
                int i10 = 1;
                for (int i11 = i4 + 1; i11 < i3; i11++) {
                    if (((w70) arrayList4.get(i11 - 1)).i(i7) != ((w70) arrayList4.get(i11)).i(i7)) {
                        i10++;
                    }
                }
                long j3 = (f60Var.B / 4) + j + 2 + (i10 * 2);
                f60Var.p0(i10);
                f60Var.p0(i5);
                for (int i12 = i4; i12 < i3; i12++) {
                    byte i13 = ((w70) arrayList4.get(i12)).i(i7);
                    if (i12 == i4 || i13 != ((w70) arrayList4.get(i12 - 1)).i(i7)) {
                        f60Var.p0(i13 & 255);
                    }
                }
                ?? obj = new Object();
                int i14 = i4;
                while (i14 < i3) {
                    byte i15 = ((w70) arrayList4.get(i14)).i(i7);
                    int i16 = i14 + 1;
                    int i17 = i16;
                    while (true) {
                        if (i17 < i3) {
                            if (i15 != ((w70) arrayList4.get(i17)).i(i7)) {
                                break;
                            }
                            i17++;
                        } else {
                            i17 = i3;
                            break;
                        }
                    }
                    if (i16 == i17 && i7 + 1 == ((w70) arrayList4.get(i14)).d()) {
                        f60Var.p0(((Number) arrayList5.get(i14)).intValue());
                        arrayList3 = arrayList5;
                        j2 = j3;
                        i6 = i17;
                    } else {
                        f60Var.p0(((int) ((obj.B / 4) + j3)) * (-1));
                        arrayList3 = arrayList5;
                        j2 = j3;
                        i6 = i17;
                        v(j2, obj, i7 + 1, arrayList, i14, i6, arrayList3);
                        arrayList4 = arrayList;
                    }
                    j3 = j2;
                    i14 = i6;
                    arrayList5 = arrayList3;
                }
                f60Var.l0(obj);
                return;
            }
            int min = Math.min(w70Var.d(), w70Var2.d());
            int i18 = 0;
            for (int i19 = i7; i19 < min && w70Var.i(i19) == w70Var2.i(i19); i19++) {
                i18++;
            }
            long j4 = (f60Var.B / 4) + j + 2 + i18 + 1;
            f60Var.p0(-i18);
            f60Var.p0(i5);
            int i20 = i7 + i18;
            while (i7 < i20) {
                f60Var.p0(w70Var.i(i7) & 255);
                i7++;
            }
            if (i4 + 1 == i3) {
                if (i20 == ((w70) arrayList4.get(i4)).d()) {
                    f60Var.p0(((Number) arrayList5.get(i4)).intValue());
                    return;
                } else {
                    i.n("Check failed.");
                    return;
                }
            }
            ?? obj2 = new Object();
            f60Var.p0(((int) ((obj2.B / 4) + j4)) * (-1));
            v(j4, obj2, i20, arrayList4, i4, i3, arrayList5);
            f60Var.l0(obj2);
            return;
        }
        i.i("Failed requirement.");
    }

    public static final void w(View view) {
        view.getClass();
        c06 W = io2.W(new cg(view, null, 3));
        while (W.hasNext()) {
            ArrayList arrayList = T((View) W.next()).a;
            for (int P = l07.P(arrayList); -1 < P; P--) {
                ((da7) arrayList.get(P)).a.e();
            }
        }
    }

    public static final void x(int i, int i2, h06 h06Var) {
        if (i > 0) {
            return;
        }
        String e = h06Var.e(i2);
        String b = h06Var.b();
        throw new IllegalArgumentException(i + " is not allowed in ProtoNumber for property '" + e + "' of '" + b + "', because protobuf supports field numbers in range 1..2147483647");
    }

    public static float[] z(float[] fArr, int i) {
        if (i >= 0) {
            int length = fArr.length;
            if (length >= 0) {
                int min = Math.min(i, length);
                float[] fArr2 = new float[i];
                System.arraycopy(fArr, 0, fArr2, 0, min);
                return fArr2;
            }
            throw new ArrayIndexOutOfBoundsException();
        }
        c44.r();
        return null;
    }

    public abstract gk2 d0(String str, mi2 mi2Var);

    public abstract Object y();

    @Override // defpackage.jb7
    public void b() {
    }

    @Override // defpackage.jb7
    public void c() {
    }
}
