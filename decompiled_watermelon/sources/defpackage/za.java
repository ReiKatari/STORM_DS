package defpackage;

import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: za  reason: default package */
/* loaded from: classes.dex */
public final class za implements xf6, f22 {
    public long A;
    public final Object B;
    public final Object L;
    public final Object R;
    public final Object X;

    public za(ab abVar, byte[] bArr) {
        this.A = 0L;
        this.L = (Cipher) a02.e.a("AES/GCM/NoPadding");
        this.A = 0L;
        int i = abVar.a;
        byte[] a = d45.a(i);
        byte[] a2 = d45.a(7);
        this.R = a2;
        ByteBuffer allocate = ByteBuffer.allocate(abVar.e());
        this.X = allocate;
        allocate.put((byte) abVar.e());
        allocate.put(a);
        allocate.put(a2);
        allocate.flip();
        this.B = new SecretKeySpec(nl2.F(abVar.d, abVar.e, a, bArr, i), "AES");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0058 A[Catch: all -> 0x001e, TryCatch #0 {all -> 0x001e, blocks: (B:3:0x0002, B:5:0x000c, B:12:0x0021, B:14:0x002b, B:22:0x0058, B:25:0x0066, B:28:0x0073, B:31:0x007c, B:33:0x0082, B:38:0x008b, B:40:0x0096, B:41:0x009c, B:43:0x00a0, B:47:0x00a7, B:50:0x00b1, B:52:0x00b5, B:55:0x00bb, B:56:0x00bf, B:57:0x00c3, B:58:0x00c4, B:60:0x00c8, B:20:0x004c, B:61:0x00d3, B:62:0x00da), top: B:65:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008b A[Catch: all -> 0x001e, TryCatch #0 {all -> 0x001e, blocks: (B:3:0x0002, B:5:0x000c, B:12:0x0021, B:14:0x002b, B:22:0x0058, B:25:0x0066, B:28:0x0073, B:31:0x007c, B:33:0x0082, B:38:0x008b, B:40:0x0096, B:41:0x009c, B:43:0x00a0, B:47:0x00a7, B:50:0x00b1, B:52:0x00b5, B:55:0x00bb, B:56:0x00bf, B:57:0x00c3, B:58:0x00c4, B:60:0x00c8, B:20:0x004c, B:61:0x00d3, B:62:0x00da), top: B:65:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b5 A[Catch: all -> 0x001e, TryCatch #0 {all -> 0x001e, blocks: (B:3:0x0002, B:5:0x000c, B:12:0x0021, B:14:0x002b, B:22:0x0058, B:25:0x0066, B:28:0x0073, B:31:0x007c, B:33:0x0082, B:38:0x008b, B:40:0x0096, B:41:0x009c, B:43:0x00a0, B:47:0x00a7, B:50:0x00b1, B:52:0x00b5, B:55:0x00bb, B:56:0x00bf, B:57:0x00c3, B:58:0x00c4, B:60:0x00c8, B:20:0x004c, B:61:0x00d3, B:62:0x00da), top: B:65:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x007c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x007c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x007b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0002 A[SYNTHETIC] */
    @Override // defpackage.f22
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.x45 a() {
        /*
            Method dump skipped, instructions count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.za.a():x45");
    }

    @Override // defpackage.xf6
    public synchronized void b(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3) {
        try {
            ((Cipher) this.L).init(1, (SecretKeySpec) this.B, ab.i((byte[]) this.R, this.A, false));
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

    public void c() {
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.R;
        Iterator it = copyOnWriteArrayList.iterator();
        it.getClass();
        while (it.hasNext()) {
            or5 or5Var = (or5) it.next();
            or5Var.cancel();
            or5 a = or5Var.a();
            if (a != null) {
                ((h55) this.B).p.addLast(a);
            }
        }
        copyOnWriteArrayList.clear();
    }

    public nr5 d() {
        or5 s42Var;
        h55 h55Var = (h55) this.B;
        if (h55Var.a(null)) {
            try {
                s42Var = h55Var.b();
            } catch (Throwable th) {
                s42Var = new s42(th);
            }
            if (s42Var.e()) {
                return new nr5(s42Var, (Throwable) null, 6);
            }
            if (s42Var instanceof s42) {
                return ((s42) s42Var).a;
            }
            ((CopyOnWriteArrayList) this.R).add(s42Var);
            ((fn6) this.L).d().c(new w42(ik7.b + " connect " + h55Var.i.h.g(), s42Var, this), 0L);
        }
        return null;
    }

    @Override // defpackage.f22
    public h55 e() {
        return (h55) this.B;
    }

    @Override // defpackage.xf6
    public ByteBuffer h() {
        return ((ByteBuffer) this.X).asReadOnlyBuffer();
    }

    @Override // defpackage.xf6
    public synchronized void j(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        ((Cipher) this.L).init(1, (SecretKeySpec) this.B, ab.i((byte[]) this.R, this.A, true));
        this.A++;
        ((Cipher) this.L).doFinal(byteBuffer, byteBuffer2);
    }

    public za(h55 h55Var, fn6 fn6Var) {
        fn6Var.getClass();
        this.B = h55Var;
        this.L = fn6Var;
        this.A = Long.MIN_VALUE;
        this.R = new CopyOnWriteArrayList();
        this.X = new LinkedBlockingDeque();
    }
}
