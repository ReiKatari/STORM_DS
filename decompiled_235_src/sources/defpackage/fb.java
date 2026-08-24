package defpackage;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fb  reason: default package */
/* loaded from: classes.dex */
public final class fb implements nr6, w62 {
    public long A;
    public final Object B;
    public final Object L;
    public final Object R;
    public final Object X;

    public fb(gb gbVar, byte[] bArr) {
        this.A = 0L;
        this.L = (Cipher) p42.e.a("AES/GCM/NoPadding");
        this.A = 0L;
        int i = gbVar.a;
        byte[] a = nd5.a(i);
        byte[] a2 = nd5.a(7);
        this.R = a2;
        ByteBuffer allocate = ByteBuffer.allocate(gbVar.e());
        this.X = allocate;
        allocate.put((byte) gbVar.e());
        allocate.put(a);
        allocate.put(a2);
        allocate.flip();
        this.B = new SecretKeySpec(gi2.v(gbVar.d, gbVar.e, a, bArr, i), "AES");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0058 A[Catch: all -> 0x001e, TryCatch #0 {all -> 0x001e, blocks: (B:3:0x0002, B:5:0x000c, B:12:0x0021, B:14:0x002b, B:22:0x0058, B:25:0x0066, B:28:0x0073, B:31:0x007c, B:33:0x0082, B:38:0x008b, B:40:0x0096, B:41:0x009c, B:43:0x00a0, B:47:0x00a7, B:50:0x00b1, B:52:0x00b5, B:55:0x00bb, B:56:0x00bf, B:57:0x00c3, B:58:0x00c4, B:60:0x00c8, B:20:0x004c, B:61:0x00d3, B:62:0x00da), top: B:65:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008b A[Catch: all -> 0x001e, TryCatch #0 {all -> 0x001e, blocks: (B:3:0x0002, B:5:0x000c, B:12:0x0021, B:14:0x002b, B:22:0x0058, B:25:0x0066, B:28:0x0073, B:31:0x007c, B:33:0x0082, B:38:0x008b, B:40:0x0096, B:41:0x009c, B:43:0x00a0, B:47:0x00a7, B:50:0x00b1, B:52:0x00b5, B:55:0x00bb, B:56:0x00bf, B:57:0x00c3, B:58:0x00c4, B:60:0x00c8, B:20:0x004c, B:61:0x00d3, B:62:0x00da), top: B:65:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b5 A[Catch: all -> 0x001e, TryCatch #0 {all -> 0x001e, blocks: (B:3:0x0002, B:5:0x000c, B:12:0x0021, B:14:0x002b, B:22:0x0058, B:25:0x0066, B:28:0x0073, B:31:0x007c, B:33:0x0082, B:38:0x008b, B:40:0x0096, B:41:0x009c, B:43:0x00a0, B:47:0x00a7, B:50:0x00b1, B:52:0x00b5, B:55:0x00bb, B:56:0x00bf, B:57:0x00c3, B:58:0x00c4, B:60:0x00c8, B:20:0x004c, B:61:0x00d3, B:62:0x00da), top: B:65:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x007c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x007c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x007b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0002 A[SYNTHETIC] */
    @Override // defpackage.w62
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ke5 a() {
        g26 d;
        long j;
        boolean z;
        Throwable th;
        h26 h26Var;
        g26 g26Var;
        IOException iOException = null;
        while (true) {
            try {
                if (((CopyOnWriteArrayList) this.R).isEmpty() && !((ue5) this.B).a(null)) {
                    c();
                    iOException.getClass();
                    throw iOException;
                } else if (!((ue5) this.B).k.m0) {
                    s35 s35Var = ((qz6) this.L).a;
                    long nanoTime = System.nanoTime();
                    long j2 = this.A - nanoTime;
                    if (!((CopyOnWriteArrayList) this.R).isEmpty() && j2 > 0) {
                        j = j2;
                        d = null;
                        if (d != null) {
                            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                            CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.R;
                            if (!copyOnWriteArrayList.isEmpty() && (g26Var = (g26) ((LinkedBlockingDeque) this.X).poll(j, timeUnit)) != null) {
                                copyOnWriteArrayList.remove(g26Var.a);
                                d = g26Var;
                                if (d != null) {
                                }
                            }
                            d = null;
                            if (d != null) {
                            }
                        }
                        boolean z2 = false;
                        if (d.b != null && d.c == null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            c();
                            if (!d.a.c()) {
                                d = d.a.g();
                            }
                            if (d.b == null && d.c == null) {
                                z2 = true;
                            }
                            if (z2) {
                                return d.a.b();
                            }
                        }
                        th = d.c;
                        if (th != null) {
                            if (th instanceof IOException) {
                                if (iOException == null) {
                                    iOException = (IOException) th;
                                } else {
                                    mb3.q(iOException, th);
                                }
                            } else {
                                throw th;
                            }
                        }
                        h26Var = d.b;
                        if (h26Var == null) {
                            ((ue5) this.B).p.addFirst(h26Var);
                        }
                    }
                    d = d();
                    j = 250000000;
                    this.A = nanoTime + 250000000;
                    if (d != null) {
                    }
                    boolean z22 = false;
                    if (d.b != null) {
                    }
                    z = false;
                    if (z) {
                    }
                    th = d.c;
                    if (th != null) {
                    }
                    h26Var = d.b;
                    if (h26Var == null) {
                    }
                } else {
                    throw new IOException("Canceled");
                }
            } finally {
                c();
            }
        }
    }

    @Override // defpackage.w62
    public ue5 b() {
        return (ue5) this.B;
    }

    public void c() {
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.R;
        Iterator it = copyOnWriteArrayList.iterator();
        it.getClass();
        while (it.hasNext()) {
            h26 h26Var = (h26) it.next();
            h26Var.cancel();
            h26 a = h26Var.a();
            if (a != null) {
                ((ue5) this.B).p.addLast(a);
            }
        }
        copyOnWriteArrayList.clear();
    }

    public g26 d() {
        h26 l92Var;
        ue5 ue5Var = (ue5) this.B;
        if (ue5Var.a(null)) {
            try {
                l92Var = ue5Var.b();
            } catch (Throwable th) {
                l92Var = new l92(th);
            }
            if (l92Var.c()) {
                return new g26(l92Var, (Throwable) null, 6);
            }
            if (l92Var instanceof l92) {
                return ((l92) l92Var).a;
            }
            ((CopyOnWriteArrayList) this.R).add(l92Var);
            ((qz6) this.L).d().c(new p92(az7.b + " connect " + ue5Var.i.h.g(), l92Var, this), 0L);
        }
        return null;
    }

    @Override // defpackage.nr6
    public synchronized void f(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3) {
        try {
            ((Cipher) this.L).init(1, (SecretKeySpec) this.B, gb.i((byte[]) this.R, this.A, false));
            this.A++;
            boolean hasRemaining = byteBuffer2.hasRemaining();
            Cipher cipher = (Cipher) this.L;
            if (hasRemaining) {
                cipher.update(byteBuffer, byteBuffer3);
                ((Cipher) this.L).doFinal(byteBuffer2, byteBuffer3);
            } else {
                cipher.doFinal(byteBuffer, byteBuffer3);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.nr6
    public ByteBuffer i() {
        return ((ByteBuffer) this.X).asReadOnlyBuffer();
    }

    @Override // defpackage.nr6
    public synchronized void j(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        ((Cipher) this.L).init(1, (SecretKeySpec) this.B, gb.i((byte[]) this.R, this.A, true));
        this.A++;
        ((Cipher) this.L).doFinal(byteBuffer, byteBuffer2);
    }

    public fb(ue5 ue5Var, qz6 qz6Var) {
        qz6Var.getClass();
        this.B = ue5Var;
        this.L = qz6Var;
        this.A = Long.MIN_VALUE;
        this.R = new CopyOnWriteArrayList();
        this.X = new LinkedBlockingDeque();
    }
}
