package defpackage;

import android.media.AudioAttributes;
import android.media.MediaPlayer;
import android.media.PlaybackParams;
import java.io.File;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: nq2  reason: default package */
/* loaded from: classes.dex */
public final class nq2 extends hw6 implements eo2 {
    public final /* synthetic */ qq2 X;
    public final /* synthetic */ File Y;
    public final /* synthetic */ float Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nq2(qq2 qq2Var, File file, float f, r41 r41Var) {
        super(2, r41Var);
        this.X = qq2Var;
        this.Y = file;
        this.Z = f;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        jg7 jg7Var = jg7.a;
        ((nq2) q((r41) obj2, (w61) obj)).s(jg7Var);
        return jg7Var;
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        return new nq2(this.X, this.Y, this.Z, r41Var);
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        x61 x61Var = x61.COROUTINE_SUSPENDED;
        oi2.Y(obj);
        qq2 qq2Var = this.X;
        MediaPlayer mediaPlayer = qq2Var.g;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
        }
        MediaPlayer mediaPlayer2 = qq2Var.g;
        if (mediaPlayer2 != null) {
            mediaPlayer2.release();
        }
        MediaPlayer mediaPlayer3 = new MediaPlayer();
        float f = this.Z;
        mediaPlayer3.setAudioAttributes(new AudioAttributes.Builder().setContentType(1).setUsage(14).build());
        final File file = this.Y;
        mediaPlayer3.setDataSource(file.getAbsolutePath());
        mediaPlayer3.prepare();
        try {
            PlaybackParams playbackParams = new PlaybackParams();
            playbackParams.setSpeed(f);
            mediaPlayer3.setPlaybackParams(playbackParams);
        } catch (Throwable unused) {
        }
        mediaPlayer3.start();
        mediaPlayer3.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: mq2
            @Override // android.media.MediaPlayer.OnCompletionListener
            public final void onCompletion(MediaPlayer mediaPlayer4) {
                file.delete();
            }
        });
        qq2Var.g = mediaPlayer3;
        return jg7.a;
    }
}
