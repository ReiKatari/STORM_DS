package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: iq1  reason: default package */
/* loaded from: classes.dex */
public final class iq1 extends defpackage.qm4 {
    public int j0;
    public int k0;
    public final defpackage.u63 l0;
    public final defpackage.u63 m0;

    public iq1(defpackage.u63 r2, defpackage.u63 r3) {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.j0 = r0
            r1.k0 = r0
            r1.l0 = r2
            r1.m0 = r3
            return
    }

    @Override // defpackage.qm4
    public final defpackage.jy j(defpackage.yq1 r2) {
            r1 = this;
            java.util.Map r0 = java.util.Collections.EMPTY_MAP
            jy r2 = super.j(r2)
            int r0 = defpackage.bp2.h()
            r1.j0 = r0
            int r0 = defpackage.bp2.h()
            r1.k0 = r0
            return r2
    }

    public final void v(long r10, android.view.Surface r12, defpackage.wv6 r13, android.graphics.SurfaceTexture r14, android.graphics.SurfaceTexture r15) {
            r9 = this;
            java.lang.Object r0 = r9.L
            java.util.concurrent.atomic.AtomicBoolean r0 = (java.util.concurrent.atomic.AtomicBoolean) r0
            r1 = 1
            defpackage.bp2.d(r0, r1)
            java.lang.Object r0 = r9.X
            java.lang.Thread r0 = (java.lang.Thread) r0
            defpackage.bp2.c(r0)
            java.lang.Object r0 = r9.R
            java.util.HashMap r0 = (java.util.HashMap) r0
            boolean r1 = r0.containsKey(r12)
            java.lang.String r2 = "The surface is not registered."
            defpackage.np2.A(r2, r1)
            java.lang.Object r1 = r0.get(r12)
            sy r1 = (defpackage.sy) r1
            java.util.Objects.requireNonNull(r1)
            sy r2 = defpackage.bp2.j
            if (r1 != r2) goto L33
            sy r1 = r9.d(r12)
            if (r1 != 0) goto L30
            goto L90
        L30:
            r0.put(r12, r1)
        L33:
            r3 = r1
            android.opengl.EGLSurface r0 = r3.a
            java.lang.Object r1 = r9.f0
            android.view.Surface r1 = (android.view.Surface) r1
            if (r12 == r1) goto L41
            r9.l(r0)
            r9.f0 = r12
        L41:
            r1 = 1065353216(0x3f800000, float:1.0)
            r2 = 0
            android.opengl.GLES20.glClearColor(r2, r2, r2, r1)
            r1 = 16384(0x4000, float:2.2959E-41)
            android.opengl.GLES20.glClear(r1)
            int r7 = r9.j0
            r8 = 1
            u63 r6 = r9.l0
            r2 = r9
            r4 = r13
            r5 = r14
            r2.w(r3, r4, r5, r6, r7, r8)
            int r7 = r2.k0
            r8 = 0
            u63 r6 = r2.m0
            r5 = r15
            r2.w(r3, r4, r5, r6, r7, r8)
            java.lang.Object r9 = r2.Y
            android.opengl.EGLDisplay r9 = (android.opengl.EGLDisplay) r9
            android.opengl.EGLExt.eglPresentationTimeANDROID(r9, r0, r10)
            java.lang.Object r9 = r2.Y
            android.opengl.EGLDisplay r9 = (android.opengl.EGLDisplay) r9
            boolean r9 = android.opengl.EGL14.eglSwapBuffers(r9, r0)
            if (r9 != 0) goto L90
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "Failed to swap buffers with EGL error: 0x"
            r9.<init>(r10)
            int r10 = android.opengl.EGL14.eglGetError()
            java.lang.String r10 = java.lang.Integer.toHexString(r10)
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            java.lang.String r10 = "DualOpenGlRenderer"
            defpackage.kj2.f0(r10, r9)
            r9 = 0
            r2.s(r12, r9)
        L90:
            return
    }

    public final void w(defpackage.sy r15, defpackage.wv6 r16, android.graphics.SurfaceTexture r17, defpackage.u63 r18, int r19, boolean r20) {
            r14 = this;
            r2 = r16
            r3 = r18
            r4 = r19
            r14.u(r4)
            int r4 = r15.b
            int r1 = r15.c
            r5 = 0
            android.opengl.GLES20.glViewport(r5, r5, r4, r1)
            android.opengl.GLES20.glScissor(r5, r5, r4, r1)
            r6 = 16
            float[] r9 = new float[r6]
            r7 = r17
            r7.getTransformMatrix(r9)
            float[] r7 = new float[r6]
            if (r20 == 0) goto L25
            float[] r2 = r2.X
        L23:
            r11 = r2
            goto L28
        L25:
            float[] r2 = r2.Y
            goto L23
        L28:
            r12 = 0
            r8 = 0
            r10 = 0
            android.opengl.Matrix.multiplyMM(r7, r8, r9, r10, r11, r12)
            java.lang.Object r0 = r14.h0
            zo2 r0 = (defpackage.zo2) r0
            r0.getClass()
            boolean r2 = r0 instanceof defpackage.ap2
            java.lang.String r8 = "glUniformMatrix4fv"
            r9 = 1
            if (r2 == 0) goto L47
            r2 = r0
            ap2 r2 = (defpackage.ap2) r2
            int r2 = r2.f
            android.opengl.GLES20.glUniformMatrix4fv(r2, r9, r5, r7, r5)
            defpackage.bp2.b(r8)
        L47:
            android.util.Size r2 = new android.util.Size
            float r7 = (float) r4
            java.lang.Object r10 = r3.L
            wr4 r10 = (defpackage.wr4) r10
            java.lang.Object r11 = r10.a
            java.lang.Object r12 = r10.b
            java.lang.Object r10 = r10.a
            java.lang.Float r10 = (java.lang.Float) r10
            float r10 = r10.floatValue()
            float r10 = r10 * r7
            int r7 = (int) r10
            float r10 = (float) r1
            r13 = r12
            java.lang.Float r13 = (java.lang.Float) r13
            float r13 = r13.floatValue()
            float r13 = r13 * r10
            int r10 = (int) r13
            r2.<init>(r7, r10)
            android.util.Size r7 = new android.util.Size
            r7.<init>(r4, r1)
            float[] r1 = new float[r6]
            android.opengl.Matrix.setIdentityM(r1, r5)
            float[] r4 = new float[r6]
            android.opengl.Matrix.setIdentityM(r4, r5)
            float[] r6 = new float[r6]
            android.opengl.Matrix.setIdentityM(r6, r5)
            int r10 = r2.getWidth()
            float r10 = (float) r10
            int r13 = r7.getWidth()
            float r13 = (float) r13
            float r10 = r10 / r13
            int r2 = r2.getHeight()
            float r2 = (float) r2
            int r7 = r7.getHeight()
            float r7 = (float) r7
            float r2 = r2 / r7
            r7 = 1065353216(0x3f800000, float:1.0)
            android.opengl.Matrix.scaleM(r1, r5, r10, r2, r7)
            java.lang.Object r2 = r3.B
            wr4 r2 = (defpackage.wr4) r2
            r3 = r11
            java.lang.Float r3 = (java.lang.Float) r3
            float r3 = r3.floatValue()
            r10 = 0
            int r3 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r3 != 0) goto Lb3
            r3 = r12
            java.lang.Float r3 = (java.lang.Float) r3
            float r3 = r3.floatValue()
            int r3 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r3 == 0) goto Ld4
        Lb3:
            java.lang.Object r3 = r2.a
            java.lang.Float r3 = (java.lang.Float) r3
            float r3 = r3.floatValue()
            java.lang.Float r11 = (java.lang.Float) r11
            float r11 = r11.floatValue()
            float r3 = r3 / r11
            java.lang.Object r2 = r2.b
            java.lang.Float r2 = (java.lang.Float) r2
            float r2 = r2.floatValue()
            java.lang.Float r12 = (java.lang.Float) r12
            float r11 = r12.floatValue()
            float r2 = r2 / r11
            android.opengl.Matrix.translateM(r4, r5, r3, r2, r10)
        Ld4:
            r2 = 0
            r3 = 0
            r10 = 0
            r16 = r1
            r17 = r2
            r19 = r3
            r18 = r4
            r14 = r6
            r15 = r10
            android.opengl.Matrix.multiplyMM(r14, r15, r16, r17, r18, r19)
            r1 = r14
            int r2 = r0.b
            android.opengl.GLES20.glUniformMatrix4fv(r2, r9, r5, r1, r5)
            defpackage.bp2.b(r8)
            int r0 = r0.c
            android.opengl.GLES20.glUniform1f(r0, r7)
            java.lang.String r0 = "glUniform1f"
            defpackage.bp2.b(r0)
            r0 = 3042(0xbe2, float:4.263E-42)
            android.opengl.GLES20.glEnable(r0)
            r1 = 770(0x302, float:1.079E-42)
            r2 = 771(0x303, float:1.08E-42)
            android.opengl.GLES20.glBlendFuncSeparate(r1, r2, r9, r2)
            r1 = 5
            r2 = 4
            android.opengl.GLES20.glDrawArrays(r1, r5, r2)
            java.lang.String r1 = "glDrawArrays"
            defpackage.bp2.b(r1)
            android.opengl.GLES20.glDisable(r0)
            return
    }
}
