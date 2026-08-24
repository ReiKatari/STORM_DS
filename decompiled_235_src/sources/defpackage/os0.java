package defpackage;

import android.content.ClipData;
import android.media.Image;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.security.keystore.KeyGenParameterSpec;
import android.util.Log;
import android.view.ContentInfo;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.camera.camera2.compat.quirk.CloseCameraDeviceOnCameraGraphCloseQuirk;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.ProviderException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: os0  reason: default package */
/* loaded from: classes.dex */
public class os0 implements a54, g44, r23, ns, zk4, bi4, yd5, n44, q31, s31 {
    public static final lr2 L = new lr2(1);
    public static final os0 R = new os0(2, false);
    public static final th7 X = new Object();
    public final /* synthetic */ int A;
    public Object B;

    /* JADX WARN: Type inference failed for: r5v14, types: [l04, java.lang.Object] */
    public os0(int i) {
        h54 h54Var;
        this.A = i;
        switch (i) {
            case 4:
                if (Build.VERSION.SDK_INT >= 26) {
                    this.B = new w2(this);
                    return;
                } else {
                    this.B = new w2(this);
                    return;
                }
            case 11:
                try {
                    KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                    keyStore.load(null);
                    this.B = keyStore;
                    return;
                } catch (IOException | GeneralSecurityException e) {
                    throw new IllegalStateException(e);
                }
            case 15:
                this.B = new AtomicReference(null);
                return;
            case ConnectionResult.API_DISABLED /* 23 */:
                y65 y65Var = si1.a;
                this.B = (CloseCameraDeviceOnCameraGraphCloseQuirk) si1.a().b(CloseCameraDeviceOnCameraGraphCloseQuirk.class);
                return;
            case 27:
                TimeUnit.MINUTES.getClass();
                qz6 qz6Var = qz6.l;
                qz6Var.getClass();
                this.B = new ls1(qz6Var);
                return;
            default:
                try {
                    h54Var = (h54) Class.forName("com.google.crypto.tink.shaded.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
                } catch (Exception unused) {
                    h54Var = L;
                }
                h54[] h54VarArr = {lr2.b, h54Var};
                ?? obj = new Object();
                obj.a = h54VarArr;
                Charset charset = aa3.a;
                this.B = obj;
                return;
        }
    }

    public static void Y(String str) {
        if (!new os0(11).b0(str)) {
            String b = kk7.b(str);
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
            keyGenerator.init(new KeyGenParameterSpec.Builder(b, 3).setKeySize(256).setBlockModes("GCM").setEncryptionPaddings("NoPadding").build());
            keyGenerator.generateKey();
            return;
        }
        i.h(lb1.A("cannot generate a new key ", str, " because it already exists; please delete it with deleteKey() and try again"));
    }

    @Override // defpackage.r23
    public int C() {
        return ((Image.Plane) this.B).getPixelStride();
    }

    @Override // defpackage.n44
    public void D(i44 i44Var, o44 o44Var) {
        gl0 gl0Var = (gl0) this.B;
        Handler handler = gl0Var.Y;
        fl0 fl0Var = null;
        handler.removeCallbacksAndMessages(null);
        ArrayList arrayList = gl0Var.d0;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i < size) {
                if (i44Var == ((fl0) arrayList.get(i)).b) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        if (i == -1) {
            return;
        }
        int i2 = i + 1;
        if (i2 < arrayList.size()) {
            fl0Var = (fl0) arrayList.get(i2);
        }
        handler.postAtTime(new el0(this, fl0Var, o44Var, i44Var), i44Var, SystemClock.uptimeMillis() + 200);
    }

    @Override // defpackage.s31
    public int F() {
        int flags;
        flags = ((ContentInfo) this.B).getFlags();
        return flags;
    }

    @Override // defpackage.s31
    public ContentInfo G() {
        return (ContentInfo) this.B;
    }

    @Override // defpackage.g44
    public void H(i44 i44Var) {
        g44 g44Var = ((ActionMenuView) this.B).u0;
        if (g44Var != null) {
            g44Var.H(i44Var);
        }
    }

    @Override // defpackage.a54
    public boolean M(i44 i44Var) {
        g8 g8Var = (g8) this.B;
        if (i44Var != g8Var.L) {
            ((it6) i44Var).A.getClass();
            a54 a54Var = g8Var.X;
            if (a54Var != null) {
                return a54Var.M(i44Var);
            }
            return false;
        }
        return false;
    }

    public ou O(bt btVar) {
        InputStream inputStream;
        hl0 hl0Var = (hl0) this.B;
        URL url = (URL) btVar.B;
        nj2.l("CctTransportBackend", "Making request to: %s", url);
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(hl0Var.g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", "datatransport/2.3.3 android/");
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = (String) btVar.R;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                s63 s63Var = hl0Var.a;
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(gZIPOutputStream));
                xd3 xd3Var = (xd3) s63Var.B;
                uf3 uf3Var = new uf3(bufferedWriter, xd3Var.a, xd3Var.b, xd3Var.c, xd3Var.d);
                uf3Var.a((rx) btVar.L);
                uf3Var.c();
                uf3Var.b.flush();
                gZIPOutputStream.close();
                if (outputStream != null) {
                    outputStream.close();
                }
                int responseCode = httpURLConnection.getResponseCode();
                Log.i("TransportRuntime.".concat("CctTransportBackend"), lb1.g(responseCode, "Status Code: "));
                Log.i("TransportRuntime.".concat("CctTransportBackend"), "Content-Type: " + httpURLConnection.getHeaderField("Content-Type"));
                Log.i("TransportRuntime.".concat("CctTransportBackend"), "Content-Encoding: " + httpURLConnection.getHeaderField("Content-Encoding"));
                if (responseCode != 302 && responseCode != 301 && responseCode != 307) {
                    if (responseCode != 200) {
                        return new ou(responseCode, null, 0L);
                    }
                    InputStream inputStream2 = httpURLConnection.getInputStream();
                    try {
                        if ("gzip".equals(httpURLConnection.getHeaderField("Content-Encoding"))) {
                            inputStream = new GZIPInputStream(inputStream2);
                        } else {
                            inputStream = inputStream2;
                        }
                        ou ouVar = new ou(responseCode, null, py.a(new BufferedReader(new InputStreamReader(inputStream))).a);
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        if (inputStream2 != null) {
                            inputStream2.close();
                        }
                        return ouVar;
                    } catch (Throwable th) {
                        if (inputStream2 != null) {
                            try {
                                inputStream2.close();
                            } catch (Throwable unused) {
                            }
                        }
                        throw th;
                    }
                }
                return new ou(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
            } catch (Throwable th2) {
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (Throwable unused2) {
                    }
                }
                throw th2;
            }
        } catch (d42 e) {
            e = e;
            Log.e("TransportRuntime.".concat("CctTransportBackend"), "Couldn't encode request, returning with 400", e);
            return new ou(400, null, 0L);
        } catch (ConnectException e2) {
            e = e2;
            Log.e("TransportRuntime.".concat("CctTransportBackend"), "Couldn't open connection, returning with 500", e);
            return new ou(500, null, 0L);
        } catch (UnknownHostException e3) {
            e = e3;
            Log.e("TransportRuntime.".concat("CctTransportBackend"), "Couldn't open connection, returning with 500", e);
            return new ou(500, null, 0L);
        } catch (IOException e4) {
            e = e4;
            Log.e("TransportRuntime.".concat("CctTransportBackend"), "Couldn't encode request, returning with 400", e);
            return new ou(400, null, 0L);
        }
    }

    public long P(qh1 qh1Var, oy4 oy4Var) {
        float e0;
        float e02;
        ViewConfiguration viewConfiguration = (ViewConfiguration) this.B;
        int i = Build.VERSION.SDK_INT;
        if (i > 26) {
            e0 = pt0.l(viewConfiguration);
        } else {
            e0 = qh1Var.e0(64.0f);
        }
        float f = -e0;
        if (i > 26) {
            e02 = pt0.i(viewConfiguration);
        } else {
            e02 = qh1Var.e0(64.0f);
        }
        float f2 = -e02;
        List list = oy4Var.a;
        jk4 jk4Var = new jk4(0L);
        int size = list.size();
        int i2 = 0;
        while (true) {
            long j = jk4Var.a;
            if (i2 < size) {
                jk4Var = new jk4(jk4.f(j, ((vy4) list.get(i2)).j));
                i2++;
            } else {
                return (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32)) * f2) << 32) | (4294967295L & Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) * f));
            }
        }
    }

    public void Q(float f, float f2, float f3, float f4, int i) {
        ((bt) this.B).G().n(f, f2, f3, f4, i);
    }

    public v2 R(int i) {
        return null;
    }

    public void S() {
        ((zx0) this.B).getClass();
    }

    public byte[] T(byte[] bArr, byte[] bArr2) {
        try {
            return V(bArr, bArr2);
        } catch (GeneralSecurityException | ProviderException e) {
            Log.w("os0", "encountered a potentially transient KeyStore error, will wait and retry", e);
            try {
                Thread.sleep((int) (Math.random() * 100.0d));
            } catch (InterruptedException unused) {
            }
            return this.V(bArr, bArr2);
        }
    }

    @Override // defpackage.zk4
    public vu7 U(View view, vu7 vu7Var) {
        o60 o60Var = (o60) this.B;
        n60 n60Var = o60Var.j0;
        if (n60Var != null) {
            o60Var.Z.Y.remove(n60Var);
        }
        n60 n60Var2 = new n60(o60Var.f0, vu7Var);
        o60Var.j0 = n60Var2;
        n60Var2.e(o60Var.getWindow());
        BottomSheetBehavior bottomSheetBehavior = o60Var.Z;
        n60 n60Var3 = o60Var.j0;
        ArrayList arrayList = bottomSheetBehavior.Y;
        if (!arrayList.contains(n60Var3)) {
            arrayList.add(n60Var3);
        }
        return vu7Var;
    }

    public byte[] V(byte[] bArr, byte[] bArr2) {
        if (bArr.length >= 28) {
            GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(128, bArr, 0, 12);
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(2, (SecretKey) this.B, gCMParameterSpec);
            cipher.updateAAD(bArr2);
            return cipher.doFinal(bArr, 12, bArr.length - 12);
        }
        e41.v("ciphertext too short");
        return null;
    }

    public byte[] W(byte[] bArr, byte[] bArr2) {
        if (bArr.length <= 2147483619) {
            byte[] bArr3 = new byte[bArr.length + 28];
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(1, (SecretKey) this.B);
            cipher.updateAAD(bArr2);
            cipher.doFinal(bArr, 0, bArr.length, bArr3, 12);
            System.arraycopy(cipher.getIV(), 0, bArr3, 0, 12);
            return bArr3;
        }
        e41.v("plaintext too long");
        return null;
    }

    public v2 X(int i) {
        return null;
    }

    public qo7 Z(ar0 ar0Var) {
        eb ebVar = (eb) this.B;
        String b = ar0Var.b();
        if (b != null) {
            return ebVar.G(ar0Var, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(b));
        }
        i.h("Local and anonymous classes can not be ViewModels");
        return null;
    }

    @Override // defpackage.r23
    public ByteBuffer a() {
        return ((Image.Plane) this.B).getBuffer();
    }

    public synchronized os0 a0(String str) {
        os0 os0Var;
        byte[] W;
        os0Var = new os0(kk7.b(str), (KeyStore) this.B);
        byte[] a = nd5.a(10);
        byte[] bArr = new byte[0];
        try {
            W = os0Var.W(a, bArr);
        } catch (GeneralSecurityException | ProviderException e) {
            Log.w("os0", "encountered a potentially transient KeyStore error, will wait and retry", e);
            try {
                Thread.sleep((int) (Math.random() * 100.0d));
            } catch (InterruptedException unused) {
            }
            W = os0Var.W(a, bArr);
        }
        if (!Arrays.equals(a, os0Var.T(W, bArr))) {
            throw new KeyStoreException("cannot use Android Keystore: encryption/decryption of non-empty message and empty aad returns an incorrect result");
        }
        return os0Var;
    }

    public synchronized boolean b0(String str) {
        String str2;
        try {
        } catch (NullPointerException unused) {
            Log.w("os0", "Keystore is temporarily unavailable, wait 20ms, reinitialize Keystore and try again.");
            try {
                Thread.sleep(20L);
                KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                this.B = keyStore;
                keyStore.load(null);
            } catch (IOException e) {
                throw new GeneralSecurityException(e);
            } catch (InterruptedException unused2) {
            }
            return ((KeyStore) this.B).containsAlias(str2);
        }
        return ((KeyStore) this.B).containsAlias(kk7.b(str));
    }

    @Override // defpackage.q31
    public t31 build() {
        ContentInfo build;
        build = ((ContentInfo.Builder) this.B).build();
        return new t31(new os0(build));
    }

    public void c0(float f, float f2, float f3, float f4) {
        bt btVar = (bt) this.B;
        xj0 G = btVar.G();
        float intBitsToFloat = Float.intBitsToFloat((int) (btVar.L() >> 32)) - (f3 + f);
        long floatToRawIntBits = (Float.floatToRawIntBits(Float.intBitsToFloat((int) (btVar.L() & 4294967295L)) - (f4 + f2)) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
        if (Float.intBitsToFloat((int) (floatToRawIntBits >> 32)) < RecyclerView.B1 || Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L)) < RecyclerView.B1) {
            o53.a("Width and height must be greater than or equal to zero");
        }
        btVar.Y(floatToRawIntBits);
        G.o(f, f2);
    }

    @Override // defpackage.a54
    public void d(i44 i44Var, boolean z) {
        if (i44Var instanceof it6) {
            ((it6) i44Var).z.k().c(false);
        }
        a54 a54Var = ((g8) this.B).X;
        if (a54Var != null) {
            a54Var.d(i44Var, z);
        }
    }

    public boolean d0(int i, int i2, Bundle bundle) {
        return false;
    }

    public void e0(float f, long j) {
        xj0 G = ((bt) this.B).G();
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        G.o(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
        G.c(f);
        G.o(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
    }

    public void f0(float f, float f2, long j) {
        xj0 G = ((bt) this.B).G();
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        G.o(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
        G.b(f, f2);
        G.o(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
    }

    public void g0(float f, float f2) {
        ((bt) this.B).G().o(f, f2);
    }

    public void h0(int i, boolean z) {
        ms0 ms0Var = (ms0) this.B;
        ms0Var.r(i, 0);
        ms0Var.k(z ? (byte) 1 : (byte) 0);
    }

    public void i0(int i, ea0 ea0Var) {
        ms0 ms0Var = (ms0) this.B;
        ms0Var.r(i, 2);
        ms0Var.s(ea0Var.size());
        ca0 ca0Var = (ca0) ea0Var;
        ms0Var.l(ca0Var.R, ca0Var.g(), ca0Var.size());
    }

    public void j0(int i, double d) {
        ms0 ms0Var = (ms0) this.B;
        ms0Var.getClass();
        ms0Var.o(i, Double.doubleToRawLongBits(d));
    }

    @Override // defpackage.s31
    public int k() {
        int source;
        source = ((ContentInfo) this.B).getSource();
        return source;
    }

    public void k0(int i, int i2) {
        ms0 ms0Var = (ms0) this.B;
        ms0Var.r(i, 0);
        ms0Var.q(i2);
    }

    @Override // defpackage.s31
    public ClipData l() {
        ClipData clip;
        clip = ((ContentInfo) this.B).getClip();
        return clip;
    }

    public void l0(int i, int i2) {
        ((ms0) this.B).m(i, i2);
    }

    @Override // defpackage.r23
    public int m() {
        return ((Image.Plane) this.B).getRowStride();
    }

    public void m0(int i, long j) {
        ((ms0) this.B).o(i, j);
    }

    @Override // defpackage.g44
    public boolean n(i44 i44Var, MenuItem menuItem) {
        boolean z;
        j8 j8Var = ((ActionMenuView) this.B).z0;
        if (j8Var != null) {
            Toolbar toolbar = ((r9) j8Var).A;
            Iterator it = ((CopyOnWriteArrayList) toolbar.F0.L).iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((fl2) it.next()).a.p(menuItem)) {
                        z = true;
                        break;
                    }
                } else {
                    f87 f87Var = toolbar.H0;
                    if (f87Var != null) {
                        z = ((h87) f87Var).A.m.onMenuItemSelected(0, menuItem);
                    } else {
                        z = false;
                    }
                }
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    public void n0(int i, float f) {
        ms0 ms0Var = (ms0) this.B;
        ms0Var.getClass();
        ms0Var.m(i, Float.floatToRawIntBits(f));
    }

    @Override // defpackage.n44
    public void o(i44 i44Var, MenuItem menuItem) {
        ((gl0) this.B).Y.removeCallbacksAndMessages(i44Var);
    }

    public void o0(int i, Object obj, j66 j66Var) {
        ms0 ms0Var = (ms0) this.B;
        ms0Var.r(i, 3);
        j66Var.e((c1) obj, ms0Var.a);
        ms0Var.r(i, 4);
    }

    @Override // defpackage.bi4
    public void onError(Throwable th) {
        th.getClass();
        gh0 gh0Var = (gh0) this.B;
        if (gh0Var.l.get()) {
            kj2.w("CameraPresencePrvdr", "Error from source camera presence observable. Triggering refresh.", th);
            bx4 bx4Var = gh0Var.h;
            if (bx4Var != null) {
                bx4Var.a();
            }
        }
    }

    @Override // defpackage.yd5
    public yy0 p() {
        return (yy0) this.B;
    }

    public void p0(int i, int i2) {
        ms0 ms0Var = (ms0) this.B;
        ms0Var.r(i, 0);
        ms0Var.q(i2);
    }

    public void q0(int i, long j) {
        ((ms0) this.B).t(i, j);
    }

    public void r0(int i, Object obj, j66 j66Var) {
        ms0 ms0Var = (ms0) this.B;
        c1 c1Var = (c1) obj;
        ms0Var.r(i, 2);
        c1Var.getClass();
        pr2 pr2Var = (pr2) c1Var;
        int i2 = pr2Var.memoizedSerializedSize;
        if (i2 == -1) {
            i2 = j66Var.i(c1Var);
            pr2Var.memoizedSerializedSize = i2;
        }
        ms0Var.s(i2);
        j66Var.e(c1Var, ms0Var.a);
    }

    @Override // defpackage.q31
    public void s(Uri uri) {
        ((ContentInfo.Builder) this.B).setLinkUri(uri);
    }

    public void s0(int i, int i2) {
        ((ms0) this.B).m(i, i2);
    }

    @Override // defpackage.q31
    public void setExtras(Bundle bundle) {
        ((ContentInfo.Builder) this.B).setExtras(bundle);
    }

    public void t0(int i, long j) {
        ((ms0) this.B).o(i, j);
    }

    public String toString() {
        switch (this.A) {
            case 29:
                return "ContentInfoCompat{" + ((ContentInfo) this.B) + "}";
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [if0] */
    /* JADX WARN: Type inference failed for: r4v0, types: [yt1] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.util.ArrayList] */
    @Override // defpackage.bi4
    public void u(Object obj) {
        gh0 gh0Var;
        ?? r1;
        kh0 kh0Var;
        g60 g60Var;
        ?? r4;
        int i;
        Iterable<String> k1;
        List<yf0> list = (List) obj;
        if (((gh0) this.B).l.get() && (r1 = (gh0Var = (gh0) this.B).f) != 0 && (kh0Var = gh0Var.g) != null && (g60Var = gh0Var.i) != null) {
            if (list != null) {
                r4 = new ArrayList(ht0.v0(list, 10));
                for (yf0 yf0Var : list) {
                    r4.add(yf0Var.a());
                }
            } else {
                r4 = yt1.A;
            }
            try {
                List list2 = ((gh0) this.B).k;
                if (((AtomicBoolean) r1.k).get()) {
                    k1 = yt1.A;
                } else {
                    k1 = gt0.k1(r1.b(r4));
                }
                ArrayList arrayList = new ArrayList(ht0.v0(k1, 10));
                for (String str : k1) {
                    str.getClass();
                    arrayList.add(nc1.J(str, null, null));
                }
                Set F = ii2.F(gt0.p1(list2), gt0.p1(arrayList));
                if (!F.isEmpty() && g60Var.c(kh0Var.c(), F)) {
                    kj2.f0("CameraPresencePrvdr", "Camera removal update invalid. Aborting.");
                    return;
                }
            } catch (Exception e) {
                kj2.g0("CameraPresencePrvdr", "Failed to interrogate camera factory. Falling back to full update.", e);
            }
            try {
                r1.h(r4);
                Set<String> e2 = r1.e();
                ArrayList arrayList2 = new ArrayList(ht0.v0(e2, 10));
                for (String str2 : e2) {
                    str2.getClass();
                    arrayList2.add(nc1.J(str2, null, null));
                }
                if (!arrayList2.equals(((gh0) this.B).k)) {
                    gh0 gh0Var2 = (gh0) this.B;
                    List<yf0> k12 = gt0.k1(gh0Var2.k);
                    if (!arrayList2.equals(k12)) {
                        synchronized (gh0Var2.d) {
                            i = 0;
                            if (gh0Var2.e != null) {
                                kj2.t("CameraPresencePrvdr", "Camera list updated. Cancelling any pending retries.");
                                ScheduledFuture scheduledFuture = gh0Var2.e;
                                scheduledFuture.getClass();
                                scheduledFuture.cancel(false);
                                gh0Var2.e = null;
                            }
                        }
                        Set p1 = gt0.p1(k12);
                        Set p12 = gt0.p1(arrayList2);
                        Set<yf0> F2 = ii2.F(p12, p1);
                        Set<yf0> F3 = ii2.F(p1, p12);
                        ArrayList arrayList3 = new ArrayList();
                        ArrayList arrayList4 = new ArrayList(ht0.v0(arrayList2, 10));
                        int size = arrayList2.size();
                        while (i < size) {
                            Object obj2 = arrayList2.get(i);
                            i++;
                            arrayList4.add(((yf0) obj2).a());
                        }
                        try {
                            for (yf0 yf0Var2 : F3) {
                                gh0Var2.c(yf0Var2.a());
                            }
                            kh0 kh0Var2 = gh0Var2.g;
                            if (kh0Var2 != null) {
                                kj2.t("CameraPresencePrvdr", "Updating CameraRepository...");
                                kh0Var2.a(arrayList4);
                                arrayList3.add(kh0Var2);
                                kj2.t("CameraPresencePrvdr", "CameraRepository updated successfully.");
                            }
                            if (!gh0Var2.m.isEmpty()) {
                                kj2.t("CameraPresencePrvdr", "Updating " + gh0Var2.m.size() + " dependent listeners...");
                                Iterator it = gh0Var2.m.iterator();
                                while (it.hasNext()) {
                                    ia3 ia3Var = (ia3) it.next();
                                    ia3Var.a(arrayList4);
                                    arrayList3.add(ia3Var);
                                }
                            }
                            gh0Var2.k = arrayList2;
                            for (yf0 yf0Var3 : F2) {
                                gh0Var2.a(yf0Var3.a());
                            }
                            gh0Var2.b(F2, F3);
                        } catch (Exception e3) {
                            kj2.w("CameraPresencePrvdr", "A core module failed to update. Rolling back changes.", e3);
                            ArrayList arrayList5 = new ArrayList(ht0.v0(k12, 10));
                            for (yf0 yf0Var4 : k12) {
                                arrayList5.add(yf0Var4.a());
                            }
                            Iterator it2 = new rp5(arrayList3).iterator();
                            while (true) {
                                qp5 qp5Var = (qp5) it2;
                                if (!((ListIterator) qp5Var.B).hasPrevious()) {
                                    break;
                                }
                                ia3 ia3Var2 = (ia3) ((ListIterator) qp5Var.B).previous();
                                try {
                                    ia3Var2.a(arrayList5);
                                } catch (Exception e4) {
                                    kj2.w("CameraPresencePrvdr", "Failed to rollback listener: " + ia3Var2, e4);
                                }
                            }
                            for (yf0 yf0Var5 : F3) {
                                gh0Var2.a(yf0Var5.a());
                            }
                            for (yf0 yf0Var6 : F2) {
                                gh0Var2.c(yf0Var6.a());
                            }
                        }
                    }
                }
            } catch (Exception e5) {
                kj2.g0("CameraPresencePrvdr", "CameraFactory failed to update. The camera list may be stale until the next update.", e5);
            }
        }
    }

    public void u0(int i, int i2) {
        ms0 ms0Var = (ms0) this.B;
        ms0Var.r(i, 0);
        ms0Var.s((i2 >> 31) ^ (i2 << 1));
    }

    @Override // defpackage.q31
    public void v(int i) {
        ((ContentInfo.Builder) this.B).setFlags(i);
    }

    public void v0(int i, long j) {
        ((ms0) this.B).t(i, (j >> 63) ^ (j << 1));
    }

    public void w0(int i, int i2) {
        ms0 ms0Var = (ms0) this.B;
        ms0Var.r(i, 0);
        ms0Var.s(i2);
    }

    public void x0(int i, long j) {
        ((ms0) this.B).t(i, j);
    }

    public void B(int i) {
    }

    public void I(int i) {
    }

    @Override // defpackage.ns
    public void L(int i, float f) {
    }

    public /* synthetic */ os0(Object obj, int i) {
        this.A = i;
        this.B = obj;
    }

    public os0(yy0 yy0Var) {
        this.A = 20;
        yy0Var.getClass();
        this.B = yy0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002c, code lost:
        if (r7 == r3) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0049 A[LOOP:1: B:21:0x0047->B:22:0x0049, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public os0(int[] iArr, float[] fArr, float[][] fArr2) {
        int i;
        int length;
        int i2;
        this.A = 14;
        int i3 = 1;
        int length2 = fArr.length - 1;
        xt[][] xtVarArr = new xt[length2];
        int i4 = 1;
        int i5 = 1;
        int i6 = 0;
        while (i6 < length2) {
            int i7 = iArr[i6];
            int i8 = 3;
            if (i7 != 0) {
                if (i7 != i3) {
                    if (i7 != 2) {
                        if (i7 != 3) {
                            i8 = 4;
                            if (i7 != 4) {
                                i8 = 5;
                                if (i7 != 5) {
                                    i = i5;
                                    float[] fArr3 = fArr2[i6];
                                    int i9 = i6 + 1;
                                    float[] fArr4 = fArr2[i9];
                                    float f = fArr[i6];
                                    float f2 = fArr[i9];
                                    length = (fArr3.length % 2) + (fArr3.length / 2);
                                    xt[] xtVarArr2 = new xt[length];
                                    i2 = 0;
                                    while (i2 < length) {
                                        int i10 = i2 * 2;
                                        int i11 = i2;
                                        int i12 = i10 + 1;
                                        xtVarArr2[i11] = new xt(i, f, f2, fArr3[i10], fArr3[i12], fArr4[i10], fArr4[i12]);
                                        i2 = i11 + 1;
                                    }
                                    xtVarArr[i6] = xtVarArr2;
                                    i6 = i9;
                                    i5 = i;
                                    i3 = 1;
                                }
                            }
                        }
                    }
                    i4 = 2;
                    i = i4;
                    float[] fArr32 = fArr2[i6];
                    int i92 = i6 + 1;
                    float[] fArr42 = fArr2[i92];
                    float f3 = fArr[i6];
                    float f22 = fArr[i92];
                    length = (fArr32.length % 2) + (fArr32.length / 2);
                    xt[] xtVarArr22 = new xt[length];
                    i2 = 0;
                    while (i2 < length) {
                    }
                    xtVarArr[i6] = xtVarArr22;
                    i6 = i92;
                    i5 = i;
                    i3 = 1;
                }
                i4 = i3;
                i = i4;
                float[] fArr322 = fArr2[i6];
                int i922 = i6 + 1;
                float[] fArr422 = fArr2[i922];
                float f32 = fArr[i6];
                float f222 = fArr[i922];
                length = (fArr322.length % 2) + (fArr322.length / 2);
                xt[] xtVarArr222 = new xt[length];
                i2 = 0;
                while (i2 < length) {
                }
                xtVarArr[i6] = xtVarArr222;
                i6 = i922;
                i5 = i;
                i3 = 1;
            }
            i = i8;
            float[] fArr3222 = fArr2[i6];
            int i9222 = i6 + 1;
            float[] fArr4222 = fArr2[i9222];
            float f322 = fArr[i6];
            float f2222 = fArr[i9222];
            length = (fArr3222.length % 2) + (fArr3222.length / 2);
            xt[] xtVarArr2222 = new xt[length];
            i2 = 0;
            while (i2 < length) {
            }
            xtVarArr[i6] = xtVarArr2222;
            i6 = i9222;
            i5 = i;
            i3 = 1;
        }
        this.B = xtVarArr;
    }

    public os0(ap7 ap7Var, yo7 yo7Var, j71 j71Var) {
        this.A = 3;
        ap7Var.getClass();
        yo7Var.getClass();
        j71Var.getClass();
        this.B = new eb(ap7Var, yo7Var, j71Var);
    }

    public void N(int i, v2 v2Var, String str, Bundle bundle) {
    }

    public os0(ms0 ms0Var) {
        this.A = 0;
        aa3.a(ms0Var, "output");
        this.B = ms0Var;
        ms0Var.a = this;
    }

    public os0(String str, KeyStore keyStore) {
        this.A = 10;
        SecretKey secretKey = (SecretKey) keyStore.getKey(str, null);
        this.B = secretKey;
        if (secretKey == null) {
            throw new InvalidKeyException("Keystore cannot load the key with ID: ".concat(str));
        }
    }

    public /* synthetic */ os0(int i, boolean z) {
        this.A = i;
    }

    public os0(ContentInfo contentInfo) {
        this.A = 29;
        contentInfo.getClass();
        this.B = sd0.l(contentInfo);
    }

    public os0(ClipData clipData, int i) {
        this.A = 28;
        this.B = sd0.j(clipData, i);
    }
}
