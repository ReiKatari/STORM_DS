package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.net.Uri;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: v40  reason: default package */
/* loaded from: classes.dex */
public final class v40 implements Runnable {
    public static final Object o0 = new Object();
    public static final qm p0 = new qm(1);
    public static final AtomicInteger q0 = new AtomicInteger();
    public static final u40 r0 = new Object();
    public final int A = q0.incrementAndGet();
    public final sw4 B;
    public final uk1 L;
    public final s63 R;
    public final pq6 X;
    public final String Y;
    public final m44 Z;
    public int d0;
    public final xk5 e0;
    public i33 f0;
    public ArrayList g0;
    public Bitmap h0;
    public Future i0;
    public qw4 j0;
    public Exception k0;
    public int l0;
    public int m0;
    public rw4 n0;

    public v40(sw4 sw4Var, uk1 uk1Var, s63 s63Var, pq6 pq6Var, i33 i33Var, xk5 xk5Var) {
        this.B = sw4Var;
        this.L = uk1Var;
        this.R = s63Var;
        this.X = pq6Var;
        this.f0 = i33Var;
        this.Y = i33Var.d;
        m44 m44Var = i33Var.b;
        this.Z = m44Var;
        this.n0 = (rw4) m44Var.R;
        this.d0 = 0;
        this.e0 = xk5Var;
        this.m0 = xk5Var.b();
    }

    public static void d(m44 m44Var) {
        String hexString;
        Uri uri = (Uri) m44Var.B;
        if (uri != null) {
            hexString = String.valueOf(uri.getPath());
        } else {
            hexString = Integer.toHexString(0);
        }
        StringBuilder sb = (StringBuilder) p0.get();
        sb.ensureCapacity(hexString.length() + 8);
        sb.replace(8, sb.length(), hexString);
        Thread.currentThread().setName(sb.toString());
    }

    public final boolean a() {
        ArrayList arrayList;
        Future future;
        if (this.f0 != null || (((arrayList = this.g0) != null && !arrayList.isEmpty()) || (future = this.i0) == null || !future.cancel(false))) {
            return false;
        }
        return true;
    }

    public final void b(i33 i33Var) {
        boolean z;
        boolean z2 = true;
        if (this.f0 == i33Var) {
            this.f0 = null;
            z = true;
        } else {
            ArrayList arrayList = this.g0;
            if (arrayList != null) {
                z = arrayList.remove(i33Var);
            } else {
                z = false;
            }
        }
        if (z && ((rw4) i33Var.b.R) == this.n0) {
            rw4 rw4Var = rw4.LOW;
            ArrayList arrayList2 = this.g0;
            z2 = (arrayList2 == null || arrayList2.isEmpty()) ? false : false;
            i33 i33Var2 = this.f0;
            if (i33Var2 != null || z2) {
                if (i33Var2 != null) {
                    rw4Var = (rw4) i33Var2.b.R;
                }
                if (z2) {
                    int size = this.g0.size();
                    for (int i = 0; i < size; i++) {
                        rw4 rw4Var2 = (rw4) ((i33) this.g0.get(i)).b.R;
                        if (rw4Var2.ordinal() > rw4Var.ordinal()) {
                            rw4Var = rw4Var2;
                        }
                    }
                }
            }
            this.n0 = rw4Var;
        }
        this.B.getClass();
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Bitmap c() {
        Bitmap bitmap;
        int i;
        Bitmap bitmap2;
        boolean z;
        int i2;
        int i3;
        boolean z2;
        Bitmap decodeByteArray;
        if (e44.shouldReadFromMemoryCache(0)) {
            xz3 xz3Var = (xz3) ((nr1) this.R.B).get(this.Y);
            if (xz3Var != null) {
                bitmap = xz3Var.a;
            } else {
                bitmap = null;
            }
            if (bitmap != null) {
                this.X.b.sendEmptyMessage(0);
                this.j0 = qw4.MEMORY;
                this.B.getClass();
                return bitmap;
            }
        } else {
            bitmap = null;
        }
        if (this.m0 == 0) {
            i = ze4.OFFLINE.index;
        } else {
            i = this.d0;
        }
        this.d0 = i;
        aj c = this.e0.c(this.Z, i);
        if (c != null) {
            this.j0 = (qw4) c.L;
            this.l0 = c.B;
            bitmap = (Bitmap) c.R;
            if (bitmap == null) {
                in6 in6Var = (in6) c.X;
                try {
                    m44 m44Var = this.Z;
                    fe5 u = hi2.u(in6Var);
                    if (u.k(0L, ck7.b) && u.k(8L, ck7.c)) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    m44Var.getClass();
                    if (!z2) {
                        decodeByteArray = BitmapFactory.decodeStream(new j80(u, 1), null, null);
                        if (decodeByteArray == null) {
                            e41.i("Failed to decode stream.");
                            decodeByteArray = null;
                        }
                    } else {
                        byte[] q = u.q();
                        decodeByteArray = BitmapFactory.decodeByteArray(q, 0, q.length, null);
                    }
                    try {
                        in6Var.close();
                    } catch (IOException unused) {
                    }
                    bitmap2 = decodeByteArray;
                    if (bitmap2 != null) {
                        this.B.getClass();
                        pq6 pq6Var = this.X;
                        pq6Var.getClass();
                        StringBuilder sb = ck7.a;
                        int allocationByteCount = bitmap2.getAllocationByteCount();
                        if (allocationByteCount >= 0) {
                            sk1 sk1Var = pq6Var.b;
                            sk1Var.sendMessage(sk1Var.obtainMessage(2, allocationByteCount, 0));
                            m44 m44Var2 = this.Z;
                            m44Var2.getClass();
                            if (((List) m44Var2.L) != null || this.l0 != 0) {
                                synchronized (o0) {
                                    try {
                                        this.Z.getClass();
                                        int i4 = this.l0;
                                        if (i4 != 0) {
                                            m44 m44Var3 = this.Z;
                                            int width = bitmap2.getWidth();
                                            int height = bitmap2.getHeight();
                                            m44Var3.getClass();
                                            Matrix matrix = new Matrix();
                                            if (i4 != 0 && i4 != 0) {
                                                switch (i4) {
                                                    case 3:
                                                    case 4:
                                                        i2 = 180;
                                                        break;
                                                    case 5:
                                                    case 6:
                                                        i2 = 90;
                                                        break;
                                                    case 7:
                                                    case 8:
                                                        i2 = 270;
                                                        break;
                                                    default:
                                                        i2 = 0;
                                                        break;
                                                }
                                                if (i4 != 2 && i4 != 7 && i4 != 4 && i4 != 5) {
                                                    i3 = 1;
                                                } else {
                                                    i3 = -1;
                                                }
                                                if (i2 != 0) {
                                                    matrix.preRotate(i2);
                                                }
                                                if (i3 != 1) {
                                                    matrix.postScale(i3, 1.0f);
                                                }
                                            }
                                            Bitmap createBitmap = Bitmap.createBitmap(bitmap2, 0, 0, width, height, matrix, true);
                                            if (createBitmap != bitmap2) {
                                                bitmap2.recycle();
                                                bitmap2 = createBitmap;
                                            }
                                            this.B.getClass();
                                        }
                                        List list = (List) this.Z.L;
                                        if (list != null) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        if (z) {
                                            if (list.size() > 0) {
                                                if (list.get(0) == null) {
                                                    try {
                                                        throw null;
                                                    } catch (RuntimeException unused2) {
                                                        sw4.i.post(new sb(1));
                                                        bitmap2 = null;
                                                    }
                                                } else {
                                                    throw new ClassCastException();
                                                }
                                            }
                                            this.B.getClass();
                                        }
                                    } finally {
                                    }
                                }
                                if (bitmap2 != null) {
                                    pq6 pq6Var2 = this.X;
                                    pq6Var2.getClass();
                                    int allocationByteCount2 = bitmap2.getAllocationByteCount();
                                    if (allocationByteCount2 >= 0) {
                                        sk1 sk1Var2 = pq6Var2.b;
                                        sk1Var2.sendMessage(sk1Var2.obtainMessage(3, allocationByteCount2, 0));
                                    } else {
                                        e41.y(bitmap2, "Negative size: ");
                                        return null;
                                    }
                                }
                            }
                        } else {
                            e41.y(bitmap2, "Negative size: ");
                            return null;
                        }
                    }
                    return bitmap2;
                } catch (Throwable th) {
                    try {
                        in6Var.close();
                    } catch (IOException unused3) {
                    }
                    throw th;
                }
            }
        }
        bitmap2 = bitmap;
        if (bitmap2 != null) {
        }
        return bitmap2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        uk1 uk1Var = this.L;
        try {
            try {
                try {
                    try {
                        d(this.Z);
                        this.B.getClass();
                        Bitmap c = c();
                        this.h0 = c;
                        if (c == null) {
                            sk1 sk1Var = (sk1) uk1Var.j;
                            sk1Var.sendMessage(sk1Var.obtainMessage(6, this));
                        } else {
                            uk1Var.b(this);
                        }
                    } catch (OutOfMemoryError e) {
                        StringWriter stringWriter = new StringWriter();
                        this.X.a().a(new PrintWriter(stringWriter));
                        this.k0 = new RuntimeException(stringWriter.toString(), e);
                        sk1 sk1Var2 = (sk1) uk1Var.j;
                        sk1Var2.sendMessage(sk1Var2.obtainMessage(6, this));
                    }
                } catch (Exception e2) {
                    this.k0 = e2;
                    sk1 sk1Var3 = (sk1) uk1Var.j;
                    sk1Var3.sendMessage(sk1Var3.obtainMessage(6, this));
                }
            } catch (ef4 e3) {
                if (!ze4.isOfflineOnly(0) || e3.A != 504) {
                    this.k0 = e3;
                }
                sk1 sk1Var4 = (sk1) uk1Var.j;
                sk1Var4.sendMessage(sk1Var4.obtainMessage(6, this));
            } catch (IOException e4) {
                this.k0 = e4;
                sk1 sk1Var5 = (sk1) uk1Var.j;
                sk1Var5.sendMessageDelayed(sk1Var5.obtainMessage(5, this), 500L);
            }
        } finally {
            Thread.currentThread().setName("Picasso-Idle");
        }
    }
}
