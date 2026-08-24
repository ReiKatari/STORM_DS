package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: nq2  reason: default package */
/* loaded from: classes.dex */
public final class nq2 extends defpackage.hw6 implements defpackage.eo2 {
    public final /* synthetic */ defpackage.qq2 X;
    public final /* synthetic */ java.io.File Y;
    public final /* synthetic */ float Z;

    public nq2(defpackage.qq2 r1, java.io.File r2, float r3, defpackage.r41 r4) {
            r0 = this;
            r0.X = r1
            r0.Y = r2
            r0.Z = r3
            r1 = 2
            r0.<init>(r1, r4)
            return
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            w61 r1 = (defpackage.w61) r1
            r41 r2 = (defpackage.r41) r2
            r41 r0 = r0.q(r2, r1)
            nq2 r0 = (defpackage.nq2) r0
            jg7 r1 = defpackage.jg7.a
            r0.s(r1)
            return r1
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r3, java.lang.Object r4) {
            r2 = this;
            nq2 r4 = new nq2
            java.io.File r0 = r2.Y
            float r1 = r2.Z
            qq2 r2 = r2.X
            r4.<init>(r2, r0, r1, r3)
            return r4
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r5) {
            r4 = this;
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            defpackage.oi2.Y(r5)
            qq2 r5 = r4.X
            android.media.MediaPlayer r0 = r5.g
            if (r0 == 0) goto Le
            r0.stop()
        Le:
            android.media.MediaPlayer r0 = r5.g
            if (r0 == 0) goto L15
            r0.release()
        L15:
            android.media.MediaPlayer r0 = new android.media.MediaPlayer
            r0.<init>()
            float r1 = r4.Z
            android.media.AudioAttributes$Builder r2 = new android.media.AudioAttributes$Builder
            r2.<init>()
            r3 = 1
            android.media.AudioAttributes$Builder r2 = r2.setContentType(r3)
            r3 = 14
            android.media.AudioAttributes$Builder r2 = r2.setUsage(r3)
            android.media.AudioAttributes r2 = r2.build()
            r0.setAudioAttributes(r2)
            java.io.File r4 = r4.Y
            java.lang.String r2 = r4.getAbsolutePath()
            r0.setDataSource(r2)
            r0.prepare()
            android.media.PlaybackParams r2 = new android.media.PlaybackParams     // Catch: java.lang.Throwable -> L4a
            r2.<init>()     // Catch: java.lang.Throwable -> L4a
            r2.setSpeed(r1)     // Catch: java.lang.Throwable -> L4a
            r0.setPlaybackParams(r2)     // Catch: java.lang.Throwable -> L4a
        L4a:
            r0.start()
            mq2 r1 = new mq2
            r1.<init>(r4)
            r0.setOnCompletionListener(r1)
            r5.g = r0
            jg7 r4 = defpackage.jg7.a
            return r4
    }
}
