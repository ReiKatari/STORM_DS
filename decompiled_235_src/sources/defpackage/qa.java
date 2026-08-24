package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.nio.ByteBuffer;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qa  reason: default package */
/* loaded from: classes.dex */
public final class qa implements nr6, lo {
    public final /* synthetic */ int A;
    public long B;
    public Object L;
    public Object R;
    public Object X;
    public Object Y;
    public Object Z;
    public Object d0;
    public Object e0;

    public qa(oc1 oc1Var, wc7 wc7Var, Object obj, ap apVar) {
        this.A = 2;
        eb ebVar = new eb(oc1Var.a, 26);
        this.L = ebVar;
        this.R = wc7Var;
        this.X = obj;
        ap apVar2 = (ap) wc7Var.a.g(obj);
        this.Y = apVar2;
        this.Z = nw7.R(apVar);
        this.e0 = wc7Var.b.g(ebVar.E(apVar2, apVar));
        if (((ap) ebVar.R) == null) {
            ebVar.R = apVar2.c();
        }
        ap apVar3 = (ap) ebVar.R;
        if (apVar3 != null) {
            int b = apVar3.b();
            long j = 0;
            for (int i = 0; i < b; i++) {
                apVar2.getClass();
                j = Math.max(j, ((long) (Math.exp(((gv) ((s35) ebVar.B).A).b(apVar.a(i)) / (ud2.a - 1.0d)) * 1000.0d)) * 1000000);
            }
            this.B = j;
            ap R = nw7.R(((eb) this.L).F(j, (ap) this.Y, apVar));
            this.d0 = R;
            int b2 = R.b();
            for (int i2 = 0; i2 < b2; i2++) {
                ap apVar4 = (ap) this.d0;
                float a = apVar4.a(i2);
                ((eb) this.L).getClass();
                ((eb) this.L).getClass();
                apVar4.e(i2, gi2.p(a, -0.0f, RecyclerView.B1));
            }
            return;
        }
        nb3.a0("velocityVector");
        throw null;
    }

    @Override // defpackage.lo
    public boolean a() {
        return false;
    }

    @Override // defpackage.lo
    public long b() {
        return this.B;
    }

    @Override // defpackage.lo
    public wc7 c() {
        return (wc7) this.R;
    }

    @Override // defpackage.lo
    public ap d(long j) {
        if (!e(j)) {
            return ((eb) this.L).F(j, (ap) this.Y, (ap) this.Z);
        }
        return (ap) this.d0;
    }

    @Override // defpackage.nr6
    public synchronized void f(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3) {
        int position = byteBuffer3.position();
        byte[] i = ra.i((ra) this.e0, (byte[]) this.Z, this.B, false);
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
        byteBuffer3.put(((Mac) this.Y).doFinal(), 0, ((ra) this.e0).c);
    }

    @Override // defpackage.lo
    public Object g(long j) {
        float f;
        if (!e(j)) {
            qn2 qn2Var = ((wc7) this.R).b;
            eb ebVar = (eb) this.L;
            ap apVar = (ap) this.Y;
            ap apVar2 = (ap) this.Z;
            if (((ap) ebVar.L) == null) {
                ebVar.L = apVar.c();
            }
            ap apVar3 = (ap) ebVar.L;
            if (apVar3 != null) {
                int b = apVar3.b();
                int i = 0;
                while (true) {
                    ap apVar4 = (ap) ebVar.L;
                    if (i < b) {
                        if (apVar4 != null) {
                            float a = apVar.a(i);
                            long j2 = j / 1000000;
                            td2 a2 = ((gv) ((s35) ebVar.B).A).a(apVar2.a(i));
                            long j3 = a2.c;
                            if (j3 > 0) {
                                f = ((float) j2) / ((float) j3);
                            } else {
                                f = 1.0f;
                            }
                            apVar4.e(i, (Math.signum(a2.a) * a2.b * qh.a(f).a) + a);
                            i++;
                        } else {
                            nb3.a0("valueVector");
                            throw null;
                        }
                    } else if (apVar4 != null) {
                        return qn2Var.g(apVar4);
                    } else {
                        nb3.a0("valueVector");
                        throw null;
                    }
                }
            } else {
                nb3.a0("valueVector");
                throw null;
            }
        } else {
            return this.e0;
        }
    }

    @Override // defpackage.lo
    public Object h() {
        return this.e0;
    }

    @Override // defpackage.nr6
    public ByteBuffer i() {
        return ((ByteBuffer) this.d0).asReadOnlyBuffer();
    }

    @Override // defpackage.nr6
    public synchronized void j(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        int position = byteBuffer2.position();
        byte[] i = ra.i((ra) this.e0, (byte[]) this.Z, this.B, true);
        ((Cipher) this.X).init(1, (SecretKeySpec) this.L, new IvParameterSpec(i));
        this.B++;
        ((Cipher) this.X).doFinal(byteBuffer, byteBuffer2);
        ByteBuffer duplicate = byteBuffer2.duplicate();
        duplicate.flip();
        duplicate.position(position);
        ((Mac) this.Y).init((SecretKeySpec) this.R);
        ((Mac) this.Y).update(i);
        ((Mac) this.Y).update(duplicate);
        byteBuffer2.put(((Mac) this.Y).doFinal(), 0, ((ra) this.e0).c);
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
                sb.append(Integer.toString(((fi2[]) this.Y).length));
                sb.append(" folders, ");
                md6[] md6VarArr = (md6[]) this.d0;
                if (md6VarArr != null) {
                    str = Integer.toString(md6VarArr.length);
                }
                sb.append(str);
                sb.append(" files and ");
                sb.append((eb) this.e0);
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public qa() {
        this.A = 1;
        this.L = new long[0];
        this.Y = fi2.j;
        this.d0 = md6.q;
    }

    public qa(ra raVar, byte[] bArr) {
        this.A = 0;
        this.e0 = raVar;
        this.B = 0L;
        this.X = (Cipher) p42.e.a("AES/CTR/NoPadding");
        p42 p42Var = p42.f;
        String str = raVar.b;
        this.Y = (Mac) p42Var.a(str);
        this.B = 0L;
        int i = raVar.a;
        byte[] a = nd5.a(i);
        byte[] a2 = nd5.a(7);
        this.Z = a2;
        ByteBuffer allocate = ByteBuffer.allocate(raVar.e());
        this.d0 = allocate;
        allocate.put((byte) raVar.e());
        allocate.put(a);
        allocate.put(a2);
        allocate.flip();
        byte[] v = gi2.v(raVar.f, raVar.g, a, bArr, i + 32);
        this.L = new SecretKeySpec(v, 0, i, "AES");
        this.R = new SecretKeySpec(v, i, 32, str);
    }
}
