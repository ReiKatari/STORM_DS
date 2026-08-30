package me.magnum.melonds.ui.settings.fragments;

import android.content.Context;
import android.text.format.Formatter;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.preference.ListPreference;
import java.util.HashMap;
import java.util.List;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
@v81(c = "me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$observeShaderInstallWork$1", f = "VideoPreferencesFragment.kt", l = {1364}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class VideoPreferencesFragment$observeShaderInstallWork$1 extends nk6 implements aj2 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ VideoPreferencesFragment Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoPreferencesFragment$observeShaderInstallWork$1(VideoPreferencesFragment videoPreferencesFragment, j11 j11Var) {
        super(2, j11Var);
        this.Z = videoPreferencesFragment;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        return ((VideoPreferencesFragment$observeShaderInstallWork$1) t((j11) obj2, (o31) obj)).v(o27.a);
    }

    @Override // defpackage.m00
    public final j11 t(j11 j11Var, Object obj) {
        VideoPreferencesFragment$observeShaderInstallWork$1 videoPreferencesFragment$observeShaderInstallWork$1 = new VideoPreferencesFragment$observeShaderInstallWork$1(this.Z, j11Var);
        videoPreferencesFragment$observeShaderInstallWork$1.Y = obj;
        return videoPreferencesFragment$observeShaderInstallWork$1;
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        o31 o31Var = (o31) this.Y;
        p31 p31Var = p31.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i != 0) {
            if (i == 1) {
                me2.a0(obj);
            } else {
                defpackage.i.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            me2.a0(obj);
            VideoPreferencesFragment videoPreferencesFragment = this.Z;
            Context requireContext = videoPreferencesFragment.requireContext();
            requireContext.getClass();
            kh7 b = kh7.b(requireContext);
            b.getClass();
            u92 c = b.c("retroarch-shader-install");
            w92 w92Var = new w92(o31Var) { // from class: me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$observeShaderInstallWork$1.1

                /* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
                /* renamed from: me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$observeShaderInstallWork$1$1$WhenMappings */
                /* loaded from: classes.dex */
                public static final /* synthetic */ class WhenMappings {
                    public static final /* synthetic */ int[] a;

                    static {
                        int[] iArr = new int[ih7.values().length];
                        try {
                            iArr[ih7.ENQUEUED.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            iArr[ih7.BLOCKED.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        try {
                            iArr[ih7.RUNNING.ordinal()] = 3;
                        } catch (NoSuchFieldError unused3) {
                        }
                        try {
                            iArr[ih7.SUCCEEDED.ordinal()] = 4;
                        } catch (NoSuchFieldError unused4) {
                        }
                        try {
                            iArr[ih7.FAILED.ordinal()] = 5;
                        } catch (NoSuchFieldError unused5) {
                        }
                        try {
                            iArr[ih7.CANCELLED.ordinal()] = 6;
                        } catch (NoSuchFieldError unused6) {
                        }
                        a = iArr;
                    }
                }

                @Override // defpackage.w92
                public final Object b(Object obj2, j11 j11Var) {
                    Object kc5Var;
                    Object obj3 = 0;
                    jh7 jh7Var = (jh7) tq0.U0((List) obj2);
                    o27 o27Var = o27.a;
                    if (jh7Var != null) {
                        g81 g81Var = jh7Var.d;
                        int i2 = WhenMappings.a[jh7Var.b.ordinal()];
                        String str = "";
                        VideoPreferencesFragment videoPreferencesFragment2 = VideoPreferencesFragment.this;
                        switch (i2) {
                            case 1:
                            case 2:
                                videoPreferencesFragment2.x();
                                TextView textView = videoPreferencesFragment2.z0;
                                if (textView != null) {
                                    textView.setText(R.string.video_retroarch_shader_waiting_network);
                                }
                                ProgressBar progressBar = videoPreferencesFragment2.y0;
                                if (progressBar != null) {
                                    progressBar.setIndeterminate(true);
                                }
                                TextView textView2 = videoPreferencesFragment2.A0;
                                if (textView2 != null) {
                                    textView2.setText("");
                                    break;
                                }
                                break;
                            case 3:
                                videoPreferencesFragment2.x();
                                ProgressBar progressBar2 = videoPreferencesFragment2.y0;
                                if (progressBar2 != null) {
                                    g81 g81Var2 = jh7Var.e;
                                    String b2 = g81Var2.b("phase");
                                    HashMap hashMap = g81Var2.a;
                                    if (b2 != null) {
                                        int hashCode = b2.hashCode();
                                        if (hashCode != -1851889317) {
                                            if (hashCode != -1211129254) {
                                                if (hashCode == 751558593 && b2.equals("extracting")) {
                                                    Object obj4 = hashMap.get("entries_total");
                                                    if (!(obj4 instanceof Integer)) {
                                                        obj4 = obj3;
                                                    }
                                                    int intValue = ((Number) obj4).intValue();
                                                    Object obj5 = hashMap.get("entries_done");
                                                    if (obj5 instanceof Integer) {
                                                        obj3 = obj5;
                                                    }
                                                    int intValue2 = ((Number) obj3).intValue();
                                                    TextView textView3 = videoPreferencesFragment2.z0;
                                                    if (textView3 != null) {
                                                        textView3.setText(R.string.video_retroarch_shader_extracting);
                                                    }
                                                    if (intValue > 0) {
                                                        progressBar2.setIndeterminate(false);
                                                        progressBar2.setProgress((intValue2 * 100) / intValue);
                                                        TextView textView4 = videoPreferencesFragment2.A0;
                                                        if (textView4 != null) {
                                                            textView4.setText(intValue2 + " / " + intValue);
                                                            return o27Var;
                                                        }
                                                    } else {
                                                        progressBar2.setIndeterminate(true);
                                                        return o27Var;
                                                    }
                                                }
                                            } else if (b2.equals("downloading")) {
                                                long a = g81Var2.a("total_bytes");
                                                long a2 = g81Var2.a("downloaded_bytes");
                                                TextView textView5 = videoPreferencesFragment2.z0;
                                                if (textView5 != null) {
                                                    textView5.setText(R.string.video_retroarch_shader_downloading);
                                                }
                                                if (a > 0) {
                                                    progressBar2.setIndeterminate(false);
                                                    progressBar2.setProgress((int) ((100 * a2) / a));
                                                    TextView textView6 = videoPreferencesFragment2.A0;
                                                    if (textView6 != null) {
                                                        textView6.setText(videoPreferencesFragment2.getString(R.string.video_retroarch_shader_progress_bytes, Formatter.formatShortFileSize(videoPreferencesFragment2.requireContext(), a2), Formatter.formatShortFileSize(videoPreferencesFragment2.requireContext(), a)));
                                                        return o27Var;
                                                    }
                                                } else {
                                                    progressBar2.setIndeterminate(true);
                                                    return o27Var;
                                                }
                                            }
                                        } else if (b2.equals("finalizing")) {
                                            TextView textView7 = videoPreferencesFragment2.z0;
                                            if (textView7 != null) {
                                                textView7.setText(R.string.video_retroarch_shader_finalizing);
                                            }
                                            progressBar2.setIndeterminate(true);
                                            TextView textView8 = videoPreferencesFragment2.A0;
                                            if (textView8 != null) {
                                                textView8.setText("");
                                                return o27Var;
                                            }
                                        }
                                    }
                                }
                                break;
                            case 4:
                                VideoPreferencesFragment.k(videoPreferencesFragment2);
                                ListPreference listPreference = videoPreferencesFragment2.r0;
                                if (listPreference != null) {
                                    VideoPreferencesFragment.D(videoPreferencesFragment2, listPreference, null, false, 2);
                                }
                                videoPreferencesFragment2.q();
                                return o27Var;
                            case 5:
                                VideoPreferencesFragment.k(videoPreferencesFragment2);
                                String b3 = g81Var.b("failure_reason");
                                if (b3 != null) {
                                    str = b3;
                                }
                                try {
                                    kc5Var = bf5.valueOf(str);
                                } catch (Throwable th) {
                                    kc5Var = new kc5(th);
                                }
                                Object obj6 = bf5.HttpError;
                                if (kc5Var instanceof kc5) {
                                    kc5Var = obj6;
                                }
                                VideoPreferencesFragment.l(videoPreferencesFragment2, (bf5) kc5Var, g81Var.a("required_bytes"));
                                videoPreferencesFragment2.q();
                                return o27Var;
                            case ig7.b /* 6 */:
                                VideoPreferencesFragment.k(videoPreferencesFragment2);
                                videoPreferencesFragment2.q();
                                return o27Var;
                            default:
                                defpackage.i.c();
                                return null;
                        }
                    }
                    return o27Var;
                }
            };
            this.Y = null;
            this.X = 1;
            if (c.a(w92Var, this) == p31Var) {
                return p31Var;
            }
        }
        return o27.a;
    }
}
