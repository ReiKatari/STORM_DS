package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.nio.ByteBuffer;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: la  reason: default package */
/* loaded from: classes.dex */
public final class la implements xf6, yn {
    public final /* synthetic */ int A;
    public long B;
    public Object L;
    public Object R;
    public Object X;
    public Object Y;
    public Object Z;
    public Object c0;
    public Object d0;

    public la(x81 x81Var, bz6 bz6Var, Object obj, oo ooVar) {
        this.A = 2;
        q9 q9Var = new q9(26, x81Var.a);
        this.L = q9Var;
        this.R = bz6Var;
        this.X = obj;
        oo ooVar2 = (oo) bz6Var.a.n(obj);
        this.Y = ooVar2;
        this.Z = jv3.r(ooVar);
        this.d0 = bz6Var.b.n(q9Var.D(ooVar2, ooVar));
        if (((oo) q9Var.R) == null) {
            q9Var.R = ooVar2.c();
        }
        oo ooVar3 = (oo) q9Var.R;
        if (ooVar3 != null) {
            int b = ooVar3.b();
            long j = 0;
            for (int i = 0; i < b; i++) {
                ooVar2.getClass();
                j = Math.max(j, ((long) (Math.exp(((ou) ((dz4) q9Var.B).A).b(ooVar.a(i)) / (c92.a - 1.0d)) * 1000.0d)) * 1000000);
            }
            this.B = j;
            oo r = jv3.r(((q9) this.L).E(j, (oo) this.Y, ooVar));
            this.c0 = r;
            int b2 = r.b();
            for (int i2 = 0; i2 < b2; i2++) {
                oo ooVar4 = (oo) this.c0;
                float a = ooVar4.a(i2);
                ((q9) this.L).getClass();
                ((q9) this.L).getClass();
                ooVar4.e(i2, io2.l(a, -0.0f, RecyclerView.A1));
            }
            return;
        }
        b53.g0("velocityVector");
        throw null;
    }

    @Override // defpackage.yn
    public boolean a() {
        return false;
    }

    @Override // defpackage.xf6
    public synchronized void b(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3) {
        int position = byteBuffer3.position();
        byte[] i = ma.i((ma) this.d0, (byte[]) this.Z, this.B, false);
        ((Cipher) this.X).init(1, (SecretKeySpec) this.L, new IvParameterSpec(i));
        this.B++;
        ((Cipher) this.X).update(byteBuffer, byteBuffer3);
        ((Cipher) this.X).doFinal(byteBuffer2, byteBuffer3);
        ByteBuffer duplicate = byteBuffer3.duplicate();
        duplicate.flip();
        duplicate.position(position);
        ((Mac) this.Y).init((SecretKeySpec) this.R);
        ((Mac) this.Y).update(i);
        ((Mac) this.Y).update(duplicate);
        byteBuffer3.put(((Mac) this.Y).doFinal(), 0, ((ma) this.d0).c);
    }

    @Override // defpackage.yn
    public Object c(long j) {
        float f;
        if (!i(j)) {
            mi2 mi2Var = ((bz6) this.R).b;
            q9 q9Var = (q9) this.L;
            oo ooVar = (oo) this.Y;
            oo ooVar2 = (oo) this.Z;
            if (((oo) q9Var.L) == null) {
                q9Var.L = ooVar.c();
            }
            oo ooVar3 = (oo) q9Var.L;
            if (ooVar3 != null) {
                int b = ooVar3.b();
                int i = 0;
                while (true) {
                    oo ooVar4 = (oo) q9Var.L;
                    if (i < b) {
                        if (ooVar4 != null) {
                            float a = ooVar.a(i);
                            long j2 = j / 1000000;
                            b92 a2 = ((ou) ((dz4) q9Var.B).A).a(ooVar2.a(i));
                            long j3 = a2.c;
                            if (j3 > 0) {
                                f = ((float) j2) / ((float) j3);
                            } else {
                                f = 1.0f;
                            }
                            ooVar4.e(i, (Math.signum(a2.a) * a2.b * eh.a(f).a) + a);
                            i++;
                        } else {
                            b53.g0("valueVector");
                            throw null;
                        }
                    } else if (ooVar4 != null) {
                        return mi2Var.n(ooVar4);
                    } else {
                        b53.g0("valueVector");
                        throw null;
                    }
                }
            } else {
                b53.g0("valueVector");
                throw null;
            }
        } else {
            return this.d0;
        }
    }

    @Override // defpackage.yn
    public long d() {
        return this.B;
    }

    @Override // defpackage.yn
    public bz6 e() {
        return (bz6) this.R;
    }

    @Override // defpackage.yn
    public Object f() {
        return this.d0;
    }

    @Override // defpackage.yn
    public oo g(long j) {
        if (!i(j)) {
            return ((q9) this.L).E(j, (oo) this.Y, (oo) this.Z);
        }
        return (oo) this.c0;
    }

    @Override // defpackage.xf6
    public ByteBuffer h() {
        return ((ByteBuffer) this.c0).asReadOnlyBuffer();
    }

    @Override // defpackage.xf6
    public synchronized void j(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        int position = byteBuffer2.position();
        byte[] i = ma.i((ma) this.d0, (byte[]) this.Z, this.B, true);
        ((Cipher) this.X).init(1, (SecretKeySpec) this.L, new IvParameterSpec(i));
        this.B++;
        ((Cipher) this.X).doFinal(byteBuffer, byteBuffer2);
        ByteBuffer duplicate = byteBuffer2.duplicate();
        duplicate.flip();
        duplicate.position(position);
        ((Mac) this.Y).init((SecretKeySpec) this.R);
        ((Mac) this.Y).update(i);
        ((Mac) this.Y).update(duplicate);
        byteBuffer2.put(((Mac) this.Y).doFinal(), 0, ((ma) this.d0).c);
    }

    public String toString() {
        String num;
        switch (this.A) {
            case 1:
                StringBuilder sb = new StringBuilder("Archive with packed streams starting at offset ");
                sb.append(this.B);
                sb.append(", ");
                sb.append(Integer.toString(((long[]) this.L).length));
                sb.append(" pack sizes, ");
                long[] jArr = (long[]) this.X;
                String str = "(null)";
                if (jArr == null) {
                    num = "(null)";
                } else {
                    num = Integer.toString(jArr.length);
                }
                sb.append(num);
                sb.append(" CRCs, ");
                sb.append(Integer.toString(((md2[]) this.Y).length));
                sb.append(" folders, ");
                y16[] y16VarArr = (y16[]) this.c0;
                if (y16VarArr != null) {
                    str = Integer.toString(y16VarArr.length);
                }
                sb.append(str);
                sb.append(" files and ");
                sb.append((q9) this.d0);
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public la() {
        this.A = 1;
        this.L = new long[0];
        this.Y = md2.j;
        this.c0 = y16.q;
    }

    public la(ma maVar, byte[] bArr) {
        this.A = 0;
        this.d0 = maVar;
        this.B = 0L;
        this.X = (Cipher) a02.e.a("AES/CTR/NoPadding");
        a02 a02Var = a02.f;
        String str = maVar.b;
        this.Y = (Mac) a02Var.a(str);
        this.B = 0L;
        int i = maVar.a;
        byte[] a = d45.a(i);
        byte[] a2 = d45.a(7);
        this.Z = a2;
        ByteBuffer allocate = ByteBuffer.allocate(maVar.e());
        this.c0 = allocate;
        allocate.put((byte) maVar.e());
        allocate.put(a);
        allocate.put(a2);
        allocate.flip();
        byte[] F = nl2.F(maVar.f, maVar.g, a, bArr, i + 32);
        this.L = new SecretKeySpec(F, 0, i, "AES");
        this.R = new SecretKeySpec(F, i, 32, str);
    }
}
