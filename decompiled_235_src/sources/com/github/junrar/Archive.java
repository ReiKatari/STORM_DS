package com.github.junrar;

import com.github.junrar.crypt.Rijndael;
import com.github.junrar.exception.BadRarArchiveException;
import com.github.junrar.exception.CorruptHeaderException;
import com.github.junrar.exception.CrcErrorException;
import com.github.junrar.exception.HeaderNotInArchiveException;
import com.github.junrar.exception.InitDeciphererFailedException;
import com.github.junrar.exception.MainHeaderNullException;
import com.github.junrar.exception.NotRarArchiveException;
import com.github.junrar.exception.RarException;
import com.github.junrar.exception.UnsupportedRarEncryptedException;
import com.github.junrar.exception.UnsupportedRarV5Exception;
import com.github.junrar.io.RawDataIo;
import com.github.junrar.io.SeekableReadOnlyByteChannel;
import com.github.junrar.rarfile.AVHeader;
import com.github.junrar.rarfile.BaseBlock;
import com.github.junrar.rarfile.BlockHeader;
import com.github.junrar.rarfile.CommentHeader;
import com.github.junrar.rarfile.EAHeader;
import com.github.junrar.rarfile.EndArcHeader;
import com.github.junrar.rarfile.FileHeader;
import com.github.junrar.rarfile.MacInfoHeader;
import com.github.junrar.rarfile.MainHeader;
import com.github.junrar.rarfile.MarkHeader;
import com.github.junrar.rarfile.ProtectHeader;
import com.github.junrar.rarfile.RARVersion;
import com.github.junrar.rarfile.SignHeader;
import com.github.junrar.rarfile.SubBlockHeader;
import com.github.junrar.rarfile.SubBlockHeaderType;
import com.github.junrar.rarfile.UnixOwnersHeader;
import com.github.junrar.rarfile.UnrarHeadertype;
import com.github.junrar.unpack.ComprDataIO;
import com.github.junrar.unpack.Unpack;
import com.github.junrar.volume.FileVolumeManager;
import com.github.junrar.volume.InputStreamVolumeManager;
import com.github.junrar.volume.Volume;
import com.github.junrar.volume.VolumeManager;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.Function;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class Archive implements Closeable, Iterable<FileHeader> {
    private static final int MAX_HEADER_SIZE = 20971520;
    private SeekableReadOnlyByteChannel channel;
    private int currentHeaderIndex;
    private final ComprDataIO dataIO;
    private final List<BaseBlock> headers;
    private MarkHeader markHead;
    private MainHeader newMhd;
    private FileHeader nextFileHeader;
    private String password;
    private long totalPackedRead;
    private long totalPackedSize;
    private Unpack unpack;
    private final UnrarCallback unrarCallback;
    private Volume volume;
    private VolumeManager volumeManager;
    private static final ry3 logger = sy3.d(Archive.class);
    private static final int PIPE_BUFFER_SIZE = ((Integer) getPropertyAs("junrar.extractor.buffer-size", new bu(0), 32768)).intValue();
    private static final boolean USE_EXECUTOR = ((Boolean) getPropertyAs("junrar.extractor.use-executor", new bu(1), Boolean.TRUE)).booleanValue();

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* renamed from: com.github.junrar.Archive$2  reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$com$github$junrar$rarfile$SubBlockHeaderType;
        static final /* synthetic */ int[] $SwitchMap$com$github$junrar$rarfile$UnrarHeadertype;

        static {
            int[] iArr = new int[UnrarHeadertype.values().length];
            $SwitchMap$com$github$junrar$rarfile$UnrarHeadertype = iArr;
            try {
                iArr[UnrarHeadertype.NewSubHeader.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$github$junrar$rarfile$UnrarHeadertype[UnrarHeadertype.FileHeader.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$github$junrar$rarfile$UnrarHeadertype[UnrarHeadertype.ProtectHeader.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$github$junrar$rarfile$UnrarHeadertype[UnrarHeadertype.SubHeader.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$github$junrar$rarfile$UnrarHeadertype[UnrarHeadertype.MarkHeader.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$github$junrar$rarfile$UnrarHeadertype[UnrarHeadertype.MainHeader.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$github$junrar$rarfile$UnrarHeadertype[UnrarHeadertype.SignHeader.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$github$junrar$rarfile$UnrarHeadertype[UnrarHeadertype.AvHeader.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$github$junrar$rarfile$UnrarHeadertype[UnrarHeadertype.CommHeader.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$github$junrar$rarfile$UnrarHeadertype[UnrarHeadertype.EndArcHeader.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            int[] iArr2 = new int[SubBlockHeaderType.values().length];
            $SwitchMap$com$github$junrar$rarfile$SubBlockHeaderType = iArr2;
            try {
                iArr2[SubBlockHeaderType.MAC_HEAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$github$junrar$rarfile$SubBlockHeaderType[SubBlockHeaderType.BEEA_HEAD.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$github$junrar$rarfile$SubBlockHeaderType[SubBlockHeaderType.EA_HEAD.ordinal()] = 3;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$github$junrar$rarfile$SubBlockHeaderType[SubBlockHeaderType.NTACL_HEAD.ordinal()] = 4;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$github$junrar$rarfile$SubBlockHeaderType[SubBlockHeaderType.STREAM_HEAD.ordinal()] = 5;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$github$junrar$rarfile$SubBlockHeaderType[SubBlockHeaderType.UO_HEAD.ordinal()] = 6;
            } catch (NoSuchFieldError unused16) {
            }
        }
    }

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* loaded from: classes.dex */
    public static final class EmptyInputStream extends InputStream {
        private EmptyInputStream() {
        }

        @Override // java.io.InputStream
        public int available() {
            return 0;
        }

        @Override // java.io.InputStream
        public int read() {
            return -1;
        }
    }

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* loaded from: classes.dex */
    public static final class ExtractorExecutorHolder {
        private static final AtomicLong threadIndex = new AtomicLong();
        private static final ExecutorService cachedExecutorService = new ThreadPoolExecutor(0, getMaxThreads(), getThreadKeepAlive(), TimeUnit.SECONDS, new SynchronousQueue(), (ThreadFactory) new Object());

        private ExtractorExecutorHolder() {
        }

        private static int getMaxThreads() {
            return ((Integer) Archive.getPropertyAs("junrar.extractor.max-threads", new bu(0), Integer.MAX_VALUE)).intValue();
        }

        private static int getThreadKeepAlive() {
            return ((Integer) Archive.getPropertyAs("junrar.extractor.thread-keep-alive-seconds", new bu(0), 5)).intValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Thread lambda$static$0(Runnable runnable) {
            Thread thread = new Thread(runnable, "junrar-extractor-" + threadIndex.getAndIncrement());
            thread.setDaemon(true);
            return thread;
        }
    }

    public Archive(VolumeManager volumeManager, UnrarCallback unrarCallback, String str) {
        this.headers = new ArrayList();
        this.markHead = null;
        this.newMhd = null;
        this.totalPackedSize = 0L;
        this.totalPackedRead = 0L;
        this.volumeManager = volumeManager;
        this.unrarCallback = unrarCallback;
        this.password = str;
        try {
            setVolume(volumeManager.nextVolume(this, null));
            this.dataIO = new ComprDataIO(this);
        } catch (RarException | IOException e) {
            try {
                close();
            } catch (IOException unused) {
                logger.i();
            }
            throw e;
        }
    }

    private void doExtractFile(FileHeader fileHeader, OutputStream outputStream) {
        long j;
        long unpFileCRC;
        this.dataIO.init(outputStream);
        this.dataIO.init(fileHeader);
        ComprDataIO comprDataIO = this.dataIO;
        if (isOldFormat()) {
            j = 0;
        } else {
            j = -1;
        }
        comprDataIO.setUnpFileCRC(j);
        if (this.unpack == null) {
            this.unpack = new Unpack(this.dataIO);
        }
        if (!fileHeader.isSolid()) {
            this.unpack.init(null);
        }
        this.unpack.setDestSize(fileHeader.getFullUnpackSize());
        try {
            this.unpack.doUnpack(fileHeader.getUnpVersion(), fileHeader.isSolid());
            FileHeader subHeader = this.dataIO.getSubHeader();
            boolean isSplitAfter = subHeader.isSplitAfter();
            ComprDataIO comprDataIO2 = this.dataIO;
            if (isSplitAfter) {
                unpFileCRC = comprDataIO2.getPackedCRC();
            } else {
                unpFileCRC = comprDataIO2.getUnpFileCRC();
            }
            if ((~unpFileCRC) == subHeader.getFileCRC()) {
                return;
            }
            throw new CrcErrorException();
        } catch (Exception e) {
            this.unpack.cleanUp();
            if (e instanceof RarException) {
                throw ((RarException) e);
            }
            throw new RarException(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T> T getPropertyAs(String str, Function<String, T> function, T t) {
        Objects.requireNonNull(t, "default value must not be null");
        try {
            String property = System.getProperty(str);
            if (property != null && !property.isEmpty()) {
                return function.apply(property);
            }
            return t;
        } catch (NumberFormatException | SecurityException e) {
            logger.l(str, au.h(t.getClass()), t, e);
            return t;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getInputStream$0(FileHeader fileHeader, PipedOutputStream pipedOutputStream) {
        try {
            try {
                extractFile(fileHeader, pipedOutputStream);
                pipedOutputStream.close();
            } catch (IOException unused) {
            }
        } catch (RarException unused2) {
            pipedOutputStream.close();
        } catch (Throwable th) {
            try {
                pipedOutputStream.close();
            } catch (IOException unused3) {
            }
            throw th;
        }
    }

    private void readHeaders(long j) {
        EndArcHeader endArcHeader;
        this.markHead = null;
        this.newMhd = null;
        this.headers.clear();
        int i = 0;
        this.currentHeaderIndex = 0;
        HashSet hashSet = new HashSet();
        while (true) {
            RawDataIo rawDataIo = new RawDataIo(this.channel);
            byte[] safelyAllocate = safelyAllocate(7L, MAX_HEADER_SIZE);
            MainHeader mainHeader = this.newMhd;
            if (mainHeader != null && mainHeader.isEncrypted()) {
                byte[] bArr = new byte[8];
                rawDataIo.readFully(bArr, 8);
                try {
                    rawDataIo.setCipher(Rijndael.buildDecipherer(this.password, bArr));
                } catch (Exception e) {
                    throw new InitDeciphererFailedException(e);
                }
            }
            long position = this.channel.getPosition();
            if (position >= j || rawDataIo.readFully(safelyAllocate, safelyAllocate.length) == 0) {
                return;
            }
            BaseBlock baseBlock = new BaseBlock(safelyAllocate);
            baseBlock.setPositionInFile(position);
            UnrarHeadertype headerType = baseBlock.getHeaderType();
            if (headerType != null) {
                int[] iArr = AnonymousClass2.$SwitchMap$com$github$junrar$rarfile$UnrarHeadertype;
                int i2 = 6;
                switch (iArr[headerType.ordinal()]) {
                    case 5:
                        MarkHeader markHeader = new MarkHeader(baseBlock);
                        this.markHead = markHeader;
                        boolean isSignature = markHeader.isSignature();
                        MarkHeader markHeader2 = this.markHead;
                        if (!isSignature) {
                            if (markHeader2.getVersion() == RARVersion.V5) {
                                logger.q("Support for rar version 5 is not yet implemented!");
                                throw new UnsupportedRarV5Exception();
                            }
                            throw new BadRarArchiveException();
                        } else if (markHeader2.isValid()) {
                            this.headers.add(this.markHead);
                            break;
                        } else {
                            throw new CorruptHeaderException("Invalid Mark Header");
                        }
                    case 6:
                        if (baseBlock.hasEncryptVersion()) {
                            i2 = 7;
                        }
                        byte[] safelyAllocate2 = safelyAllocate(i2, MAX_HEADER_SIZE);
                        rawDataIo.readFully(safelyAllocate2, safelyAllocate2.length);
                        MainHeader mainHeader2 = new MainHeader(baseBlock, safelyAllocate2);
                        this.headers.add(mainHeader2);
                        this.newMhd = mainHeader2;
                        break;
                    case 7:
                        byte[] safelyAllocate3 = safelyAllocate(8L, MAX_HEADER_SIZE);
                        rawDataIo.readFully(safelyAllocate3, safelyAllocate3.length);
                        this.headers.add(new SignHeader(baseBlock, safelyAllocate3));
                        break;
                    case 8:
                        byte[] safelyAllocate4 = safelyAllocate(7L, MAX_HEADER_SIZE);
                        rawDataIo.readFully(safelyAllocate4, safelyAllocate4.length);
                        this.headers.add(new AVHeader(baseBlock, safelyAllocate4));
                        break;
                    case 9:
                        byte[] safelyAllocate5 = safelyAllocate(6L, MAX_HEADER_SIZE);
                        rawDataIo.readFully(safelyAllocate5, safelyAllocate5.length);
                        CommentHeader commentHeader = new CommentHeader(baseBlock, safelyAllocate5);
                        this.headers.add(commentHeader);
                        long positionInFile = commentHeader.getPositionInFile() + commentHeader.getHeaderSize(isEncrypted());
                        this.channel.setPosition(positionInFile);
                        if (!hashSet.contains(Long.valueOf(positionInFile))) {
                            hashSet.add(Long.valueOf(positionInFile));
                            break;
                        } else {
                            throw new BadRarArchiveException();
                        }
                    case 10:
                        if (baseBlock.hasArchiveDataCRC()) {
                            i = 4;
                        }
                        if (baseBlock.hasVolumeNumber()) {
                            i += 2;
                        }
                        if (i > 0) {
                            byte[] safelyAllocate6 = safelyAllocate(i, MAX_HEADER_SIZE);
                            rawDataIo.readFully(safelyAllocate6, safelyAllocate6.length);
                            endArcHeader = new EndArcHeader(baseBlock, safelyAllocate6);
                        } else {
                            endArcHeader = new EndArcHeader(baseBlock, null);
                        }
                        if (!this.newMhd.isMultiVolume() && !endArcHeader.isValid()) {
                            throw new CorruptHeaderException("Invalid End Archive Header");
                        }
                        this.headers.add(endArcHeader);
                        return;
                    default:
                        byte[] safelyAllocate7 = safelyAllocate(4L, MAX_HEADER_SIZE);
                        rawDataIo.readFully(safelyAllocate7, safelyAllocate7.length);
                        BlockHeader blockHeader = new BlockHeader(baseBlock, safelyAllocate7);
                        int i3 = iArr[blockHeader.getHeaderType().ordinal()];
                        if (i3 != 1 && i3 != 2) {
                            if (i3 != 3) {
                                if (i3 == 4) {
                                    byte[] safelyAllocate8 = safelyAllocate(3L, MAX_HEADER_SIZE);
                                    rawDataIo.readFully(safelyAllocate8, safelyAllocate8.length);
                                    SubBlockHeader subBlockHeader = new SubBlockHeader(blockHeader, safelyAllocate8);
                                    subBlockHeader.print();
                                    SubBlockHeaderType subType = subBlockHeader.getSubType();
                                    if (subType == null) {
                                        break;
                                    } else {
                                        int i4 = AnonymousClass2.$SwitchMap$com$github$junrar$rarfile$SubBlockHeaderType[subType.ordinal()];
                                        if (i4 != 1) {
                                            if (i4 != 3) {
                                                if (i4 == 6) {
                                                    byte[] safelyAllocate9 = safelyAllocate(subBlockHeader.getHeaderSize(false) - 14, MAX_HEADER_SIZE);
                                                    rawDataIo.readFully(safelyAllocate9, safelyAllocate9.length);
                                                    UnixOwnersHeader unixOwnersHeader = new UnixOwnersHeader(subBlockHeader, safelyAllocate9);
                                                    unixOwnersHeader.print();
                                                    this.headers.add(unixOwnersHeader);
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } else {
                                                byte[] safelyAllocate10 = safelyAllocate(10L, MAX_HEADER_SIZE);
                                                rawDataIo.readFully(safelyAllocate10, safelyAllocate10.length);
                                                EAHeader eAHeader = new EAHeader(subBlockHeader, safelyAllocate10);
                                                eAHeader.print();
                                                this.headers.add(eAHeader);
                                                break;
                                            }
                                        } else {
                                            byte[] safelyAllocate11 = safelyAllocate(8L, MAX_HEADER_SIZE);
                                            rawDataIo.readFully(safelyAllocate11, safelyAllocate11.length);
                                            MacInfoHeader macInfoHeader = new MacInfoHeader(subBlockHeader, safelyAllocate11);
                                            macInfoHeader.print();
                                            this.headers.add(macInfoHeader);
                                            break;
                                        }
                                    }
                                } else {
                                    logger.q("Unknown Header");
                                    throw new NotRarArchiveException();
                                }
                            } else {
                                byte[] safelyAllocate12 = safelyAllocate(blockHeader.getHeaderSize(false) - 11, MAX_HEADER_SIZE);
                                rawDataIo.readFully(safelyAllocate12, safelyAllocate12.length);
                                ProtectHeader protectHeader = new ProtectHeader(blockHeader, safelyAllocate12);
                                long dataSize = protectHeader.getDataSize() + protectHeader.getPositionInFile() + protectHeader.getHeaderSize(isEncrypted());
                                this.channel.setPosition(dataSize);
                                if (!hashSet.contains(Long.valueOf(dataSize))) {
                                    hashSet.add(Long.valueOf(dataSize));
                                    break;
                                } else {
                                    throw new BadRarArchiveException();
                                }
                            }
                        } else {
                            byte[] safelyAllocate13 = safelyAllocate(blockHeader.getHeaderSize(false) - 11, MAX_HEADER_SIZE);
                            try {
                                rawDataIo.readFully(safelyAllocate13, safelyAllocate13.length);
                                FileHeader fileHeader = new FileHeader(blockHeader, safelyAllocate13);
                                this.headers.add(fileHeader);
                                long fullPackSize = fileHeader.getFullPackSize() + fileHeader.getPositionInFile() + fileHeader.getHeaderSize(isEncrypted());
                                this.channel.setPosition(fullPackSize);
                                if (!hashSet.contains(Long.valueOf(fullPackSize))) {
                                    hashSet.add(Long.valueOf(fullPackSize));
                                    break;
                                } else {
                                    throw new BadRarArchiveException();
                                }
                            } catch (EOFException unused) {
                                throw new CorruptHeaderException("Unexpected end of file");
                            }
                        }
                        break;
                }
            } else {
                logger.q("unknown block header!");
                throw new CorruptHeaderException();
            }
        }
    }

    private static byte[] safelyAllocate(long j, int i) {
        if (i >= 0) {
            if (j >= 0 && j <= i) {
                return new byte[(int) j];
            }
            throw new BadRarArchiveException();
        }
        i.h("maxsize must be >= 0");
        return null;
    }

    private void setChannel(SeekableReadOnlyByteChannel seekableReadOnlyByteChannel, long j) {
        this.totalPackedSize = 0L;
        this.totalPackedRead = 0L;
        close();
        this.channel = seekableReadOnlyByteChannel;
        try {
            readHeaders(j);
        } catch (BadRarArchiveException | CorruptHeaderException | UnsupportedRarEncryptedException | UnsupportedRarV5Exception e) {
            logger.p(e);
            throw e;
        } catch (Exception e2) {
            logger.p(e2);
        }
        for (BaseBlock baseBlock : this.headers) {
            if (baseBlock.getHeaderType() == UnrarHeadertype.FileHeader) {
                this.totalPackedSize = ((FileHeader) baseBlock).getFullPackSize() + this.totalPackedSize;
            }
        }
        UnrarCallback unrarCallback = this.unrarCallback;
        if (unrarCallback != null) {
            unrarCallback.volumeProgressChanged(this.totalPackedRead, this.totalPackedSize);
        }
    }

    public void bytesReadRead(int i) {
        if (i > 0) {
            long j = this.totalPackedRead + i;
            this.totalPackedRead = j;
            UnrarCallback unrarCallback = this.unrarCallback;
            if (unrarCallback != null) {
                unrarCallback.volumeProgressChanged(j, this.totalPackedSize);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        SeekableReadOnlyByteChannel seekableReadOnlyByteChannel = this.channel;
        if (seekableReadOnlyByteChannel != null) {
            seekableReadOnlyByteChannel.close();
            this.channel = null;
        }
        Unpack unpack = this.unpack;
        if (unpack != null) {
            unpack.cleanUp();
        }
    }

    public void extractFile(FileHeader fileHeader, OutputStream outputStream) {
        if (this.headers.contains(fileHeader)) {
            try {
                doExtractFile(fileHeader, outputStream);
                return;
            } catch (Exception e) {
                if (e instanceof RarException) {
                    throw ((RarException) e);
                }
                throw new RarException(e);
            }
        }
        throw new HeaderNotInArchiveException();
    }

    public SeekableReadOnlyByteChannel getChannel() {
        return this.channel;
    }

    public List<FileHeader> getFileHeaders() {
        ArrayList arrayList = new ArrayList();
        for (BaseBlock baseBlock : this.headers) {
            if (baseBlock.getHeaderType().equals(UnrarHeadertype.FileHeader)) {
                arrayList.add((FileHeader) baseBlock);
            }
        }
        return arrayList;
    }

    public List<BaseBlock> getHeaders() {
        return new ArrayList(this.headers);
    }

    public InputStream getInputStream(FileHeader fileHeader) {
        if (fileHeader.getFullUnpackSize() <= 0) {
            return new EmptyInputStream();
        }
        PipedInputStream pipedInputStream = new PipedInputStream((int) Math.max(Math.min(fileHeader.getFullUnpackSize(), PIPE_BUFFER_SIZE), 1L));
        v vVar = new v(this, fileHeader, new PipedOutputStream(pipedInputStream), 2);
        if (USE_EXECUTOR) {
            ExtractorExecutorHolder.cachedExecutorService.submit(vVar);
            return pipedInputStream;
        }
        new Thread(vVar).start();
        return pipedInputStream;
    }

    public MainHeader getMainHeader() {
        return this.newMhd;
    }

    public String getPassword() {
        return this.password;
    }

    public UnrarCallback getUnrarCallback() {
        return this.unrarCallback;
    }

    public Volume getVolume() {
        return this.volume;
    }

    public VolumeManager getVolumeManager() {
        return this.volumeManager;
    }

    public boolean isEncrypted() {
        MainHeader mainHeader = this.newMhd;
        if (mainHeader != null) {
            return mainHeader.isEncrypted();
        }
        throw new MainHeaderNullException();
    }

    public boolean isOldFormat() {
        return this.markHead.isOldFormat();
    }

    public boolean isPasswordProtected() {
        if (isEncrypted()) {
            return true;
        }
        return getFileHeaders().stream().anyMatch(new cu(0));
    }

    @Override // java.lang.Iterable
    public Iterator<FileHeader> iterator() {
        return new Iterator<FileHeader>() { // from class: com.github.junrar.Archive.1
            @Override // java.util.Iterator
            public boolean hasNext() {
                Archive archive = Archive.this;
                archive.nextFileHeader = archive.nextFileHeader();
                if (Archive.this.nextFileHeader != null) {
                    return true;
                }
                return false;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.Iterator
            public FileHeader next() {
                FileHeader fileHeader = Archive.this.nextFileHeader;
                Archive archive = Archive.this;
                if (fileHeader != null) {
                    return archive.nextFileHeader;
                }
                return archive.nextFileHeader();
            }
        };
    }

    public FileHeader nextFileHeader() {
        BaseBlock baseBlock;
        int size = this.headers.size();
        do {
            int i = this.currentHeaderIndex;
            if (i < size) {
                List<BaseBlock> list = this.headers;
                this.currentHeaderIndex = i + 1;
                baseBlock = list.get(i);
            } else {
                return null;
            }
        } while (baseBlock.getHeaderType() != UnrarHeadertype.FileHeader);
        return (FileHeader) baseBlock;
    }

    public void setPassword(String str) {
        this.password = str;
    }

    public void setVolume(Volume volume) {
        this.volume = volume;
        setChannel(volume.getChannel(), volume.getLength());
    }

    public void setVolumeManager(VolumeManager volumeManager) {
        this.volumeManager = volumeManager;
    }

    public Archive(File file) {
        this(new FileVolumeManager(file), (UnrarCallback) null, (String) null);
    }

    public Archive(File file, UnrarCallback unrarCallback) {
        this(new FileVolumeManager(file), unrarCallback, (String) null);
    }

    public Archive(File file, String str) {
        this(new FileVolumeManager(file), (UnrarCallback) null, str);
    }

    public Archive(File file, UnrarCallback unrarCallback, String str) {
        this(new FileVolumeManager(file), unrarCallback, str);
    }

    public Archive(InputStream inputStream) {
        this(new InputStreamVolumeManager(inputStream), (UnrarCallback) null, (String) null);
    }

    public Archive(InputStream inputStream, UnrarCallback unrarCallback) {
        this(new InputStreamVolumeManager(inputStream), unrarCallback, (String) null);
    }

    public Archive(InputStream inputStream, String str) {
        this(new InputStreamVolumeManager(inputStream), (UnrarCallback) null, str);
    }

    public Archive(InputStream inputStream, UnrarCallback unrarCallback, String str) {
        this(new InputStreamVolumeManager(inputStream), unrarCallback, str);
    }
}
