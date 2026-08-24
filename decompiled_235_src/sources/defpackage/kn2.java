package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.PointF;
import android.net.NetworkRequest;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import androidx.recyclerview.widget.RecyclerView;
import com.stormds.emulator.R;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.regex.Matcher;
import me.magnum.melonds.impl.emulator.debug.RendererDebugBridge;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: kn2  reason: default package */
/* loaded from: classes.dex */
public abstract class kn2 {
    public static e33 a;
    public static e33 b;

    public static af4 A(int[] iArr, int[] iArr2) {
        NetworkRequest.Builder builder = new NetworkRequest.Builder();
        for (int i : iArr) {
            try {
                builder.addCapability(i);
            } catch (IllegalArgumentException e) {
                ga0 f = ga0.f();
                String str = af4.b;
                String str2 = af4.b;
                String o = xg6.o("Ignoring adding capability '", i, '\'');
                if (f.b <= 5) {
                    Log.w(str2, o, e);
                }
            }
        }
        int[] iArr3 = nb3.q;
        for (int i2 = 0; i2 < 3; i2++) {
            int i3 = iArr3[i2];
            if (!fv.m0(iArr, i3)) {
                try {
                    builder.removeCapability(i3);
                } catch (IllegalArgumentException e2) {
                    ga0 f2 = ga0.f();
                    String str3 = af4.b;
                    String str4 = af4.b;
                    String o2 = xg6.o("Ignoring removing default capability '", i3, '\'');
                    if (f2.b <= 5) {
                        Log.w(str4, o2, e2);
                    }
                }
            }
        }
        for (int i4 : iArr2) {
            builder.addTransportType(i4);
        }
        NetworkRequest build = builder.build();
        build.getClass();
        return new af4(build);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0096 A[Catch: NumberFormatException -> 0x00aa, LOOP:3: B:25:0x0068->B:44:0x0096, LOOP_END, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:44:0x0096, B:46:0x009c, B:52:0x00b1, B:53:0x00b4), top: B:68:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009c A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:44:0x0096, B:46:0x009c, B:52:0x00b1, B:53:0x00b4), top: B:68:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b1 A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:44:0x0096, B:46:0x009c, B:52:0x00b1, B:53:0x00b4), top: B:68:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0095 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static iu4[] B(String str) {
        int i;
        String trim;
        float[] fArr;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        int i3 = 0;
        int i4 = 1;
        while (i4 < str.length()) {
            while (i4 < str.length()) {
                char charAt = str.charAt(i4);
                if ((charAt - 'Z') * (charAt - 'A') > 0) {
                    if ((charAt - 'z') * (charAt - 'a') > 0) {
                        continue;
                        i4++;
                    }
                }
                if (charAt != 'e' && charAt != 'E') {
                    trim = str.substring(i3, i4).trim();
                    if (!trim.isEmpty()) {
                        if (trim.charAt(i2) != 'z' && trim.charAt(i2) != 'Z') {
                            try {
                                float[] fArr2 = new float[trim.length()];
                                int length = trim.length();
                                int i5 = i2;
                                int i6 = 1;
                                while (i6 < length) {
                                    int i7 = i2;
                                    int i8 = i7;
                                    int i9 = i8;
                                    int i10 = i9;
                                    for (int i11 = i6; i11 < trim.length(); i11++) {
                                        char charAt2 = trim.charAt(i11);
                                        if (charAt2 != ' ') {
                                            if (charAt2 != 'E' && charAt2 != 'e') {
                                                switch (charAt2) {
                                                    case ',':
                                                        break;
                                                    case '-':
                                                        if (i11 != i6 && i7 == 0) {
                                                            i7 = 0;
                                                            i9 = 1;
                                                            i10 = 1;
                                                            break;
                                                        }
                                                        i7 = 0;
                                                        break;
                                                    case '.':
                                                        if (i8 == 0) {
                                                            i7 = 0;
                                                            i8 = 1;
                                                            break;
                                                        }
                                                        i7 = 0;
                                                        i9 = 1;
                                                        i10 = 1;
                                                        break;
                                                    default:
                                                        i7 = 0;
                                                        break;
                                                }
                                            } else {
                                                i7 = 1;
                                            }
                                            if (i9 == 0) {
                                                if (i6 < i11) {
                                                    fArr2[i5] = Float.parseFloat(trim.substring(i6, i11));
                                                    i5++;
                                                }
                                                if (i10 == 0) {
                                                    i6 = i11;
                                                } else {
                                                    i6 = i11 + 1;
                                                }
                                                i2 = 0;
                                            }
                                        }
                                        i7 = 0;
                                        i9 = 1;
                                        if (i9 == 0) {
                                        }
                                    }
                                    if (i6 < i11) {
                                    }
                                    if (i10 == 0) {
                                    }
                                    i2 = 0;
                                }
                                fArr = w(fArr2, i5);
                                i2 = 0;
                            } catch (NumberFormatException e) {
                                u34.p(lb1.A("error in parsing \"", trim, "\""), e);
                                return null;
                            }
                        } else {
                            fArr = new float[i2];
                        }
                        arrayList.add(new iu4(trim.charAt(i2), fArr));
                    }
                    i3 = i4;
                    i4++;
                    i2 = 0;
                }
                i4++;
            }
            trim = str.substring(i3, i4).trim();
            if (!trim.isEmpty()) {
            }
            i3 = i4;
            i4++;
            i2 = 0;
        }
        if (i4 - i3 == 1 && i3 < str.length()) {
            i = 0;
            arrayList.add(new iu4(str.charAt(i3), new float[0]));
        } else {
            i = 0;
        }
        return (iu4[]) arrayList.toArray(new iu4[i]);
    }

    public static final g56 C(View view) {
        g56 g56Var;
        view.getClass();
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_saved_state_registry_owner);
            if (tag instanceof g56) {
                g56Var = (g56) tag;
            } else {
                g56Var = null;
            }
            if (g56Var != null) {
                return g56Var;
            }
            ViewParent s = xk2.s(view);
            if (s instanceof View) {
                view = (View) s;
            } else {
                view = null;
            }
        }
        return null;
    }

    public static byte D(short s, int i) {
        int i2 = ((byte) (((s & 65535) >> i) & 31)) & 255;
        return (byte) (((i2 << 3) + (i2 >> 2)) & 255);
    }

    public static final pe5 E(l55 l55Var, px0 px0Var) {
        xq2 xq2Var = (xq2) px0Var;
        pe5 pe5Var = (pe5) xq2Var.j(l55Var);
        if (pe5Var == null) {
            return vs0.q((Context) xq2Var.j(kf.b));
        }
        return pe5Var;
    }

    public static final int F(v84 v84Var, long j, fo7 fo7Var) {
        float f;
        if (fo7Var != null) {
            f = fo7Var.g();
        } else {
            f = RecyclerView.B1;
        }
        int i = (int) (4294967295L & j);
        int e = v84Var.e(Float.intBitsToFloat(i));
        if (Float.intBitsToFloat(i) >= v84Var.f(e) - f && Float.intBitsToFloat(i) <= v84Var.b(e) + f) {
            int i2 = (int) (j >> 32);
            if (Float.intBitsToFloat(i2) >= (-f) && Float.intBitsToFloat(i2) <= v84Var.d + f) {
                return e;
            }
            return -1;
        }
        return -1;
    }

    public static final int G(KeyEvent keyEvent) {
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

    public static final long H(jt3 jt3Var, of5 of5Var, int i) {
        v84 v84Var;
        fa6 fa6Var = cs1.o0;
        b47 d = jt3Var.d();
        if (d != null) {
            v84Var = d.a.b;
        } else {
            v84Var = null;
        }
        jk3 c = jt3Var.c();
        if (v84Var != null && c != null) {
            return v84Var.h(of5Var.i(c.N(0L)), i, fa6Var);
        }
        return k47.b;
    }

    public static Bitmap I(InputStream inputStream) {
        Object em5Var;
        byte[] bArr;
        int i;
        Object obj = null;
        try {
            b0(inputStream, 104L);
            bArr = new byte[4];
        } catch (Throwable th) {
            em5Var = new em5(th);
        }
        if (inputStream.read(bArr) >= 4) {
            int t = t(bArr, 0);
            if (t > 0) {
                long j = t - 76;
                if (j >= 0) {
                    b0(inputStream, j);
                    byte[] bArr2 = new byte[512];
                    if (inputStream.read(bArr2) >= 512) {
                        byte[] bArr3 = new byte[32];
                        if (inputStream.read(bArr3) >= 32) {
                            short[] sArr = new short[16];
                            for (int i2 = 0; i2 < 16; i2++) {
                                int i3 = i2 * 2;
                                sArr[i2] = (short) ((255 & bArr3[i3]) | ((bArr3[i3 + 1] & 255) << 8));
                            }
                            int[] iArr = new int[16];
                            for (int i4 = 0; i4 < 16; i4++) {
                                short s = sArr[i4];
                                int D = D(s, 0) & 255;
                                int D2 = D(s, 5) & 255;
                                int D3 = D(s, 10) & 255;
                                if (i4 == 0) {
                                    i = 0;
                                } else {
                                    i = 255;
                                }
                                iArr[i4] = Color.argb(i, D, D2, D3);
                            }
                            int[] iArr2 = new int[1024];
                            for (int i5 = 0; i5 < 4; i5++) {
                                for (int i6 = 0; i6 < 4; i6++) {
                                    for (int i7 = 0; i7 < 32; i7++) {
                                        byte b2 = bArr2[(((i5 * 4) + i6) * 32) + i7];
                                        int i8 = (((byte) (b2 & (-16))) & 255) >> 4;
                                        int i9 = b2 & 15;
                                        int i10 = (((i7 / 4) + (i5 * 8)) * 32) + ((i7 % 4) * 2) + (i6 * 8);
                                        if (i9 == 0) {
                                            iArr2[i10] = 0;
                                        } else {
                                            iArr2[i10] = iArr[i9];
                                        }
                                        if (i8 == 0) {
                                            iArr2[i10 + 1] = 0;
                                        } else {
                                            iArr2[i10 + 1] = iArr[i8];
                                        }
                                    }
                                }
                            }
                            byte[] bArr4 = new byte[4096];
                            for (int i11 = 0; i11 < 1024; i11++) {
                                int i12 = iArr2[i11];
                                int i13 = i11 * 4;
                                bArr4[i13] = (byte) ((i12 >> 16) & 255);
                                bArr4[i13 + 1] = (byte) ((i12 >> 8) & 255);
                                bArr4[i13 + 2] = (byte) (i12 & 255);
                                bArr4[i13 + 3] = (byte) ((i12 >> 24) & 255);
                            }
                            Bitmap createBitmap = Bitmap.createBitmap(32, 32, Bitmap.Config.ARGB_8888);
                            createBitmap.copyPixelsFromBuffer(ByteBuffer.wrap(bArr4));
                            em5Var = createBitmap;
                            if (!(em5Var instanceof em5)) {
                                obj = em5Var;
                            }
                            return (Bitmap) obj;
                        }
                    }
                }
            }
        }
        return null;
    }

    public static lx5 J(pq5 pq5Var, InputStream inputStream) {
        Object em5Var;
        byte[] bArr;
        pq5Var.getClass();
        Object obj = null;
        int i = 512;
        try {
            bArr = new byte[512];
        } catch (Throwable th) {
            em5Var = new em5(th);
        }
        if (inputStream.read(bArr) < 512) {
            return null;
        }
        int i2 = 0;
        String W = xs6.W(0, bArr, 12, 5);
        String W2 = xs6.W(12, bArr, 16, 4);
        int i3 = -1;
        while (true) {
            int i4 = i - 1;
            if (i <= 0) {
                break;
            }
            i3 = (i3 >>> 8) ^ lb4.h[(bArr[i2] ^ i3) & 255];
            i2++;
            i = i4;
        }
        em5Var = new lx5(W2, i3, W, pq5Var.a, pq5Var.h);
        if (!(em5Var instanceof em5)) {
            obj = em5Var;
        }
        return (lx5) obj;
    }

    public static uz5 K(InputStream inputStream) {
        Object em5Var;
        String str;
        String str2;
        int i;
        Object obj = null;
        try {
            bg1 bg1Var = new bg1(inputStream);
            boolean z = false;
            byte[] i2 = bg1Var.i(0, 352);
            if (i2 != null) {
                String str3 = new String(i2, 12, 4, qm0.a);
                int t = t(i2, 32);
                int t2 = t(i2, 44);
                if (t2 >= 0 && t2 < 3931649) {
                    int t3 = t(i2, 48);
                    int t4 = t(i2, 60);
                    if (t4 >= 0 && t4 < 3931649) {
                        int t5 = t(i2, 104);
                        if ((i2[18] & 255) == 3) {
                            byte[] i3 = bg1Var.i(564, 4);
                            if (i3 != null) {
                                i = t(i3, 0);
                            } else {
                                i = 0;
                            }
                            if (i == 196612 || (str3.length() > 0 && (str3.charAt(0) == 'H' || str3.charAt(0) == 'K'))) {
                                z = true;
                            }
                        }
                        Iterator it = gt0.d1(hf.c0(new a06(t, t2, zz5.ARM9), new a06(t3, t4, zz5.ARM7), new a06(t5, 2560, zz5.BANNER)), new tp5(5)).iterator();
                        byte[] bArr = null;
                        byte[] bArr2 = null;
                        byte[] bArr3 = null;
                        while (true) {
                            if (it.hasNext()) {
                                a06 a06Var = (a06) it.next();
                                byte[] i4 = bg1Var.i(a06Var.a, a06Var.b);
                                if (i4 == null) {
                                    break;
                                }
                                int i5 = b06.a[a06Var.c.ordinal()];
                                if (i5 != 1) {
                                    if (i5 != 2) {
                                        if (i5 == 3) {
                                            bArr3 = i4;
                                        } else {
                                            throw new RuntimeException();
                                        }
                                    } else {
                                        bArr2 = i4;
                                    }
                                } else {
                                    bArr = i4;
                                }
                            } else if (bArr != null && bArr2 != null && bArr3 != null) {
                                vr4 Y = Y(bArr3);
                                if (Y != null) {
                                    str = (String) Y.A;
                                } else {
                                    str = null;
                                }
                                String str4 = "";
                                if (str == null) {
                                    str = "";
                                }
                                if (Y != null) {
                                    str2 = (String) Y.B;
                                } else {
                                    str2 = null;
                                }
                                if (str2 != null) {
                                    str4 = str2;
                                }
                                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                                messageDigest.update(i2);
                                messageDigest.update(bArr);
                                messageDigest.update(bArr2);
                                messageDigest.update(bArr3);
                                String bigInteger = new BigInteger(1, messageDigest.digest()).toString(16);
                                bigInteger.getClass();
                                em5Var = new uz5(str, str4, qs6.B0(32, bigInteger), z);
                            }
                        }
                    }
                }
            }
            return null;
        } catch (Throwable th) {
            em5Var = new em5(th);
        }
        if (!(em5Var instanceof em5)) {
            obj = em5Var;
        }
        return (uz5) obj;
    }

    public static final of5 L(eb ebVar) {
        return kj2.b(jk4.f(((jk4) ((vs4) ebVar.L).getValue()).a, ((jk4) ((vs4) ebVar.R).getValue()).a), ((xi6) ((vs4) ebVar.B).getValue()).a);
    }

    public static File M(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        for (int i = 0; i < 100; i++) {
            File file = new File(cacheDir, str + i);
            if (file.createNewFile()) {
                return file;
            }
        }
        return null;
    }

    public static final boolean N(int i) {
        int type = Character.getType(i);
        if (type != 23 && type != 20 && type != 22 && type != 30 && type != 29 && type != 24 && type != 21) {
            return false;
        }
        return true;
    }

    public static final boolean O(p27 p27Var, boolean z) {
        jk3 c;
        jt3 jt3Var = p27Var.d;
        if (jt3Var != null && (c = jt3Var.c()) != null) {
            of5 f0 = uj2.f0(c);
            long l = p27Var.l(z);
            float f = f0.a;
            float f2 = f0.c;
            float intBitsToFloat = Float.intBitsToFloat((int) (l >> 32));
            if (f <= intBitsToFloat && intBitsToFloat <= f2) {
                float f3 = f0.b;
                float f4 = f0.d;
                float intBitsToFloat2 = Float.intBitsToFloat((int) (l & 4294967295L));
                if (f3 <= intBitsToFloat2 && intBitsToFloat2 <= f4) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public static final boolean P(int i) {
        if (!Character.isWhitespace(i) && i != 160) {
            return false;
        }
        return true;
    }

    public static final boolean Q(int i) {
        int type;
        if (P(i) && (type = Character.getType(i)) != 14 && type != 13 && i != 10) {
            return true;
        }
        return false;
    }

    public static final p75 R(o75 o75Var) {
        int i;
        int i2;
        boolean z;
        int i3;
        o75Var.getClass();
        long j = o75Var.a;
        long j2 = o75Var.b;
        long j3 = o75Var.c;
        Integer num = o75Var.d;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        Integer num2 = o75Var.e;
        if (num2 != null) {
            i2 = num2.intValue();
            z = false;
        } else {
            i2 = 0;
            z = false;
        }
        String str = o75Var.f;
        int i4 = i;
        int i5 = i2;
        String str2 = o75Var.g;
        int i6 = o75Var.h;
        int i7 = o75Var.i;
        String url = o75Var.j.toString();
        url.getClass();
        String url2 = o75Var.k.toString();
        url2.getClass();
        String str3 = o75Var.l;
        int i8 = q75.a[o75Var.m.ordinal()];
        if (i8 != 1) {
            if (i8 == 2) {
                i3 = 1;
            } else {
                i.d();
                return null;
            }
        } else {
            i3 = 0;
        }
        return new p75(j, j2, j3, i4, i5, str, str2, i6, i7, url, url2, str3, i3);
    }

    public static final o75 S(p75 p75Var) {
        n75 n75Var;
        p75Var.getClass();
        long j = p75Var.a;
        long j2 = p75Var.b;
        long j3 = p75Var.c;
        Integer valueOf = Integer.valueOf(p75Var.d);
        Integer valueOf2 = Integer.valueOf(p75Var.e);
        String str = p75Var.f;
        String str2 = p75Var.g;
        int i = p75Var.h;
        int i2 = p75Var.i;
        URL url = new URL(p75Var.j);
        URL url2 = new URL(p75Var.k);
        String str3 = p75Var.l;
        int i3 = p75Var.m;
        if (i3 != 0) {
            if (i3 == 1) {
                n75Var = n75.UNOFFICIAL;
            } else {
                fa6.h(lb1.g(i3, "Unknown achievement type: "));
                return null;
            }
        } else {
            n75Var = n75.CORE;
        }
        return new o75(j, j2, j3, valueOf, valueOf2, str, str2, i, i2, url, url2, str3, n75Var);
    }

    public static MappedByteBuffer T(Context context, Uri uri) {
        ParcelFileDescriptor openFileDescriptor;
        try {
            openFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", null);
        } catch (IOException unused) {
        }
        if (openFileDescriptor == null) {
            if (openFileDescriptor != null) {
                openFileDescriptor.close();
                return null;
            }
            return null;
        }
        FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
        FileChannel channel = fileInputStream.getChannel();
        MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
        fileInputStream.close();
        openFileDescriptor.close();
        return map;
    }

    public static final long U(long j, long j2) {
        return (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32)) + ((int) (j2 >> 32))) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) + ((int) (j2 & 4294967295L))) & 4294967295L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x038e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0396 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x03e4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:251:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void V(ViewStructure viewStructure, sm3 sm3Var, AutofillId autofillId, String str, rf5 rf5Var) {
        int i;
        long j;
        long j2;
        char c;
        long j3;
        boolean z;
        a87 a87Var;
        fp fpVar;
        oh ohVar;
        mq5 mq5Var;
        rf rfVar;
        boolean z2;
        d41 d41Var;
        Boolean bool;
        boolean z3;
        Integer num;
        int i2;
        List list;
        Integer valueOf;
        int i3;
        Integer num2;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        String d0;
        String[] t;
        boolean z8;
        String[] t2;
        AutofillValue forText;
        ja4 ja4Var;
        long[] jArr;
        Object[] objArr;
        int i4;
        long[] jArr2;
        Object[] objArr2;
        ja4 ja4Var2;
        a87 a87Var2;
        fp fpVar2;
        oh ohVar2;
        mq5 mq5Var2;
        fb6 fb6Var = bb6.a;
        fb6 fb6Var2 = sa6.a;
        ta6 x = sm3Var.x();
        int i5 = 8;
        if (x != null && (ja4Var2 = x.A) != null) {
            Object[] objArr3 = ja4Var2.b;
            j = 128;
            Object[] objArr4 = ja4Var2.c;
            long[] jArr3 = ja4Var2.a;
            int length = jArr3.length - 2;
            i = 2;
            if (length >= 0) {
                z = true;
                int i6 = 0;
                rfVar = null;
                j2 = 255;
                z2 = false;
                a87Var2 = null;
                fpVar2 = null;
                ohVar2 = null;
                d41Var = null;
                bool = null;
                mq5Var2 = null;
                z3 = false;
                num = null;
                c = 7;
                while (true) {
                    long j4 = jArr3[i6];
                    j3 = -9187201950435737472L;
                    if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i7 = 8 - ((~(i6 - length)) >>> 31);
                        for (int i8 = 0; i8 < i7; i8++) {
                            if ((j4 & 255) < 128) {
                                int i9 = (i6 << 3) + i8;
                                Object obj = objArr3[i9];
                                Object obj2 = objArr4[i9];
                                fb6 fb6Var3 = (fb6) obj;
                                if (nb3.k(fb6Var3, bb6.s)) {
                                    obj2.getClass();
                                    rfVar = (rf) obj2;
                                } else if (nb3.k(fb6Var3, bb6.a)) {
                                    obj2.getClass();
                                    CharSequence charSequence = (String) gt0.J0((List) obj2);
                                    if (charSequence != null) {
                                        viewStructure.setContentDescription(charSequence);
                                    }
                                } else if (nb3.k(fb6Var3, bb6.r)) {
                                    obj2.getClass();
                                    d41Var = (d41) obj2;
                                } else if (nb3.k(fb6Var3, bb6.t)) {
                                    obj2.getClass();
                                    ohVar2 = (oh) obj2;
                                } else if (nb3.k(fb6Var3, bb6.G)) {
                                    obj2.getClass();
                                    fpVar2 = (fp) obj2;
                                } else if (nb3.k(fb6Var3, bb6.l)) {
                                    obj2.getClass();
                                    viewStructure.setFocused(((Boolean) obj2).booleanValue());
                                } else if (nb3.k(fb6Var3, bb6.P)) {
                                    obj2.getClass();
                                    num = (Integer) obj2;
                                } else if (nb3.k(fb6Var3, bb6.L)) {
                                    z3 = true;
                                } else if (nb3.k(fb6Var3, bb6.o)) {
                                    obj2.getClass();
                                    z = ((Boolean) obj2).booleanValue();
                                } else if (nb3.k(fb6Var3, bb6.z)) {
                                    obj2.getClass();
                                    mq5Var2 = (mq5) obj2;
                                } else if (nb3.k(fb6Var3, bb6.J)) {
                                    obj2.getClass();
                                    bool = (Boolean) obj2;
                                } else if (nb3.k(fb6Var3, bb6.K)) {
                                    obj2.getClass();
                                    a87Var2 = (a87) obj2;
                                } else if (nb3.k(fb6Var3, sa6.b)) {
                                    viewStructure.setClickable(true);
                                } else if (nb3.k(fb6Var3, sa6.c)) {
                                    viewStructure.setLongClickable(true);
                                } else if (nb3.k(fb6Var3, sa6.w)) {
                                    viewStructure.setFocusable(true);
                                } else if (nb3.k(fb6Var3, sa6.k)) {
                                    z2 = true;
                                }
                            }
                            j4 >>= 8;
                        }
                        if (i7 != 8) {
                            break;
                        }
                    }
                    if (i6 == length) {
                        break;
                    }
                    i6++;
                }
            } else {
                j2 = 255;
                c = 7;
                j3 = -9187201950435737472L;
                z = true;
                rfVar = null;
                z2 = false;
                a87Var2 = null;
                fpVar2 = null;
                ohVar2 = null;
                d41Var = null;
                bool = null;
                mq5Var2 = null;
                z3 = false;
                num = null;
            }
            a87Var = a87Var2;
            fpVar = fpVar2;
            ohVar = ohVar2;
            mq5Var = mq5Var2;
        } else {
            i = 2;
            j = 128;
            j2 = 255;
            c = 7;
            j3 = -9187201950435737472L;
            z = true;
            a87Var = null;
            fpVar = null;
            ohVar = null;
            mq5Var = null;
            rfVar = null;
            z2 = false;
            d41Var = null;
            bool = null;
            z3 = false;
            num = null;
        }
        ta6 x2 = sm3Var.x();
        if (x2 != null && x2.L && !x2.R) {
            x2 = x2.b();
            ca4 ca4Var = new ca4(((ua4) ((aa4) sm3Var.n()).B).L);
            ca4Var.c(sm3Var.n());
            while (ca4Var.i()) {
                sm3 sm3Var2 = (sm3) ca4Var.k(ca4Var.b - 1);
                ta6 x3 = sm3Var2.x();
                if (x3 != null && !x3.L) {
                    x2.d(x3);
                    if (!x3.R) {
                        ca4Var.c(sm3Var2.n());
                    }
                }
            }
        }
        if (x2 != null && (ja4Var = x2.A) != null) {
            Object[] objArr5 = ja4Var.b;
            Object[] objArr6 = ja4Var.c;
            long[] jArr4 = ja4Var.a;
            int length2 = jArr4.length - 2;
            i2 = 1;
            if (length2 >= 0) {
                int i10 = 0;
                list = null;
                while (true) {
                    long j5 = jArr4[i10];
                    int i11 = i5;
                    int i12 = i10;
                    if ((((~j5) << c) & j5 & j3) != j3) {
                        int i13 = 8 - ((~(i12 - length2)) >>> 31);
                        int i14 = 0;
                        while (i14 < i13) {
                            if ((j5 & j2) < j) {
                                int i15 = (i12 << 3) + i14;
                                Object obj3 = objArr5[i15];
                                Object obj4 = objArr6[i15];
                                jArr2 = jArr4;
                                fb6 fb6Var4 = (fb6) obj3;
                                objArr2 = objArr5;
                                if (nb3.k(fb6Var4, bb6.j)) {
                                    viewStructure.setEnabled(false);
                                } else if (nb3.k(fb6Var4, bb6.C)) {
                                    obj4.getClass();
                                    list = (List) obj4;
                                }
                            } else {
                                jArr2 = jArr4;
                                objArr2 = objArr5;
                            }
                            j5 >>= i11;
                            i14++;
                            objArr5 = objArr2;
                            jArr4 = jArr2;
                        }
                        jArr = jArr4;
                        objArr = objArr5;
                        i4 = i11;
                        if (i13 != i4) {
                            break;
                        }
                    } else {
                        jArr = jArr4;
                        objArr = objArr5;
                        i4 = i11;
                    }
                    if (i12 == length2) {
                        break;
                    }
                    i10 = i12 + 1;
                    i5 = i4;
                    objArr5 = objArr;
                    jArr4 = jArr;
                }
                valueOf = Integer.valueOf(sm3Var.B);
                if (sm3Var.v() == null) {
                    valueOf = null;
                }
                if (valueOf == null) {
                    i3 = valueOf.intValue();
                } else {
                    i3 = -1;
                }
                viewStructure.setAutofillId(autofillId, i3);
                viewStructure.setId(i3, str, null, null);
                if (rfVar == null) {
                    num2 = Integer.valueOf(rfVar.a);
                } else if (z2) {
                    num2 = Integer.valueOf(i2);
                } else if (a87Var != null) {
                    num2 = Integer.valueOf(i);
                } else {
                    num2 = null;
                }
                if (num2 != null) {
                    viewStructure.setAutofillType(num2.intValue());
                }
                if (fpVar != null) {
                    String str2 = fpVar.B;
                    if (str2.length() >= 5000) {
                        if (Character.isHighSurrogate(str2.charAt(4999)) && Character.isLowSurrogate(str2.charAt(5000))) {
                            str2 = qs6.S0(4999, str2);
                        } else {
                            str2 = qs6.S0(5000, str2);
                        }
                    }
                    forText = AutofillValue.forText(str2);
                    viewStructure.setAutofillValue(forText);
                }
                if (ohVar != null) {
                    viewStructure.setAutofillValue(ohVar.a);
                }
                if (d41Var != null && (t2 = lb4.t(d41Var)) != null) {
                    viewStructure.setAutofillHints(t2);
                }
                rf5Var.b.m(sm3Var.B, new vz4(viewStructure));
                if (bool != null) {
                    viewStructure.setSelected(bool.booleanValue());
                }
                int i16 = 4;
                if (a87Var == null) {
                    viewStructure.setCheckable(i2);
                    if (a87Var == a87.On) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    viewStructure.setChecked(z8);
                } else if (bool != null && (mq5Var == null || mq5Var.a != 4)) {
                    viewStructure.setCheckable(true);
                    viewStructure.setChecked(bool.booleanValue());
                }
                d41.a.getClass();
                String str3 = (String) fv.D0(lb4.t(c41.c));
                if (d41Var == null && (t = lb4.t(d41Var)) != null) {
                    boolean o0 = fv.o0(t, str3);
                    z4 = true;
                    if (o0) {
                        z5 = true;
                        if (z3 && !z5) {
                            z6 = false;
                        } else {
                            z6 = z4;
                        }
                        if (z6 && !z) {
                            z7 = false;
                        } else {
                            z7 = z4;
                        }
                        viewStructure.setDataIsSensitive(z7);
                        if (!((eg4) sm3Var.B0.e).g1()) {
                            i16 = 0;
                        }
                        viewStructure.setVisibility(i16);
                        if (list != null) {
                            int size = list.size();
                            String str4 = "";
                            for (int i17 = 0; i17 < size; i17++) {
                                str4 = lb1.q(lb1.s(str4), ((fp) list.get(i17)).B, '\n');
                            }
                            viewStructure.setText(str4);
                            viewStructure.setClassName("android.widget.TextView");
                        }
                        if (((aa4) sm3Var.n()).isEmpty() && mq5Var != null && (d0 = ln2.d0(mq5Var.a)) != null) {
                            viewStructure.setClassName(d0);
                        }
                        if (z2) {
                            viewStructure.setClassName("android.widget.EditText");
                            if (Build.VERSION.SDK_INT >= 28 && num != null) {
                                viewStructure.setMaxTextLength(num.intValue());
                            }
                            if (z6) {
                                viewStructure.setInputType(129);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                } else {
                    z4 = true;
                }
                z5 = false;
                if (z3) {
                }
                z6 = z4;
                if (z6) {
                }
                z7 = z4;
                viewStructure.setDataIsSensitive(z7);
                if (!((eg4) sm3Var.B0.e).g1()) {
                }
                viewStructure.setVisibility(i16);
                if (list != null) {
                }
                if (((aa4) sm3Var.n()).isEmpty()) {
                    viewStructure.setClassName(d0);
                }
                if (z2) {
                }
            }
        } else {
            i2 = 1;
        }
        list = null;
        valueOf = Integer.valueOf(sm3Var.B);
        if (sm3Var.v() == null) {
        }
        if (valueOf == null) {
        }
        viewStructure.setAutofillId(autofillId, i3);
        viewStructure.setId(i3, str, null, null);
        if (rfVar == null) {
        }
        if (num2 != null) {
        }
        if (fpVar != null) {
        }
        if (ohVar != null) {
        }
        if (d41Var != null) {
            viewStructure.setAutofillHints(t2);
        }
        rf5Var.b.m(sm3Var.B, new vz4(viewStructure));
        if (bool != null) {
        }
        int i162 = 4;
        if (a87Var == null) {
        }
        d41.a.getClass();
        String str32 = (String) fv.D0(lb4.t(c41.c));
        if (d41Var == null) {
        }
        z4 = true;
        z5 = false;
        if (z3) {
        }
        z6 = z4;
        if (z6) {
        }
        z7 = z4;
        viewStructure.setDataIsSensitive(z7);
        if (!((eg4) sm3Var.B0.e).g1()) {
        }
        viewStructure.setVisibility(i162);
        if (list != null) {
        }
        if (((aa4) sm3Var.n()).isEmpty()) {
        }
        if (z2) {
        }
    }

    public static zz3 W(fy7 fy7Var) {
        if (fy7Var == null) {
            fy7Var = yh2.d(System.nanoTime());
        }
        return new zz3(gt0.V0(zz3.b, gt0.k1(new af7(fy7Var.b(new byte[3])))));
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x01e0, code lost:
        r0 = defpackage.ii2.p(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01e4, code lost:
        defpackage.lb4.p(r2, null);
        r10 = r0;
     */
    /* JADX WARN: Finally extract failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static qy6 X(e36 e36Var, String str) {
        boolean z;
        long j;
        String R;
        Map b2;
        ad6 ad6Var;
        boolean z2;
        e36Var.getClass();
        j36 i0 = e36Var.i0("PRAGMA table_info(`" + str + "`)");
        try {
            long j2 = 0;
            if (!i0.f0()) {
                b2 = zt1.A;
                lb4.p(i0, null);
                j = 0;
            } else {
                int s = ej2.s(i0, "name");
                int s2 = ej2.s(i0, "type");
                int s3 = ej2.s(i0, "notnull");
                int s4 = ej2.s(i0, "pk");
                int s5 = ej2.s(i0, "dflt_value");
                p04 p04Var = new p04();
                while (true) {
                    String R2 = i0.R(s);
                    String R3 = i0.R(s2);
                    if (i0.getLong(s3) != j2) {
                        z = true;
                    } else {
                        z = false;
                    }
                    j = j2;
                    int i = (int) i0.getLong(s4);
                    if (i0.isNull(s5)) {
                        R = null;
                    } else {
                        R = i0.R(s5);
                    }
                    p04Var.put(R2, new ny6(R2, R3, z, i, R, 2));
                    if (!i0.f0()) {
                        break;
                    }
                    j2 = j;
                }
                b2 = p04Var.b();
                lb4.p(i0, null);
            }
            i0 = e36Var.i0("PRAGMA foreign_key_list(`" + str + "`)");
            try {
                int s6 = ej2.s(i0, "id");
                int s7 = ej2.s(i0, "seq");
                int s8 = ej2.s(i0, "table");
                int s9 = ej2.s(i0, "on_delete");
                int s10 = ej2.s(i0, "on_update");
                List G = qo2.G(i0);
                i0.reset();
                ad6 ad6Var2 = new ad6();
                while (i0.f0()) {
                    if (i0.getLong(s7) == j) {
                        int i2 = (int) i0.getLong(s6);
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        int i3 = s6;
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj : G) {
                            int i4 = s7;
                            List list = G;
                            if (((yj2) obj).A == i2) {
                                arrayList3.add(obj);
                            }
                            s7 = i4;
                            G = list;
                        }
                        int i5 = s7;
                        List list2 = G;
                        int size = arrayList3.size();
                        int i6 = 0;
                        while (i6 < size) {
                            Object obj2 = arrayList3.get(i6);
                            i6++;
                            yj2 yj2Var = (yj2) obj2;
                            arrayList.add(yj2Var.L);
                            arrayList2.add(yj2Var.R);
                            arrayList3 = arrayList3;
                        }
                        ad6Var2.add(new oy6(i0.R(s8), i0.R(s9), i0.R(s10), arrayList, arrayList2));
                        s6 = i3;
                        s7 = i5;
                        G = list2;
                    }
                }
                ad6 p = ii2.p(ad6Var2);
                lb4.p(i0, null);
                i0 = e36Var.i0("PRAGMA index_list(`" + str + "`)");
                try {
                    int s11 = ej2.s(i0, "name");
                    int s12 = ej2.s(i0, "origin");
                    int s13 = ej2.s(i0, "unique");
                    if (s11 != -1 && s12 != -1 && s13 != -1) {
                        ad6 ad6Var3 = new ad6();
                        while (true) {
                            if (!i0.f0()) {
                                break;
                            } else if ("c".equals(i0.R(s12))) {
                                String R4 = i0.R(s11);
                                if (i0.getLong(s13) == 1) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                py6 H = qo2.H(e36Var, R4, z2);
                                if (H == null) {
                                    lb4.p(i0, null);
                                    ad6Var = null;
                                    break;
                                }
                                ad6Var3.add(H);
                            }
                        }
                    } else {
                        lb4.p(i0, null);
                        ad6Var = null;
                    }
                    return new qy6(str, b2, p, ad6Var);
                } finally {
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } finally {
                }
            }
        } finally {
            try {
                throw th;
            } finally {
            }
        }
    }

    public static vr4 Y(byte[] bArr) {
        if (bArr.length >= 832) {
            int i = bArr[0] & 255;
            int i2 = ((short) (((bArr[1] & 255) << 8) | i)) & 65535;
            if ((1 <= i2 && i2 < 772) || (1 <= i && i < 4)) {
                for (Number number : hf.c0(832, 576, 1088, 1344, 1600, 1856, 2112, 2368)) {
                    int intValue = number.intValue();
                    int i3 = intValue + 256;
                    if (bArr.length >= i3) {
                        byte[] x0 = fv.x0(bArr, intValue, i3);
                        Charset charset = StandardCharsets.UTF_16LE;
                        charset.getClass();
                        String e0 = xs6.e0(qs6.T0(new String(x0, charset)).toString(), "\u0000", "");
                        if (qs6.v0(e0)) {
                            continue;
                        } else {
                            String obj = qs6.T0(xs6.e0(qs6.R0('\n', e0, e0), "\n", " ")).toString();
                            String obj2 = qs6.T0(qs6.O0('\n', e0, "")).toString();
                            if (!qs6.v0(obj)) {
                                return new vr4(obj, obj2);
                            }
                        }
                    }
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public static final gl7 Z(e33 e33Var, px0 px0Var) {
        qh1 qh1Var;
        z40 z40Var;
        xq2 xq2Var = (xq2) px0Var;
        float a2 = ((qh1) xq2Var.j(ky0.h)).a();
        boolean e = xq2Var.e((Float.floatToRawIntBits(a2) & 4294967295L) | (Float.floatToRawIntBits(e33Var.j) << 32));
        Object P = xq2Var.P();
        if (e || P == ox0.a) {
            mu2 mu2Var = new mu2();
            z(mu2Var, e33Var.f);
            float f = e33Var.b;
            float f2 = e33Var.c;
            long floatToRawIntBits = (Float.floatToRawIntBits(qh1Var.e0(f)) << 32) | (Float.floatToRawIntBits(qh1Var.e0(f2)) & 4294967295L);
            float f3 = e33Var.d;
            float f4 = e33Var.e;
            if (Float.isNaN(f3)) {
                f3 = Float.intBitsToFloat((int) (floatToRawIntBits >> 32));
            }
            if (Float.isNaN(f4)) {
                f4 = Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L));
            }
            long floatToRawIntBits2 = (Float.floatToRawIntBits(f3) << 32) | (4294967295L & Float.floatToRawIntBits(f4));
            gl7 gl7Var = new gl7(mu2Var);
            String str = e33Var.a;
            long j = e33Var.g;
            int i = e33Var.h;
            if (j != 16) {
                z40Var = new z40(i, j);
            } else {
                z40Var = null;
            }
            boolean z = e33Var.i;
            gl7Var.X.setValue(new xi6(floatToRawIntBits));
            gl7Var.Y.setValue(Boolean.valueOf(z));
            qk7 qk7Var = gl7Var.Z;
            qk7Var.g.setValue(z40Var);
            qk7Var.i.setValue(new xi6(floatToRawIntBits2));
            qk7Var.c = str;
            xq2Var.l0(gl7Var);
            P = gl7Var;
        }
        return (gl7) P;
    }

    public static final void a(String str, on2 on2Var, px0 px0Var, int i) {
        int i2;
        boolean z;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(225368435);
        if (xq2Var.h(on2Var)) {
            i2 = 32;
        } else {
            i2 = 16;
        }
        int i3 = i2 | i;
        if ((i3 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var.S(i3 & 1, z)) {
            a74 g = u24.g(x64.a, z16.b(14.0f));
            long j = kt0.d;
            a74 P = ge7.P(mb3.u(vy7.L(g, kt0.c(0.22f, j), u24.m), false, null, on2Var, 15), 14.0f, 8.0f);
            e34 d = h70.d(d90.L, false);
            int hashCode = Long.hashCode(xq2Var.T);
            xv4 l = xq2Var.l();
            a74 E = l.E(xq2Var, P);
            jx0.i.getClass();
            iy0 iy0Var = ix0.b;
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(iy0Var);
            } else {
                xq2Var.o0();
            }
            yh2.K(xq2Var, ix0.f, d);
            yh2.K(xq2Var, ix0.e, l);
            yh2.K(xq2Var, ix0.g, Integer.valueOf(hashCode));
            yh2.F(xq2Var, ix0.h);
            yh2.K(xq2Var, ix0.d, E);
            x37.b(str, null, j, hi2.E(12), oj2.e0, qs7.c, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var, 1772934, 0, 130962);
            xq2Var = xq2Var;
            xq2Var.p(true);
        } else {
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new in2(str, on2Var, i, 0);
        }
    }

    public static final long a0(long j) {
        int round = Math.round(Float.intBitsToFloat((int) (j >> 32)));
        return (Math.round(Float.intBitsToFloat((int) (j & 4294967295L))) & 4294967295L) | (round << 32);
    }

    public static final void b(pq5 pq5Var, final String str, on2 on2Var, px0 px0Var, int i) {
        pq5 pq5Var2;
        int i2;
        on2 on2Var2;
        boolean z;
        int i3;
        int i4;
        int i5;
        pq5Var.getClass();
        on2Var.getClass();
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(883584458);
        if ((i & 6) == 0) {
            pq5Var2 = pq5Var;
            if (xq2Var.h(pq5Var2)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            pq5Var2 = pq5Var;
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (xq2Var.f(str)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
            on2Var2 = on2Var;
            if (xq2Var.h(on2Var2)) {
                i3 = 256;
            } else {
                i3 = 128;
            }
            i2 |= i3;
        } else {
            on2Var2 = on2Var;
        }
        if ((i2 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var.S(i2 & 1, z)) {
            final Context context = (Context) xq2Var.j(kf.b);
            Object P = xq2Var.P();
            vs0 vs0Var = ox0.a;
            if (P == vs0Var) {
                P = mb3.w(xq2Var);
                xq2Var.l0(P);
            }
            final w61 w61Var = (w61) P;
            final es7 F = bl2.F(xq2Var);
            Object P2 = xq2Var.P();
            if (P2 == vs0Var) {
                P2 = new rs4(1.0f);
                xq2Var.l0(P2);
            }
            final rs4 rs4Var = (rs4) P2;
            Object P3 = xq2Var.P();
            if (P3 == vs0Var) {
                P3 = np2.Y(new jk4(0L));
                xq2Var.l0(P3);
            }
            final qa4 qa4Var = (qa4) P3;
            Object P4 = xq2Var.P();
            if (P4 == vs0Var) {
                P4 = new l4(4, rs4Var, qa4Var);
                xq2Var.l0(P4);
            }
            fo2 fo2Var = (fo2) P4;
            Object P5 = xq2Var.P();
            if (P5 == vs0Var) {
                P5 = new dr3(fo2Var, 1);
                xq2Var.l0(P5);
            }
            qa4 b0 = np2.b0((go2) P5, xq2Var);
            Object P6 = xq2Var.P();
            if (P6 == vs0Var) {
                ag1 ag1Var = new ag1(new fj(b0, 5));
                xq2Var.l0(ag1Var);
                P6 = ag1Var;
            }
            final ag1 ag1Var2 = (ag1) P6;
            Object P7 = xq2Var.P();
            if (P7 == vs0Var) {
                P7 = np2.Y(Boolean.FALSE);
                xq2Var.l0(P7);
            }
            final qa4 qa4Var2 = (qa4) P7;
            final pq5 pq5Var3 = pq5Var2;
            final on2 on2Var3 = on2Var2;
            nw7.o(on2Var, new jj1(3, false, false), n16.I(1606079699, new eo2() { // from class: gn2
                @Override // defpackage.eo2
                public final Object o(Object obj, Object obj2) {
                    boolean z2;
                    vs0 vs0Var2;
                    jy2 jy2Var;
                    pn pnVar;
                    x64 x64Var;
                    pq5 pq5Var4;
                    ne neVar;
                    pn pnVar2;
                    pn pnVar3;
                    float f;
                    String str2;
                    x64 x64Var2;
                    pn pnVar4;
                    pn pnVar5;
                    gn2 gn2Var;
                    jy2 jy2Var2;
                    long j;
                    qa4 qa4Var3;
                    vs0 vs0Var3;
                    on2 on2Var4;
                    final qa4 qa4Var4;
                    Context context2;
                    boolean h;
                    Object P8;
                    boolean h2;
                    Object P9;
                    px0 px0Var2 = (px0) obj;
                    int intValue = ((Integer) obj2).intValue();
                    if ((intValue & 3) != 2) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    xq2 xq2Var2 = (xq2) px0Var2;
                    if (xq2Var2.S(intValue & 1, z2)) {
                        lc2 lc2Var = dj6.c;
                        long c = kt0.c(0.94f, kt0.b);
                        jy2 jy2Var3 = u24.m;
                        a74 L = vy7.L(lc2Var, c, jy2Var3);
                        Object P10 = xq2Var2.P();
                        qa4 qa4Var5 = qa4.this;
                        vs0 vs0Var4 = ox0.a;
                        if (P10 == vs0Var4) {
                            P10 = new f4(qa4Var5, 21);
                            xq2Var2.l0(P10);
                        }
                        a74 u = mb3.u(L, false, null, (on2) P10, 15);
                        e40 e40Var = d90.Z;
                        e34 d = h70.d(e40Var, false);
                        int hashCode = Long.hashCode(xq2Var2.T);
                        xv4 l = xq2Var2.l();
                        a74 E = l.E(xq2Var2, u);
                        jx0.i.getClass();
                        iy0 iy0Var = ix0.b;
                        xq2Var2.f0();
                        if (xq2Var2.S) {
                            xq2Var2.k(iy0Var);
                        } else {
                            xq2Var2.o0();
                        }
                        pn pnVar6 = ix0.f;
                        yh2.K(xq2Var2, pnVar6, d);
                        pn pnVar7 = ix0.e;
                        yh2.K(xq2Var2, pnVar7, l);
                        Integer valueOf = Integer.valueOf(hashCode);
                        pn pnVar8 = ix0.g;
                        yh2.K(xq2Var2, pnVar8, valueOf);
                        ne neVar2 = ix0.h;
                        yh2.F(xq2Var2, neVar2);
                        pn pnVar9 = ix0.d;
                        yh2.K(xq2Var2, pnVar9, E);
                        vs0 vs0Var5 = vs0.Y;
                        rs4 rs4Var2 = rs4Var;
                        float h3 = rs4Var2.h();
                        float h4 = rs4Var2.h();
                        qa4 qa4Var6 = qa4Var;
                        a74 K = lb4.K(hv.I(lc2Var, h3, h4, RecyclerView.B1, Float.intBitsToFloat((int) (((jk4) qa4Var6.getValue()).a >> 32)), Float.intBitsToFloat((int) (((jk4) qa4Var6.getValue()).a & 4294967295L)), null, 524260), ag1Var2);
                        e34 d2 = h70.d(e40Var, false);
                        int hashCode2 = Long.hashCode(xq2Var2.T);
                        xv4 l2 = xq2Var2.l();
                        a74 E2 = l.E(xq2Var2, K);
                        xq2Var2.f0();
                        if (xq2Var2.S) {
                            xq2Var2.k(iy0Var);
                        } else {
                            xq2Var2.o0();
                        }
                        yh2.K(xq2Var2, pnVar6, d2);
                        yh2.K(xq2Var2, pnVar7, l2);
                        i61.w(hashCode2, xq2Var2, pnVar8, xq2Var2, neVar2);
                        yh2.K(xq2Var2, pnVar9, E2);
                        String str3 = str;
                        final Context context3 = context;
                        pq5 pq5Var5 = pq5Var3;
                        w31 w31Var = y31.b;
                        x64 x64Var3 = x64.a;
                        if (str3 != null) {
                            xq2Var2.b0(439972841);
                            vs0Var2 = vs0Var4;
                            jy2Var = jy2Var3;
                            pnVar = pnVar9;
                            pnVar2 = pnVar7;
                            pnVar3 = pnVar6;
                            pq5Var4 = pq5Var5;
                            x64Var = x64Var3;
                            neVar = neVar2;
                            f = 20.0f;
                            gi2.b(str3, null, u24.g(dj6.c(x64Var3, 0.85f), z16.b(16.0f)), w31Var, RecyclerView.B1, xq2Var2, 1572912, 4024);
                            xq2Var2.p(false);
                            str2 = str3;
                        } else {
                            vs0Var2 = vs0Var4;
                            jy2Var = jy2Var3;
                            pnVar = pnVar9;
                            x64Var = x64Var3;
                            pq5Var4 = pq5Var5;
                            neVar = neVar2;
                            pnVar2 = pnVar7;
                            pnVar3 = pnVar6;
                            f = 20.0f;
                            xq2Var2.b0(440356001);
                            str2 = str3;
                            gi2.b(hf.m0(context3, pq5Var4), null, u24.g(dj6.i(x64Var, 240.0f), z16.b(20.0f)), w31Var, RecyclerView.B1, xq2Var2, 1572912, 3512);
                            xq2Var2.p(false);
                        }
                        xq2Var2.p(true);
                        a74 P11 = ge7.P(vs0Var5.n(dj6.c(x64Var, 1.0f), d90.R), 16.0f, 24.0f);
                        d40 d40Var = d90.i0;
                        l26 a2 = k26.a(ju.e, d40Var, xq2Var2, 54);
                        int hashCode3 = Long.hashCode(xq2Var2.T);
                        xv4 l3 = xq2Var2.l();
                        a74 E3 = l.E(xq2Var2, P11);
                        xq2Var2.f0();
                        if (xq2Var2.S) {
                            xq2Var2.k(iy0Var);
                        } else {
                            xq2Var2.o0();
                        }
                        yh2.K(xq2Var2, pnVar3, a2);
                        yh2.K(xq2Var2, pnVar2, l3);
                        i61.w(hashCode3, xq2Var2, pnVar8, xq2Var2, neVar);
                        yh2.K(xq2Var2, pnVar, E3);
                        String k0 = hf.k0(pq5Var4);
                        long j2 = kt0.d;
                        pi2 pi2Var = qs7.a;
                        long E4 = hi2.E(17);
                        oj2 oj2Var = oj2.e0;
                        final pq5 pq5Var6 = pq5Var4;
                        pn pnVar10 = pnVar;
                        ne neVar3 = neVar;
                        x37.b(k0, ge7.S(new vn3(1.0f, true), RecyclerView.B1, RecyclerView.B1, 12.0f, RecyclerView.B1, 11), j2, E4, oj2Var, pi2Var, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var2, 1772928, 0, 130960);
                        jy2 jy2Var4 = jy2Var;
                        ej2.b(on2Var3, vy7.L(u24.g(dj6.i(x64Var, 40.0f), z16.b(12.0f)), kt0.c(0.15f, j2), jy2Var4), false, nb3.j, xq2Var2, 24576, 12);
                        xq2Var2.p(true);
                        a74 S = ge7.S(vs0Var5.n(x64Var, d90.f0), RecyclerView.B1, RecyclerView.B1, RecyclerView.B1, 36.0f, 7);
                        yt0 a3 = wt0.a(ju.c, d90.l0, xq2Var2, 48);
                        int hashCode4 = Long.hashCode(xq2Var2.T);
                        xv4 l4 = xq2Var2.l();
                        a74 E5 = l.E(xq2Var2, S);
                        xq2Var2.f0();
                        if (xq2Var2.S) {
                            xq2Var2.k(iy0Var);
                        } else {
                            xq2Var2.o0();
                        }
                        yh2.K(xq2Var2, pnVar3, a3);
                        yh2.K(xq2Var2, pnVar2, l4);
                        i61.w(hashCode4, xq2Var2, pnVar8, xq2Var2, neVar3);
                        yh2.K(xq2Var2, pnVar10, E5);
                        if (((Boolean) qa4Var5.getValue()).booleanValue()) {
                            xq2Var2.b0(-2065877293);
                            gu guVar = new gu(10.0f, true, new i(1));
                            x64 x64Var4 = x64Var;
                            a74 S2 = ge7.S(x64Var4, RecyclerView.B1, RecyclerView.B1, RecyclerView.B1, 12.0f, 7);
                            x64Var2 = x64Var4;
                            l26 a4 = k26.a(guVar, d90.h0, xq2Var2, 6);
                            int hashCode5 = Long.hashCode(xq2Var2.T);
                            xv4 l5 = xq2Var2.l();
                            a74 E6 = l.E(xq2Var2, S2);
                            xq2Var2.f0();
                            if (xq2Var2.S) {
                                xq2Var2.k(iy0Var);
                            } else {
                                xq2Var2.o0();
                            }
                            yh2.K(xq2Var2, pnVar3, a4);
                            yh2.K(xq2Var2, pnVar2, l5);
                            i61.w(hashCode5, xq2Var2, pnVar8, xq2Var2, neVar3);
                            yh2.K(xq2Var2, pnVar10, E6);
                            jy2Var2 = jy2Var4;
                            final w61 w61Var2 = w61Var;
                            final String str4 = str2;
                            boolean h5 = xq2Var2.h(w61Var2) | xq2Var2.h(context3) | xq2Var2.f(str4) | xq2Var2.h(pq5Var6);
                            Object P12 = xq2Var2.P();
                            if (!h5) {
                                vs0Var3 = vs0Var2;
                                if (P12 != vs0Var3) {
                                    context2 = context3;
                                    gn2Var = this;
                                    on2Var4 = P12;
                                    j = j2;
                                    qa4Var4 = qa4Var5;
                                    pnVar5 = pnVar10;
                                    pnVar4 = pnVar8;
                                    kn2.a("PNG", on2Var4, xq2Var2, 6);
                                    h = xq2Var2.h(w61Var2) | xq2Var2.h(context2) | xq2Var2.f(str4) | xq2Var2.h(pq5Var6);
                                    P8 = xq2Var2.P();
                                    if (!h || P8 == vs0Var3) {
                                        final Context context4 = context2;
                                        on2 on2Var5 = new on2() { // from class: hn2
                                            @Override // defpackage.on2
                                            public final Object c() {
                                                Bitmap.CompressFormat compressFormat;
                                                int i6 = r6;
                                                jg7 jg7Var = jg7.a;
                                                switch (i6) {
                                                    case 0:
                                                        kn2.c(w61Var2, context4, str4, pq5Var6, qa4Var4, Bitmap.CompressFormat.PNG, "png", "image/png");
                                                        return jg7Var;
                                                    case 1:
                                                        kn2.c(w61Var2, context4, str4, pq5Var6, qa4Var4, Bitmap.CompressFormat.JPEG, "jpg", "image/jpeg");
                                                        return jg7Var;
                                                    default:
                                                        if (Build.VERSION.SDK_INT >= 30) {
                                                            compressFormat = Bitmap.CompressFormat.WEBP_LOSSLESS;
                                                        } else {
                                                            compressFormat = Bitmap.CompressFormat.WEBP;
                                                        }
                                                        kn2.c(w61Var2, context4, str4, pq5Var6, qa4Var4, compressFormat, "webp", "image/webp");
                                                        return jg7Var;
                                                }
                                            }
                                        };
                                        xq2Var2.l0(on2Var5);
                                        P8 = on2Var5;
                                    }
                                    kn2.a("JPG", (on2) P8, xq2Var2, 6);
                                    h2 = xq2Var2.h(w61Var2) | xq2Var2.h(context2) | xq2Var2.f(str4) | xq2Var2.h(pq5Var6);
                                    P9 = xq2Var2.P();
                                    if (h2 && P9 != vs0Var3) {
                                        qa4Var3 = qa4Var4;
                                    } else {
                                        final Context context5 = context2;
                                        on2 on2Var6 = new on2() { // from class: hn2
                                            @Override // defpackage.on2
                                            public final Object c() {
                                                Bitmap.CompressFormat compressFormat;
                                                int i6 = r6;
                                                jg7 jg7Var = jg7.a;
                                                switch (i6) {
                                                    case 0:
                                                        kn2.c(w61Var2, context5, str4, pq5Var6, qa4Var4, Bitmap.CompressFormat.PNG, "png", "image/png");
                                                        return jg7Var;
                                                    case 1:
                                                        kn2.c(w61Var2, context5, str4, pq5Var6, qa4Var4, Bitmap.CompressFormat.JPEG, "jpg", "image/jpeg");
                                                        return jg7Var;
                                                    default:
                                                        if (Build.VERSION.SDK_INT >= 30) {
                                                            compressFormat = Bitmap.CompressFormat.WEBP_LOSSLESS;
                                                        } else {
                                                            compressFormat = Bitmap.CompressFormat.WEBP;
                                                        }
                                                        kn2.c(w61Var2, context5, str4, pq5Var6, qa4Var4, compressFormat, "webp", "image/webp");
                                                        return jg7Var;
                                                }
                                            }
                                        };
                                        qa4Var3 = qa4Var4;
                                        xq2Var2.l0(on2Var6);
                                        P9 = on2Var6;
                                    }
                                    kn2.a("WEBP", (on2) P9, xq2Var2, 6);
                                    xq2Var2.p(true);
                                    xq2Var2.p(false);
                                }
                            } else {
                                vs0Var3 = vs0Var2;
                            }
                            j = j2;
                            qa4Var4 = qa4Var5;
                            gn2Var = this;
                            on2Var4 = new on2() { // from class: hn2
                                @Override // defpackage.on2
                                public final Object c() {
                                    Bitmap.CompressFormat compressFormat;
                                    int i6 = r6;
                                    jg7 jg7Var = jg7.a;
                                    switch (i6) {
                                        case 0:
                                            kn2.c(w61Var2, context3, str4, pq5Var6, qa4Var4, Bitmap.CompressFormat.PNG, "png", "image/png");
                                            return jg7Var;
                                        case 1:
                                            kn2.c(w61Var2, context3, str4, pq5Var6, qa4Var4, Bitmap.CompressFormat.JPEG, "jpg", "image/jpeg");
                                            return jg7Var;
                                        default:
                                            if (Build.VERSION.SDK_INT >= 30) {
                                                compressFormat = Bitmap.CompressFormat.WEBP_LOSSLESS;
                                            } else {
                                                compressFormat = Bitmap.CompressFormat.WEBP;
                                            }
                                            kn2.c(w61Var2, context3, str4, pq5Var6, qa4Var4, compressFormat, "webp", "image/webp");
                                            return jg7Var;
                                    }
                                }
                            };
                            context2 = context3;
                            xq2Var2.l0(on2Var4);
                            pnVar5 = pnVar10;
                            pnVar4 = pnVar8;
                            kn2.a("PNG", on2Var4, xq2Var2, 6);
                            h = xq2Var2.h(w61Var2) | xq2Var2.h(context2) | xq2Var2.f(str4) | xq2Var2.h(pq5Var6);
                            P8 = xq2Var2.P();
                            if (!h) {
                            }
                            final Context context42 = context2;
                            on2 on2Var52 = new on2() { // from class: hn2
                                @Override // defpackage.on2
                                public final Object c() {
                                    Bitmap.CompressFormat compressFormat;
                                    int i6 = r6;
                                    jg7 jg7Var = jg7.a;
                                    switch (i6) {
                                        case 0:
                                            kn2.c(w61Var2, context42, str4, pq5Var6, qa4Var4, Bitmap.CompressFormat.PNG, "png", "image/png");
                                            return jg7Var;
                                        case 1:
                                            kn2.c(w61Var2, context42, str4, pq5Var6, qa4Var4, Bitmap.CompressFormat.JPEG, "jpg", "image/jpeg");
                                            return jg7Var;
                                        default:
                                            if (Build.VERSION.SDK_INT >= 30) {
                                                compressFormat = Bitmap.CompressFormat.WEBP_LOSSLESS;
                                            } else {
                                                compressFormat = Bitmap.CompressFormat.WEBP;
                                            }
                                            kn2.c(w61Var2, context42, str4, pq5Var6, qa4Var4, compressFormat, "webp", "image/webp");
                                            return jg7Var;
                                    }
                                }
                            };
                            xq2Var2.l0(on2Var52);
                            P8 = on2Var52;
                            kn2.a("JPG", (on2) P8, xq2Var2, 6);
                            h2 = xq2Var2.h(w61Var2) | xq2Var2.h(context2) | xq2Var2.f(str4) | xq2Var2.h(pq5Var6);
                            P9 = xq2Var2.P();
                            if (h2) {
                            }
                            final Context context52 = context2;
                            on2 on2Var62 = new on2() { // from class: hn2
                                @Override // defpackage.on2
                                public final Object c() {
                                    Bitmap.CompressFormat compressFormat;
                                    int i6 = r6;
                                    jg7 jg7Var = jg7.a;
                                    switch (i6) {
                                        case 0:
                                            kn2.c(w61Var2, context52, str4, pq5Var6, qa4Var4, Bitmap.CompressFormat.PNG, "png", "image/png");
                                            return jg7Var;
                                        case 1:
                                            kn2.c(w61Var2, context52, str4, pq5Var6, qa4Var4, Bitmap.CompressFormat.JPEG, "jpg", "image/jpeg");
                                            return jg7Var;
                                        default:
                                            if (Build.VERSION.SDK_INT >= 30) {
                                                compressFormat = Bitmap.CompressFormat.WEBP_LOSSLESS;
                                            } else {
                                                compressFormat = Bitmap.CompressFormat.WEBP;
                                            }
                                            kn2.c(w61Var2, context52, str4, pq5Var6, qa4Var4, compressFormat, "webp", "image/webp");
                                            return jg7Var;
                                    }
                                }
                            };
                            qa4Var3 = qa4Var4;
                            xq2Var2.l0(on2Var62);
                            P9 = on2Var62;
                            kn2.a("WEBP", (on2) P9, xq2Var2, 6);
                            xq2Var2.p(true);
                            xq2Var2.p(false);
                        } else {
                            x64Var2 = x64Var;
                            pnVar4 = pnVar8;
                            pnVar5 = pnVar10;
                            gn2Var = this;
                            jy2Var2 = jy2Var4;
                            j = j2;
                            qa4Var3 = qa4Var5;
                            vs0Var3 = vs0Var2;
                            xq2Var2.b0(-2065006069);
                            xq2Var2.p(false);
                        }
                        a74 L2 = vy7.L(u24.g(x64Var2, z16.b(24.0f)), F.j, jy2Var2);
                        Object P13 = xq2Var2.P();
                        if (P13 == vs0Var3) {
                            P13 = new f4(qa4Var3, 22);
                            xq2Var2.l0(P13);
                        }
                        a74 P14 = ge7.P(mb3.u(L2, false, null, (on2) P13, 15), f, 12.0f);
                        l26 a5 = k26.a(new gu(8.0f, true, new i(1)), d40Var, xq2Var2, 54);
                        int hashCode6 = Long.hashCode(xq2Var2.T);
                        xv4 l6 = xq2Var2.l();
                        a74 E7 = l.E(xq2Var2, P14);
                        xq2Var2.f0();
                        if (xq2Var2.S) {
                            xq2Var2.k(iy0Var);
                        } else {
                            xq2Var2.o0();
                        }
                        yh2.K(xq2Var2, pnVar3, a5);
                        yh2.K(xq2Var2, pnVar2, l6);
                        i61.w(hashCode6, xq2Var2, pnVar4, xq2Var2, neVar3);
                        yh2.K(xq2Var2, pnVar5, E7);
                        long j3 = j;
                        i13.a(q60.E(), null, dj6.i(x64Var2, 18.0f), j3, xq2Var2, 3504, 0);
                        x37.b("СОХРАНИТЬ ОБЛОЖКУ", null, j3, hi2.E(12), oj2Var, qs7.c, hi2.D(0.5d), null, 0L, 0, false, 0, 0, null, null, xq2Var2, 14355846, 0, 130834);
                        i61.y(xq2Var2, true, true, true);
                    } else {
                        xq2Var2.V();
                    }
                    return jg7.a;
                }
            }, xq2Var), xq2Var, ((i2 >> 6) & 14) | 432, 0);
        } else {
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new rl(pq5Var, str, on2Var, i, 11);
        }
    }

    public static void b0(InputStream inputStream, long j) {
        byte[] bArr = new byte[1024];
        do {
            int read = inputStream.read(bArr, 0, (int) Math.min(j, 1024L));
            if (read > 0) {
                j -= read;
            } else {
                return;
            }
        } while (j > 0);
    }

    public static final void c(w61 w61Var, Context context, String str, pq5 pq5Var, qa4 qa4Var, Bitmap.CompressFormat compressFormat, String str2, String str3) {
        xe1 xe1Var = xk1.a;
        hv.L(w61Var, de1.L, null, new ja1(context, str, pq5Var, str2, str3, compressFormat, qa4Var, null, 5), 2);
    }

    public static final long c0(long j, long j2) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j2 & 4294967295L)) * Float.intBitsToFloat((int) (j & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 >> 32)) * intBitsToFloat) << 32);
    }

    public static final void d(final fk3 fk3Var, on2 on2Var, go2 go2Var, px0 px0Var, int i) {
        int i2;
        int i3;
        int i4;
        boolean z;
        on2Var.getClass();
        go2Var.getClass();
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(559938776);
        if (xq2Var.h(fk3Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i5 = i | i2;
        if (xq2Var.h(on2Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i6 = i5 | i3;
        if (xq2Var.h(go2Var)) {
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
        if (xq2Var.S(i7 & 1, z)) {
            String O = yh2.O(xq2Var, R.string.custom_layout_default_name);
            Object[] objArr = {fk3Var.b};
            boolean h = xq2Var.h(fk3Var);
            Object P = xq2Var.P();
            Object obj = ox0.a;
            if (h || P == obj) {
                P = new on2() { // from class: in3
                    @Override // defpackage.on2
                    public final Object c() {
                        int i8 = r2;
                        fk3 fk3Var2 = fk3Var;
                        switch (i8) {
                            case 0:
                                return np2.Y(fk3Var2.b);
                            case 1:
                                return np2.Y(fk3Var2.d);
                            case 2:
                                return np2.Y(Boolean.valueOf(fk3Var2.e));
                            default:
                                return new rs4(fk3Var2.f);
                        }
                    }
                };
                xq2Var.l0(P);
            }
            qa4 qa4Var = (qa4) qo2.I(objArr, (on2) P, xq2Var, 0);
            Object[] objArr2 = {fk3Var.d};
            boolean h2 = xq2Var.h(fk3Var);
            Object P2 = xq2Var.P();
            if (h2 || P2 == obj) {
                P2 = new on2() { // from class: in3
                    @Override // defpackage.on2
                    public final Object c() {
                        int i8 = r2;
                        fk3 fk3Var2 = fk3Var;
                        switch (i8) {
                            case 0:
                                return np2.Y(fk3Var2.b);
                            case 1:
                                return np2.Y(fk3Var2.d);
                            case 2:
                                return np2.Y(Boolean.valueOf(fk3Var2.e));
                            default:
                                return new rs4(fk3Var2.f);
                        }
                    }
                };
                xq2Var.l0(P2);
            }
            qa4 qa4Var2 = (qa4) qo2.I(objArr2, (on2) P2, xq2Var, 0);
            Object[] objArr3 = {Boolean.valueOf(fk3Var.e)};
            boolean h3 = xq2Var.h(fk3Var);
            Object P3 = xq2Var.P();
            if (h3 || P3 == obj) {
                P3 = new on2() { // from class: in3
                    @Override // defpackage.on2
                    public final Object c() {
                        int i8 = r2;
                        fk3 fk3Var2 = fk3Var;
                        switch (i8) {
                            case 0:
                                return np2.Y(fk3Var2.b);
                            case 1:
                                return np2.Y(fk3Var2.d);
                            case 2:
                                return np2.Y(Boolean.valueOf(fk3Var2.e));
                            default:
                                return new rs4(fk3Var2.f);
                        }
                    }
                };
                xq2Var.l0(P3);
            }
            qa4 qa4Var3 = (qa4) qo2.I(objArr3, (on2) P3, xq2Var, 0);
            Object[] objArr4 = {Integer.valueOf(fk3Var.f)};
            boolean h4 = xq2Var.h(fk3Var);
            Object P4 = xq2Var.P();
            if (h4 || P4 == obj) {
                P4 = new on2() { // from class: in3
                    @Override // defpackage.on2
                    public final Object c() {
                        int i8 = r2;
                        fk3 fk3Var2 = fk3Var;
                        switch (i8) {
                            case 0:
                                return np2.Y(fk3Var2.b);
                            case 1:
                                return np2.Y(fk3Var2.d);
                            case 2:
                                return np2.Y(Boolean.valueOf(fk3Var2.e));
                            default:
                                return new rs4(fk3Var2.f);
                        }
                    }
                };
                xq2Var.l0(P4);
            }
            rs4 rs4Var = (rs4) qo2.I(objArr4, (on2) P4, xq2Var, 0);
            j37 T = mp2.T(xq2Var);
            Object[] objArr5 = new Object[0];
            Object P5 = xq2Var.P();
            if (P5 == obj) {
                P5 = new pi3(1);
                xq2Var.l0(P5);
            }
            qa4 qa4Var4 = (qa4) qo2.I(objArr5, (on2) P5, xq2Var, 48);
            String[] M = yh2.M(xq2Var, R.array.layout_orientation_options);
            q60.a(yh2.O(xq2Var, R.string.properties), on2Var, n16.I(1972798883, new ln3(T, qa4Var, O, M, qa4Var2, qa4Var3, rs4Var), xq2Var), n16.I(-127883039, new c4(on2Var, go2Var, qa4Var, qa4Var2, qa4Var3, rs4Var), xq2Var), false, xq2Var, (i7 & 112) | 3456, 16);
            String O2 = yh2.O(xq2Var, R.string.layout_name);
            Object P6 = xq2Var.P();
            if (P6 == obj) {
                P6 = new v83(8);
                xq2Var.l0(P6);
            }
            mp2.e(O2, T, (qn2) P6, null, xq2Var, RendererDebugBridge.CAPTURE_HEIGHT, 8);
            xq2Var = xq2Var;
            if (((Boolean) qa4Var4.getValue()).booleanValue()) {
                xq2Var.b0(-513244900);
                String O3 = yh2.O(xq2Var, R.string.layout_orientation);
                boolean f = xq2Var.f(qa4Var4);
                Object P7 = xq2Var.P();
                if (f || P7 == obj) {
                    P7 = new f4(qa4Var4, 23);
                    xq2Var.l0(P7);
                }
                q60.a(O3, (on2) P7, n16.I(1554765950, new m4(qa4Var2, qa4Var4, M), xq2Var), n16.I(-1094089156, new e4(qa4Var4, 4), xq2Var), false, xq2Var, 3456, 16);
                xq2Var.p(false);
            } else {
                xq2Var.b0(-511355574);
                xq2Var.p(false);
            }
        } else {
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new x3(fk3Var, on2Var, go2Var, i, 20);
        }
    }

    public static String d0(sw2 sw2Var) {
        int i = cs6.a[sw2Var.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return "HmacSha512";
                }
                throw new NoSuchAlgorithmException("hash unsupported for HMAC: " + sw2Var);
            }
            return "HmacSha256";
        }
        return "HmacSha1";
    }

    public static final void e(on2 on2Var, a74 a74Var, pq3 pq3Var, eq3 eq3Var, px0 px0Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(1055276397);
        if (xq2Var.h(on2Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i6 = i2 | i;
        if (xq2Var.f(a74Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i7 = i6 | i3;
        if (xq2Var.f(pq3Var)) {
            i4 = 256;
        } else {
            i4 = 128;
        }
        int i8 = i7 | i4;
        if (xq2Var.f(eq3Var)) {
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
        if (xq2Var.S(i9 & 1, z)) {
            gi2.g(n16.I(-933153643, new dq3(pq3Var, a74Var, eq3Var, np2.b0(on2Var, xq2Var), 0), xq2Var), xq2Var, 6);
        } else {
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new p4(on2Var, a74Var, pq3Var, eq3Var, i, 8);
        }
    }

    public static final void f(sb4 sb4Var, o46 o46Var, zv0 zv0Var, px0 px0Var, int i) {
        int i2;
        int i3;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(233973821);
        if (xq2Var.h(sb4Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i2 | i;
        if (xq2Var.h(o46Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        if (((i4 | i3) & 147) == 146 && xq2Var.E()) {
            xq2Var.V();
        } else {
            hv.e(new pq[]{ey3.a.a(sb4Var), zx3.a.a(sb4Var), dy3.a.a(sb4Var)}, n16.I(1808964477, new dj1(1, o46Var, zv0Var), xq2Var), xq2Var, 56);
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new x3(sb4Var, o46Var, zv0Var, i, 23);
        }
    }

    public static final void g(o46 o46Var, zv0 zv0Var, px0 px0Var, int i) {
        int i2;
        int i3;
        j71 j71Var;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(832919318);
        if (xq2Var.h(o46Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i2 | i;
        if (xq2Var.h(zv0Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i5 = i4 | i3;
        if ((i5 & 19) == 18 && xq2Var.E()) {
            xq2Var.V();
        } else {
            Object P = xq2Var.P();
            if (P == ox0.a) {
                P = new x84(2);
                xq2Var.l0(P);
            }
            qn2 qn2Var = (qn2) P;
            bp7 a2 = ey3.a(xq2Var);
            if (a2 != null) {
                ar0 a3 = gh5.a(k00.class);
                wb1 wb1Var = new wb1(2, (byte) 0);
                wb1Var.b(gh5.a(k00.class), qn2Var);
                m9 d = wb1Var.d();
                if (a2 instanceof mw2) {
                    j71Var = ((mw2) a2).getDefaultViewModelCreationExtras();
                } else {
                    j71Var = h71.b;
                }
                k00 k00Var = (k00) nj2.G(a3, a2, d, j71Var, xq2Var);
                k00Var.c = new j97(o46Var);
                o46Var.b(k00Var.b, zv0Var, xq2Var, ((i5 << 6) & 896) | (i5 & 112));
            } else {
                i.m("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new ql1(o46Var, i, 25, zv0Var);
        }
    }

    public static final xa6 h(sm3 sm3Var, boolean z) {
        z64 z64Var = (z64) sm3Var.B0.g;
        va6 va6Var = null;
        if ((z64Var.R & 8) != 0) {
            loop0: while (true) {
                if (z64Var == null) {
                    break;
                }
                if ((z64Var.L & 8) != 0) {
                    z64 z64Var2 = z64Var;
                    ua4 ua4Var = null;
                    while (z64Var2 != null) {
                        if (z64Var2 instanceof va6) {
                            va6Var = z64Var2;
                            break loop0;
                        }
                        if ((z64Var2.L & 8) != 0 && (z64Var2 instanceof zg1)) {
                            int i = 0;
                            for (z64 z64Var3 = ((zg1) z64Var2).l0; z64Var3 != null; z64Var3 = z64Var3.Y) {
                                if ((z64Var3.L & 8) != 0) {
                                    i++;
                                    if (i == 1) {
                                        z64Var2 = z64Var3;
                                    } else {
                                        if (ua4Var == null) {
                                            ua4Var = new ua4(new z64[16]);
                                        }
                                        if (z64Var2 != null) {
                                            ua4Var.b(z64Var2);
                                            z64Var2 = null;
                                        }
                                        ua4Var.b(z64Var3);
                                    }
                                }
                            }
                            if (i == 1) {
                            }
                        }
                        z64Var2 = nc1.A(ua4Var);
                    }
                }
                if ((z64Var.R & 8) == 0) {
                    break;
                }
                z64Var = z64Var.Y;
            }
        }
        va6Var.getClass();
        z64 z64Var4 = ((z64) va6Var).A;
        ta6 x = sm3Var.x();
        if (x == null) {
            x = new ta6();
        }
        return new xa6(z64Var4, z, sm3Var, x);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, ah5] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object i(p76 p76Var, float f, uo uoVar, oc1 oc1Var, qn2 qn2Var, s41 s41Var) {
        sl6 sl6Var;
        int i;
        boolean z;
        float f2;
        ah5 ah5Var;
        if (s41Var instanceof sl6) {
            sl6 sl6Var2 = (sl6) s41Var;
            int i2 = sl6Var2.d0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sl6Var2.d0 = i2 - Integer.MIN_VALUE;
                sl6Var = sl6Var2;
                Object obj = sl6Var.Z;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = sl6Var.d0;
                if (i == 0) {
                    if (i == 1) {
                        f2 = sl6Var.R;
                        ah5Var = sl6Var.Y;
                        uoVar = sl6Var.X;
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    ?? obj2 = new Object();
                    if (((Number) uoVar.a()).floatValue() == RecyclerView.B1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    rl6 rl6Var = new rl6(f, obj2, p76Var, qn2Var, 0);
                    sl6Var.X = uoVar;
                    sl6Var.Y = obj2;
                    sl6Var.R = f;
                    sl6Var.d0 = 1;
                    if (kj2.m(uoVar, oc1Var, !z, rl6Var, sl6Var) == x61Var) {
                        return x61Var;
                    }
                    f2 = f;
                    ah5Var = obj2;
                }
                return new qo(new Float(f2 - ah5Var.A), uoVar);
            }
        }
        sl6Var = new s41(s41Var);
        Object obj3 = sl6Var.Z;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = sl6Var.d0;
        if (i == 0) {
        }
        return new qo(new Float(f2 - ah5Var.A), uoVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, ah5] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object j(p76 p76Var, float f, float f2, uo uoVar, io6 io6Var, qn2 qn2Var, s41 s41Var) {
        tl6 tl6Var;
        int i;
        float floatValue;
        boolean z;
        uo uoVar2;
        ah5 ah5Var;
        float f3 = f;
        if (s41Var instanceof tl6) {
            tl6 tl6Var2 = (tl6) s41Var;
            int i2 = tl6Var2.e0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tl6Var2.e0 = i2 - Integer.MIN_VALUE;
                tl6Var = tl6Var2;
                tl6 tl6Var3 = tl6Var;
                Object obj = tl6Var3.d0;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = tl6Var3.e0;
                if (i == 0) {
                    if (i == 1) {
                        float f4 = tl6Var3.X;
                        float f5 = tl6Var3.R;
                        ah5Var = tl6Var3.Z;
                        uoVar2 = tl6Var3.Y;
                        oi2.Y(obj);
                        floatValue = f4;
                        f3 = f5;
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    ?? obj2 = new Object();
                    floatValue = ((Number) uoVar.a()).floatValue();
                    Float f6 = new Float(f3);
                    if (((Number) uoVar.a()).floatValue() == RecyclerView.B1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    rl6 rl6Var = new rl6(f2, obj2, p76Var, qn2Var, 1);
                    tl6Var3.Y = uoVar;
                    tl6Var3.Z = obj2;
                    tl6Var3.R = f3;
                    tl6Var3.X = floatValue;
                    tl6Var3.e0 = 1;
                    if (kj2.n(uoVar, f6, io6Var, !z, rl6Var, tl6Var3) == x61Var) {
                        return x61Var;
                    }
                    uoVar2 = uoVar;
                    ah5Var = obj2;
                }
                return new qo(new Float(f3 - ah5Var.A), ak7.O(uoVar2, RecyclerView.B1, v(((Number) uoVar2.a()).floatValue(), floatValue), 29));
            }
        }
        tl6Var = new s41(s41Var);
        tl6 tl6Var32 = tl6Var;
        Object obj3 = tl6Var32.d0;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = tl6Var32.e0;
        if (i == 0) {
        }
        return new qo(new Float(f3 - ah5Var.A), ak7.O(uoVar2, RecyclerView.B1, v(((Number) uoVar2.a()).floatValue(), floatValue), 29));
    }

    public static final n14 k(Matcher matcher, int i, CharSequence charSequence) {
        if (!matcher.find(i)) {
            return null;
        }
        return new n14(matcher, charSequence);
    }

    public static final int l(jt3 jt3Var, long j, fo7 fo7Var) {
        long N;
        int F;
        b47 d = jt3Var.d();
        if (d != null) {
            v84 v84Var = d.a.b;
            jk3 c = jt3Var.c();
            if (c != null && (F = F(v84Var, (N = c.N(j)), fo7Var)) != -1) {
                return v84Var.g(jk4.a(N, (v84Var.b(F) + v84Var.f(F)) / 2.0f, 1));
            }
        }
        return -1;
    }

    public static final long m(jt3 jt3Var, of5 of5Var, of5 of5Var2, int i) {
        long H = H(jt3Var, of5Var, i);
        if (k47.c(H)) {
            return k47.b;
        }
        long H2 = H(jt3Var, of5Var2, i);
        if (k47.c(H2)) {
            return k47.b;
        }
        int i2 = (int) (H >> 32);
        int i3 = (int) (H2 & 4294967295L);
        return jx2.f(Math.min(i2, i2), Math.max(i3, i3));
    }

    public static final boolean n(a47 a47Var, int i) {
        v84 v84Var = a47Var.b;
        int d = v84Var.d(i);
        if (i == a47Var.g(d) || i == v84Var.c(d, false) ? a47Var.h(i) != a47Var.a(i) : a47Var.a(i) != a47Var.a(i - 1)) {
            return true;
        }
        return false;
    }

    public static final of5 o(gf6 gf6Var, cf6 cf6Var) {
        if (cf6Var != null) {
            List b2 = gf6Var.b();
            int size = b2.size();
            for (int i = 0; i < size; i++) {
                if (nb3.k(((if6) b2.get(i)).h0, cf6Var)) {
                    if (cf6Var.j0) {
                        if (!cf6Var.l0) {
                            return cf6Var.k0;
                        }
                        return kj2.b(jk3.i(cf6Var.S0(), nc1.e0(cf6Var), 6), qo2.S(nc1.e0(cf6Var).L));
                    }
                    return null;
                }
            }
            return null;
        }
        return null;
    }

    public static final long p(PointF pointF) {
        return (Float.floatToRawIntBits(pointF.x) << 32) | (Float.floatToRawIntBits(pointF.y) & 4294967295L);
    }

    public static final void q(eb ebVar, long j, long j2, long j3, boolean z) {
        vs4 vs4Var = (vs4) ebVar.L;
        vs4 vs4Var2 = (vs4) ebVar.X;
        vs4 vs4Var3 = (vs4) ebVar.B;
        vs4 vs4Var4 = (vs4) ebVar.R;
        if (!jk4.c(((jk4) vs4Var4.getValue()).a, j3) || !xi6.b(((xi6) vs4Var3.getValue()).a, j) || z) {
            vs4Var3.setValue(new xi6(j));
            vs4Var4.setValue(new jk4(j3));
            if (z) {
                vs4Var.setValue(new jk4(jk4.e(jk4.e(j2, j3), jk4.e(((jk4) vs4Var2.getValue()).a, ((jk4) vs4Var.getValue()).a))));
            }
        }
        vs4Var2.setValue(new jk4(jk4.e(j2, j3)));
    }

    public static final void r(so soVar, p76 p76Var, qn2 qn2Var, float f) {
        float f2;
        try {
            f2 = p76Var.a(f);
        } catch (CancellationException unused) {
            soVar.a();
            f2 = RecyclerView.B1;
        }
        qn2Var.g(Float.valueOf(f2));
        if (Math.abs(f - f2) > 0.5f) {
            soVar.a();
        }
    }

    public static float s(float[] fArr) {
        if (fArr.length < 6) {
            return RecyclerView.B1;
        }
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = (((((f3 * f6) + ((f2 * f5) + (f * f4))) - (f4 * f5)) - (f2 * f3)) - (f * f6)) * 0.5f;
        if (f7 < RecyclerView.B1) {
            return -f7;
        }
        return f7;
    }

    public static int t(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public static final void u(int i) {
        if (i >= 1) {
            return;
        }
        i.f(lb1.g(i, "Expected positive parallelism level, but got "));
    }

    public static final float v(float f, float f2) {
        if (f2 == RecyclerView.B1) {
            return RecyclerView.B1;
        }
        if (f2 <= RecyclerView.B1 ? f < f2 : f > f2) {
            return f2;
        }
        return f;
    }

    public static float[] w(float[] fArr, int i) {
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
        u34.t();
        return null;
    }

    public static boolean x(File file, Resources resources, int i) {
        InputStream inputStream;
        try {
            inputStream = resources.openRawResource(i);
        } catch (Throwable th) {
            th = th;
            inputStream = null;
        }
        try {
            boolean y = y(inputStream, file);
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused) {
                }
            }
            return y;
        } catch (Throwable th2) {
            th = th2;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused2) {
                }
            }
            throw th;
        }
    }

    public static boolean y(InputStream inputStream, File file) {
        FileOutputStream fileOutputStream;
        StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file, false);
            } catch (IOException e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    try {
                        break;
                    } catch (IOException unused) {
                    }
                }
            }
            fileOutputStream.close();
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            return true;
        } catch (IOException e2) {
            e = e2;
            fileOutputStream2 = fileOutputStream;
            Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException unused2) {
                }
            }
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            return false;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException unused3) {
                }
            }
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            throw th;
        }
    }

    public static final void z(mu2 mu2Var, dl7 dl7Var) {
        List list = dl7Var.f0;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            fl7 fl7Var = (fl7) list.get(i);
            if (fl7Var instanceof hl7) {
                nt4 nt4Var = new nt4();
                hl7 hl7Var = (hl7) fl7Var;
                nt4Var.d = hl7Var.B;
                nt4Var.n = true;
                nt4Var.c();
                nt4Var.s.h(hl7Var.L);
                nt4Var.c();
                nt4Var.c();
                nt4Var.b = hl7Var.R;
                nt4Var.c();
                nt4Var.c = hl7Var.X;
                nt4Var.c();
                nt4Var.g = hl7Var.Y;
                nt4Var.c();
                nt4Var.e = hl7Var.Z;
                nt4Var.c();
                nt4Var.f = hl7Var.d0;
                nt4Var.o = true;
                nt4Var.c();
                nt4Var.h = hl7Var.e0;
                nt4Var.o = true;
                nt4Var.c();
                nt4Var.i = hl7Var.f0;
                nt4Var.o = true;
                nt4Var.c();
                nt4Var.j = hl7Var.g0;
                nt4Var.o = true;
                nt4Var.c();
                nt4Var.k = hl7Var.h0;
                nt4Var.p = true;
                nt4Var.c();
                nt4Var.l = hl7Var.i0;
                nt4Var.p = true;
                nt4Var.c();
                nt4Var.m = hl7Var.j0;
                nt4Var.p = true;
                nt4Var.c();
                mu2Var.e(i, nt4Var);
            } else if (fl7Var instanceof dl7) {
                mu2 mu2Var2 = new mu2();
                dl7 dl7Var2 = (dl7) fl7Var;
                mu2Var2.k = dl7Var2.A;
                mu2Var2.c();
                mu2Var2.l = dl7Var2.B;
                mu2Var2.s = true;
                mu2Var2.c();
                mu2Var2.o = dl7Var2.X;
                mu2Var2.s = true;
                mu2Var2.c();
                mu2Var2.p = dl7Var2.Y;
                mu2Var2.s = true;
                mu2Var2.c();
                mu2Var2.q = dl7Var2.Z;
                mu2Var2.s = true;
                mu2Var2.c();
                mu2Var2.r = dl7Var2.d0;
                mu2Var2.s = true;
                mu2Var2.c();
                mu2Var2.m = dl7Var2.L;
                mu2Var2.s = true;
                mu2Var2.c();
                mu2Var2.n = dl7Var2.R;
                mu2Var2.s = true;
                mu2Var2.c();
                mu2Var2.f = dl7Var2.e0;
                mu2Var2.g = true;
                mu2Var2.c();
                z(mu2Var2, dl7Var2);
                mu2Var.e(i, mu2Var2);
            }
        }
    }
}
