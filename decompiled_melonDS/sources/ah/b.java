package ah;

import android.opengl.GLES20;
import android.opengl.GLES30;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import me.magnum.melonds.ui.emulator.EmulatorActivity;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b implements ih.d {

    /* renamed from: a  reason: collision with root package name */
    public final EmulatorActivity f721a;

    /* renamed from: c  reason: collision with root package name */
    public hh.f1 f723c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f724d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f725e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f726f;

    /* renamed from: g  reason: collision with root package name */
    public int f727g;

    /* renamed from: h  reason: collision with root package name */
    public xd.a f728h;

    /* renamed from: i  reason: collision with root package name */
    public xd.a f729i;

    /* renamed from: j  reason: collision with root package name */
    public int f730j;

    /* renamed from: k  reason: collision with root package name */
    public int f731k;

    /* renamed from: l  reason: collision with root package name */
    public int f732l;
    public int m;

    /* renamed from: n  reason: collision with root package name */
    public int f733n;

    /* renamed from: p  reason: collision with root package name */
    public oe.h0 f735p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f736q;

    /* renamed from: r  reason: collision with root package name */
    public oe.b0 f737r;

    /* renamed from: s  reason: collision with root package name */
    public oe.b0 f738s;

    /* renamed from: v  reason: collision with root package name */
    public boolean f741v;

    /* renamed from: w  reason: collision with root package name */
    public float f742w;

    /* renamed from: x  reason: collision with root package name */
    public float f743x;

    /* renamed from: y  reason: collision with root package name */
    public int f744y;

    /* renamed from: z  reason: collision with root package name */
    public int f745z;

    /* renamed from: b  reason: collision with root package name */
    public final Object f722b = new Object();

    /* renamed from: o  reason: collision with root package name */
    public final Object f734o = new Object();

    /* renamed from: t  reason: collision with root package name */
    public float f739t = 1.0f;

    /* renamed from: u  reason: collision with root package name */
    public float f740u = 1.0f;

    public b(EmulatorActivity emulatorActivity) {
        this.f721a = emulatorActivity;
    }

    /* JADX WARN: Type inference failed for: r1v10, types: [java.util.Map, java.lang.Object] */
    public final void a() {
        float[] fArr;
        yb.j jVar;
        int i2;
        int i10;
        oe.u0 u0Var;
        float[] fArr2;
        float[] fArr3 = {0.0f, 0.4974093f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.4974093f, 1.0f, 0.0f, 1.0f, 0.4974093f};
        float[] fArr4 = {0.0f, 1.0f, 0.0f, 0.50259066f, 1.0f, 0.50259066f, 0.0f, 1.0f, 1.0f, 0.50259066f, 1.0f, 1.0f};
        float[] fArr5 = null;
        if (this.f741v) {
            oe.b0 b0Var = this.f738s;
            if (b0Var != null) {
                fArr2 = b(b0Var, fArr4, this.f740u);
            } else {
                fArr2 = null;
            }
            oe.b0 b0Var2 = this.f737r;
            if (b0Var2 != null) {
                fArr5 = b(b0Var2, fArr3, this.f739t);
            }
            jVar = new yb.j(fArr2, fArr5);
        } else {
            oe.b0 b0Var3 = this.f737r;
            if (b0Var3 != null) {
                fArr = b(b0Var3, fArr3, this.f739t);
            } else {
                fArr = null;
            }
            oe.b0 b0Var4 = this.f738s;
            if (b0Var4 != null) {
                fArr5 = b(b0Var4, fArr4, this.f740u);
            }
            jVar = new yb.j(fArr, fArr5);
        }
        float[] fArr6 = (float[]) jVar.A;
        float[] fArr7 = (float[]) jVar.B;
        if (fArr6 != null) {
            i2 = fArr6.length;
        } else {
            i2 = 0;
        }
        if (fArr7 != null) {
            i10 = fArr7.length;
        } else {
            i10 = 0;
        }
        int i11 = (i2 + i10) * 4;
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(i11).order(ByteOrder.nativeOrder()).asFloatBuffer();
        if (fArr7 != null) {
            asFloatBuffer.put(fArr7);
        }
        if (fArr6 != null) {
            asFloatBuffer.put(fArr6);
        }
        asFloatBuffer.position(0);
        GLES30.glBindVertexArray(this.f731k);
        GLES20.glBindBuffer(34962, this.f730j);
        GLES20.glBufferData(34962, i11, asFloatBuffer, 35044);
        this.f732l = asFloatBuffer.capacity() / 5;
        xd.a aVar = this.f728h;
        if (aVar != null) {
            GLES20.glDeleteShader(aVar.f14532a);
            GLES20.glDeleteShader(aVar.f14533b);
            GLES20.glDeleteProgram(aVar.f14534c);
        }
        hh.f1 f1Var = this.f723c;
        if (f1Var == null || (u0Var = f1Var.f6524a) == null) {
            u0Var = oe.u0.NONE;
        }
        Object obj = xd.e.f14553a;
        u0Var.getClass();
        xd.d dVar = (xd.d) xd.e.f14553a.get(u0Var);
        if (dVar == null) {
            dVar = xd.d.f14542e;
        }
        this.f728h = p7.o.h(dVar);
    }

    public final float[] b(oe.b0 b0Var, float[] fArr, float f8) {
        int i2 = b0Var.f10912a;
        float f10 = this.f742w;
        float f11 = ((i2 / f10) * 2.0f) - 1.0f;
        float f12 = (((i2 + b0Var.f10914c) / f10) * 2.0f) - 1.0f;
        int i10 = b0Var.f10913b;
        float f13 = this.f743x;
        float f14 = 1.0f - ((i10 / f13) * 2.0f);
        float f15 = 1.0f - (((i10 + b0Var.f10915d) / f13) * 2.0f);
        return new float[]{f11, f15, fArr[0], fArr[1], f8, f11, f14, fArr[2], fArr[3], f8, f12, f14, fArr[4], fArr[5], f8, f11, f15, fArr[6], fArr[7], f8, f12, f14, fArr[8], fArr[9], f8, f12, f15, fArr[10], fArr[11], f8};
    }

    public final void c(we.a aVar) {
        aVar.getClass();
        synchronized (this.f722b) {
            if (this.f724d) {
                a();
                this.f724d = false;
            }
        }
        GLES20.glClear(16640);
        if (aVar.f14212a) {
            synchronized (this.f734o) {
                e();
            }
            xd.a aVar2 = this.f728h;
            if (aVar2 != null) {
                GLES20.glDisable(2929);
                GLES20.glEnable(3042);
                GLES20.glBlendFunc(770, 771);
                GLES30.glBindVertexArray(this.f731k);
                GLES20.glBindBuffer(34962, this.f730j);
                GLES20.glUseProgram(aVar2.f14534c);
                GLES20.glEnableVertexAttribArray(aVar2.f14536e);
                GLES20.glEnableVertexAttribArray(aVar2.f14537f);
                int i2 = aVar2.f14538g;
                if (i2 != -1) {
                    GLES20.glEnableVertexAttribArray(i2);
                }
                GLES20.glActiveTexture(33984);
                GLES20.glBindTexture(3553, aVar.f14213b);
                GLES20.glTexParameteri(3553, 10241, aVar2.f14535d);
                GLES20.glTexParameteri(3553, 10240, aVar2.f14535d);
                GLES20.glVertexAttribPointer(aVar2.f14537f, 2, 5126, false, 20, 0);
                GLES20.glVertexAttribPointer(aVar2.f14536e, 2, 5126, false, 20, 8);
                GLES20.glVertexAttribPointer(aVar2.f14538g, 1, 5126, false, 20, 16);
                GLES20.glUniform1i(aVar2.f14539h, 0);
                GLES20.glDrawArrays(4, 0, this.f732l);
                GLES30.glBindVertexArray(0);
                GLES20.glBindBuffer(34962, 0);
            }
        }
    }

    public final void d() {
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        GLES20.glClear(16640);
        GLES20.glDisable(2884);
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        int i2 = iArr[0];
        this.f727g = i2;
        GLES20.glBindTexture(3553, i2);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        int[] iArr2 = new int[2];
        int[] iArr3 = new int[2];
        GLES20.glGenBuffers(2, iArr2, 0);
        GLES30.glGenVertexArrays(2, iArr3, 0);
        this.f730j = iArr2[0];
        this.f731k = iArr3[0];
        this.m = iArr2[1];
        this.f733n = iArr3[1];
        this.f729i = p7.o.h(xd.d.f14541d);
        synchronized (this.f722b) {
            this.f724d = true;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:9|(4:10|11|(2:13|14)|16)|(9:22|(2:27|23)|28|29|(1:31)(1:39)|32|(1:34)|35|(1:37))|42|28|29|(0)(0)|32|(0)|35|(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0082, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0086, code lost:
        r0 = new yb.k(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0076 A[Catch: all -> 0x0082, TRY_LEAVE, TryCatch #0 {all -> 0x0082, blocks: (B:40:0x006c, B:42:0x0076), top: B:111:0x006c }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e() {
        /*
            Method dump skipped, instructions count: 1216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ah.b.e():void");
    }

    public final void f(oe.b0 b0Var, oe.b0 b0Var2, float f8, float f10, boolean z10) {
        synchronized (this.f722b) {
            this.f737r = b0Var;
            this.f738s = b0Var2;
            this.f739t = f8;
            this.f740u = f10;
            this.f741v = z10;
            this.f724d = true;
        }
    }
}
