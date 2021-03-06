package raft.core;

import raft.protocol.*;
/**
 * @author ruanxin
 * @create 2018-02-08
 * @desc 一致性算法
 */
public interface RaftConsensusService {

    /**
     * leader election
     */
    public RaftResponse leaderElection(VotedRequest request);

    /**
     * reset timeout
     */
    public void resetTimeOut();

    /**
     * append entry
     */
    public RaftResponse appendEntry (AddRequest request);


}
